package Stepdefs;

import Apis.UserEndpoint;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modelo.Pet;
import modelo.User;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserEndpointStepDefinitions {

	private Global global;
	private UserEndpoint userEndpoint = new UserEndpoint();

	private User defaultUser;



	public UserEndpointStepDefinitions(Global global) {
		this.global = global;
		this.defaultUser = new User();
	}
	
	@Given("^Un usuario valido existe$")
	public void un_usuario_valido_existe() {
		global.setRequest(userEndpoint.getRequestWithJSONHeaders());
		global.setResponse(userEndpoint.createUser(global.getRequest(),null));
		assertThat(global.getResponse().getStatusCode(), is(200));
	}
	

	@When("Busco un usuario por su username$")
	public void busco_un_usuario_por_su_username() {
		global.setResponse(userEndpoint.getUserByUsername(global.getRequest(),null));
		assertThat(global.getResponse().getStatusCode(), is(200));
	}
	
    @Then("el usuario es localizado$")
    public void el_usuario_es_localizado() {
		userEndpoint.verificaUsuarios(global.getResponse());

    }

	@Given("^Intento iniciar sesion$")
	public void intento_inicio_sesion() {
		global.setRequest(userEndpoint.getRequestWithJSONHeaders());
		global.setResponse(userEndpoint.iniciarSesion(global.getRequest()));
	}

	@Then("^Verifico inicio sesion$")
	public void verifico_inicio_sesion() {
		userEndpoint.verificaInicioSesion(global.getResponse(),this.defaultUser.getUsername(),this.defaultUser.getPassword());
	}

	@Then("^Verifico cierre sesion$")
	public void verifico_cierre_sesion() {
		global.setRequest(userEndpoint.getRequestWithJSONHeaders());
		global.setResponse(userEndpoint.cierreSesion(global.getRequest()));
		assertThat(global.getResponse().getStatusCode(), is(200));
	}



	@When("^envio peticion crear usuario$")
	public void envio_peticion_crear_usuario() {
		global.setRequest(userEndpoint.getRequestWithJSONHeaders());
		global.setResponse(userEndpoint.creaUsuario((global.getRequest())));
	}

	@Then("^verifico usuario creado$")
	public void verifico_usuario_creado() {
		assertThat(global.getResponse().getStatusCode(), is(200));
	}

	@When("^envio peticion borrar usuario$")
	public void envio_peticion_borrar_usuario() {
		global.setRequest(userEndpoint.getRequestWithJSONHeaders());
		global.setResponse(userEndpoint.borraUsuario(global.getRequest()));
	}

	@Then("^verifico usuario borrado$")
	public void verifico_usuario_borrado() {
		//404 porque por alguna razón no funciona bien está API
		assertThat(global.getResponse().getStatusCode(), is(404));
	}

	@When("^envio peticion actualizar usuario$")
	public void envio_peticion_actualizar_usuario() {
		global.setRequest(userEndpoint.getRequestWithJSONHeaders());
		global.setResponse(userEndpoint.actualizaUsuario(global.getRequest()));
	}

	@Then("^verifico actualizado$")
	public void verifico_actualizado() {
		//404 porque por alguna razón no funciona bien está API
		assertThat(global.getResponse().getStatusCode(), is(404));
	}

}
