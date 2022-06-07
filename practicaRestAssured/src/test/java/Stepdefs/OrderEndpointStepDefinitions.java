package Stepdefs;


import Apis.OrderEndpoint;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modelo.Order;
import modelo.Pet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OrderEndpointStepDefinitions {

	private Global global;
	private OrderEndpoint orderEndpoint = new OrderEndpoint();

	public OrderEndpointStepDefinitions(Global global) {
		this.global = global;
	}

	@When("^Busco un pedido con el identificador '(.*?)'$")
	public void busco_un_pedido_con_el_identificador(String id) {
		global.setRequest(orderEndpoint.getRequestWithJSONHeaders());
		global.setResponse(orderEndpoint.getOrderById(global.getRequest(),id));
	}

	@When("^Creo un pedido de mascota con el identificador '(\\d+)'$")
	public void creo_un_pedido_de_mascota_con_el_identificador(Integer orderId) {
		global.setRequest(orderEndpoint.getRequestWithJSONHeaders());
		global.setResponse(orderEndpoint.seteaOrder(global.getRequest(), new Order(orderId, 0, 1, "2019-02-05T14:11:44.922Z", "placed", false)));
	}

	@Then("^La respuesta del pedido tiene '(\\d+)' response code$")
	public void la_respuesta_del_pedido_tiene(Integer rc) {
		assertThat(global.getResponse().getStatusCode(), is(rc.intValue()));
	}

	@Then("^La respuesta del pedido contiene la información correcta$")
	public void la_respuesta_del_pedido_tiene_la_informacion_correcta() {
		orderEndpoint.verificaColumnaValor("id", "58", global.getResponse());
	}

	@Given("^el pedido existe para una mascota$")
	public void el_pedido_existe_para_una_mascota() {
		global.setRequest(orderEndpoint.getRequestWithJSONHeaders());
		global.setResponse(orderEndpoint.seteaOrder(global.getRequest(),null));
		assertThat(global.getResponse().getStatusCode(), is(200));
	}

	@When("^busco el pedido según identificador$")
	public void busco_pedido_segun_identificador() {
		global.setResponse(orderEndpoint.getOrderById(global.getRequest(), orderEndpoint.recuperaOrderPredeterminada().getId().toString()));
	}

	@Then("^el pedido completo es devuelto$")
	public void el_pedido_completo_es_devuelto() {
		orderEndpoint.verificaValoresOrder(global.getResponse(), orderEndpoint.recuperaOrderPredeterminada());
	}
	
	@Then("^Puedo pedir un gato$")
	public void puedo_pedir_un_gato() {
		global.setResponse(orderEndpoint.seteaOrder(global.getRequest(), new Order(33, new Pet().getId(), 1, "2019-02-05T14:11:44.922Z", "placed", false)));
		assertThat(global.getResponse().getStatusCode(), is(200));
	}
}
