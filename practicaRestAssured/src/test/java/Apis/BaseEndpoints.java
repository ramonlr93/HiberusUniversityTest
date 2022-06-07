package Apis;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BaseEndpoints {

	public static final int GET_REQUEST = 0;
	public static final int POST_REQUEST = 1;
	public static final int DELETE_REQUEST = 2;
	public static final int PUT_REQUEST = 3;

	protected final String base_url = "https://petstore.swagger.io/v2/";

	public BaseEndpoints() {
	}

	public void verificaColumnaValor(String key, String val, Response r) {
		String keyValue = r.jsonPath().getString(key);
		assertThat(keyValue, is(val));
	}


	public String getBaseUrl() {
		return this.base_url;
	}


	public RequestSpecification getRequestWithJSONHeaders() {
		RequestSpecification r = RestAssured.given();
		r.header("Content-Type", "application/json");
		return r;
	}

	public Response sendRequest(RequestSpecification request, int requestType, String url, Object pojo) {
		Response response = null;

		// Si hay JSON, lo añademos al body
		if (null != pojo) {
			String payload = new JSONObject(pojo).toString();
			request.body(payload);
		}

		// Evaluamos que tipo de petición es
			switch (requestType) {
				case BaseEndpoints.GET_REQUEST:
					response = request.get(url);
					break;
				case BaseEndpoints.POST_REQUEST:
					response = request.post(url);
					break;
				case BaseEndpoints.DELETE_REQUEST:
					response = request.delete(url);
					break;
				case BaseEndpoints.PUT_REQUEST:
					response = request.put(url);
					break;
				default:
					response = request.post(url);
					break;

			}
		return response;
	}
}
