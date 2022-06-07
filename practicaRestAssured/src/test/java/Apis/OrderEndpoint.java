package Apis;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import modelo.Order;

public class OrderEndpoint extends BaseEndpoints{
	private final String ORDER_ENDPOINT_PATH = "store/order/";
	private Order ordenPredeterminada;
	
	public OrderEndpoint() {
		super();
		ordenPredeterminada = new Order();
	}
	
	public String getPath() {
		return this.ORDER_ENDPOINT_PATH;
	}
	
	public Response getOrderById(RequestSpecification request, String id) {
		String url = getBaseUrl() + this.getPath() + id;
		return sendRequest(request, BaseEndpoints.GET_REQUEST, url, null);
	}
	

	
	public Response seteaOrder(RequestSpecification request, Order order) {
		if(order == null) order = ordenPredeterminada;
		String url = getBaseUrl() + this.getPath();
		return sendRequest(request, BaseEndpoints.POST_REQUEST, url, order);
	}
	
	public Order recuperaOrderPredeterminada() {
		return this.ordenPredeterminada;
	}
	
	public void verificaValoresOrder(Response response, Order order) {
		String id = order.getId().toString();
		String petId = Integer.toString(order.getPetId());
		String quantity = Integer.toString(order.getQuantity());
		String shipDate = order.getShipDate().replace("Z", "+0000");;
		String status = order.getStatus();
		String complete = Boolean.toString(order.getComplete());
		
		verificaColumnaValor("id", id, response);
		verificaColumnaValor("petId", petId, response);
		verificaColumnaValor("quantity", quantity, response);
		verificaColumnaValor("shipDate", shipDate, response);
		verificaColumnaValor("status", status, response);
		verificaColumnaValor("complete",complete, response);
		
	}

}
