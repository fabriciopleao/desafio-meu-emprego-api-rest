package br.com.e2etreinamentos.apispring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.e2etreinamentos.apispring.modal.Mensagem;

@Service
public class MensagemService {

	private final List<Mensagem> mensagens = new ArrayList<>();

	public String inserirMensagem(Mensagem mensagem) {
		mensagens.add(mensagem);
		return "Mensagem inserida com sucesso: " + mensagem.getMensagem();
	}

	
}
