package api.spring.restassured.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import api.spring.restassured.objects.NovaMensagemObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NovaMensagemTest {
	
	//Caso altere a porta, altere a url:
	private Response response = RestAssured.get("http://localhost:8088/api/message");
	
	@Test
	public void adicionarMensagem() {
		
		//Informe a mensagem desejada
		String mensagem = "Eu posso conquistar tudo o que eu me comprometo.";
		
		response = NovaMensagemObject.inserir(mensagem);
		assertEquals(200, response.getStatusCode());
		System.out.println("Status code: " + response.getStatusCode() + "\n");
		System.out.println(response.getBody().asString());
	
		
	}
	
}
