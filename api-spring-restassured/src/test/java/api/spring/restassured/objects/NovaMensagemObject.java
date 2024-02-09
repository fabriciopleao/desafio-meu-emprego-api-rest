package api.spring.restassured.objects;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NovaMensagemObject {

	private static RequestSpecification request;
	private static JSONObject json;
	private static Response response;
	
	//Método para inserir a mensagem desejada
	public static Response inserir(String mensagem) {
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		json = new JSONObject();
		json.put("mensagem", mensagem);
		request.body(json.toJSONString());
		
		//Caso altere a porta, altere a url:
		response = request.post("http://localhost:8088/api/message");
		
		return response;
	}
	
	
}
