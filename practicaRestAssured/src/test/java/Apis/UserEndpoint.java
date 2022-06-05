package Apis;

import io.restassured.path.json.JsonPath;
import modelo.User;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class UserEndpoint extends BaseEndpoints {
	private final String USER_ENDPOINT_PATH = "user/";
	private User defaultUser;
	
	public UserEndpoint() {
		super();
		defaultUser = new User();
	}
	
	public String getPath() {
		return this.USER_ENDPOINT_PATH;
	}
	
	public User getDefaultUser() {
		return this.defaultUser;
	}

	
	public Response getUserByUsername(RequestSpecification request, String username) {
		if(username == null) username = getDefaultUser().getUsername();
		String url = getBaseUrl() + this.getPath() + username;
		return sendRequest(request, BaseEndpoints.GET_REQUEST, url, null);
	}
	
	public Response createUser(RequestSpecification request, User user) {
		if(user == null) user = defaultUser;
		String url = getBaseUrl() + this.getPath();
		return sendRequest(request, BaseEndpoints.POST_REQUEST, url, user);
	}

	public void verificaUsuarios(Response response) {
		String idVal = response.jsonPath().getString("id");
		assertTrue(idVal != null);
		assertTrue(!idVal.equalsIgnoreCase(""));
		assertTrue(Long.parseLong(idVal) > 0);
	}

	public Response iniciarSesion(RequestSpecification req) {
		String url = getBaseUrl() + this.getPath() +"login?username=" + this.defaultUser.getUsername() + "&password=" + this.defaultUser.getPassword();;
		return sendRequest(req, BaseEndpoints.GET_REQUEST, url,null);
	}

	public Response cierreSesion(RequestSpecification req) {
		String url = getBaseUrl() + this.getPath() +"logout";
		return sendRequest(req, BaseEndpoints.GET_REQUEST, url,null);
	}

	public String verificaInicioSesion(Response res, String username, String password) {
		JsonPath jp = res.jsonPath();
		Assert.assertEquals("Status Check Failed!", 200, res.getStatusCode());
		Assert.assertTrue(jp.get("message").toString().contains("logged in user session:"));
		return "Status check passed > Response "+ res.getStatusCode();
	}

	public Response creaUsuario(RequestSpecification req) {
		String url = getBaseUrl() + this.getPath();
		return sendRequest(req, BaseEndpoints.POST_REQUEST, url,this.defaultUser);

	}



	public Response actualizaUsuario(RequestSpecification req) {
		String url = getBaseUrl() + this.getPath() +"/" + this.defaultUser.getUsername();
		this.defaultUser.setFirstname("Nombre2");
		return sendRequest(req, BaseEndpoints.PUT_REQUEST, url,this.defaultUser);
	}


	public Response borraUsuario(RequestSpecification req) {
		String url = getBaseUrl() + this.getPath() +"/" + this.defaultUser.getUsername();;
		return sendRequest(req, BaseEndpoints.DELETE_REQUEST, url,null);
	}


}
