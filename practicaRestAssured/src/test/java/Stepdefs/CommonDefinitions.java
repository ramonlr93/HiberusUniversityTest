package Stepdefs;

import Apis.BaseEndpoints;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommonDefinitions {
	
	private Global global;
	private BaseEndpoints baseEndpoints = new BaseEndpoints();
	
	public CommonDefinitions(Global global) {
		this.global = global;
	}
	
	@Given("^La API está disponible$") 
	public void la_api_esta_disponible() {
		String url = baseEndpoints.getBaseUrl() + "swagger.json";
		RestAssured.when().get(url).then().statusCode(200);
		//baseEndpoints.sendRequest(null, BaseEndpoints.GET_REQUEST, url, null).then().statusCode(200);
	}
	
	@Then("^las respuestas contendrán el valor '(.*?)'para el campo'(.*?)'$")
	public void muestro_las_definiciones_correctas(String val, String key) {
		String keyValue = global.getResponse().jsonPath().getString(key);
		assertThat(keyValue, is(val));
	}

}
