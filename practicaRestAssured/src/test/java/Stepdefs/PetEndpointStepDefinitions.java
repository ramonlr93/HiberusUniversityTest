package Stepdefs;

import Apis.PetEndpoint;
import modelo.Pet;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PetEndpointStepDefinitions {

	private Global global;
	private PetEndpoint petEndpoint = new PetEndpoint();

	public PetEndpointStepDefinitions(Global global) {
		this.global = global;
	}

	@When("^Añado una mascota al sistema$")
	public void inserto_mascota_en_el_sistema() {
		petEndpoint.addPet(global,null);
	}

	@Then("^la peticion máscota tiene '(\\d+)' response code$")
	public void la_peticion_mascota_tiene_el_status(Integer rc) {
		assertThat(global.getResponse().getStatusCode(), is(rc.intValue()));
	}

	@Then("^la respuesta de la mascota contiene la informacion correcta$")
	public void la_informacion_de_la_mascota_contiene_la_informacion_correcta() {
		petEndpoint.verificaValoresPet(global.getResponse(), petEndpoint.getDefaultPet());
	}

	@Given("^la mascota existe$")
	public void la_mascota_existe() {
		petEndpoint.addPet(global,null);
		assertThat(global.getResponse().getStatusCode(), is(200));
	}

	@When("^Borro la mascota$")
	public void borro_la_mascota() {
		global.setResponse(petEndpoint.deletePet(global.getRequest(),null));
	}

	@When("^entonces busco mascota por su identificador$")
	public void entonces_busco_mascota_por_su_identificador() {
		global.setResponse(petEndpoint.getPetById(global.getRequest()));
	}

	@Given("^el gato está'(.*?)'$")
	public void el_gato_esta(String availability) {
		petEndpoint.addPet(global,
				new Pet(16, "7:feline", "Pussy Cat", "17:Furry", availability));
	}

	@Then("^Puedo añadir una mascota con muchas etiquetas$")
	public void puedo_insertar_mascota_con_varias_etiquetas() {
		petEndpoint.addPet(global, new Pet(16, "45:rodent", "Rat", "17:Furry,29:cute,33:Small", "available"));
		assertThat(global.getResponse().getStatusCode(), is(200));
	}

	@Then("^Puedo insertar una mascota sin etiquetas$")
	public void puedo_insertar_una_mascota_sin_etiquetas() {
		petEndpoint.addPet(global, new Pet(16, "45:rodent", "Rat", "", "available"));
		assertThat(global.getResponse().getStatusCode(), is(200));
	}

	@When("^Añado una mascota al sistema sin identificador$")
	public void inserto_mascota_sin_identificador() {
		petEndpoint.addPet(global,
				new Pet(null, "45:rodent", "Rat", "17:Furry,29:cute,33:Small", "available"));
	}

	@Then("^Un id es autogenerado para la mascota$")
	public void un_id_es_autogenerado_para_la_mascota() {
		petEndpoint.verificaPetTieneId(global.getResponse());
	}

	@When("^Añado una mascota y la información es incorrecta '(.*?)'$")
	public void inserto_mascota_y_info_es_incorrecta(String body) {
		global.setRequest(petEndpoint.getRequestWithJSONHeaders());
		global.setResponse(petEndpoint.addPetWithBody(global.getRequest(), body));
	}

}
