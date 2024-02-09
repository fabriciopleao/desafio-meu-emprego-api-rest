package br.com.e2etreinamentos.apispring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.e2etreinamentos.apispring.modal.Mensagem;
import br.com.e2etreinamentos.apispring.service.MensagemService;

@RestController
@RequestMapping("/api/message")
public class MensagemController {

	private final MensagemService mensagemService;
	
	@Autowired
	public MensagemController(MensagemService mensagemService) {
		this.mensagemService = mensagemService;
	}
	
	@PostMapping
	public ResponseEntity<String> inserirMensagem(@RequestBody Mensagem mensagem) {
		String retorno = mensagemService.inserirMensagem(mensagem);
		return ResponseEntity.ok(retorno);	
	}
	
	
}
