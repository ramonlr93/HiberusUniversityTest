package Apis;

import modelo.Pet;
import modelo.Tag;
import Stepdefs.Global;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.junit.Assert.assertTrue;


public class PetEndpoint extends BaseEndpoints {
	private final String PET_ENDPOINT_PATH = "pet/";
	private Pet defaultPet;

	public PetEndpoint() {
		super();
		defaultPet = new Pet();
	}

	public String getPath() {
		return this.PET_ENDPOINT_PATH;
	}

	public Pet getDefaultPet() {
		return this.defaultPet;
	}

	public Response addPetWithBody(RequestSpecification request, String body) {
		String url =  getBaseUrl() + this.getPath();
		request.body(body);
		return sendRequest(request, BaseEndpoints.POST_REQUEST, url, null);
	}

	
	public void addPet(Global global, Pet pet) {
		global.setRequest(getRequestWithJSONHeaders());
		global.setResponse(addPet(global.getRequest(), pet));
	}



	public Response addPet(RequestSpecification request, Pet pet) {
		if(pet == null) pet = this.getDefaultPet();
		String url = getBaseUrl() + this.getPath();
		return sendRequest(request, BaseEndpoints.POST_REQUEST, url, pet);
	}

	public Response deletePet(RequestSpecification request, Pet pet) {
		if(pet == null) pet = this.defaultPet;
		String id = pet.getId().toString();
		String url = getBaseUrl() + this.getPath() + id;
		return sendRequest(request, BaseEndpoints.DELETE_REQUEST, url, null);
	}

	public Response getPetById(RequestSpecification request) {
		return getPetById(request, getDefaultPet().getId().toString());
	}

	public Response getPetById(RequestSpecification request, String id) {
		String url = getBaseUrl() + this.getPath() + id;
		return sendRequest(request, BaseEndpoints.GET_REQUEST, url, null);
	}

	public void verificaValoresPet(Response response, Pet pet) {
		String expectedId = pet.getId().toString();
		String expectedName = pet.getName();
		String expectedStatus = pet.getStatus();


		verificaColumnaValor("id", expectedId, response);
		verificaColumnaValor("name", expectedName, response);
		verificaColumnaValor("status", expectedStatus, response);
	}
	
	public void verificaPetTieneId(Response response) {
		String idVal = response.jsonPath().getString("id");
		assertTrue(idVal != null);
		assertTrue(!idVal.equalsIgnoreCase(""));
		assertTrue(Long.parseLong(idVal) > 0);
	}

}
