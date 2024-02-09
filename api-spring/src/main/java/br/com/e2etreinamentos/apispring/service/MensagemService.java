package br.com.e2etreinamentos.apispring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.e2etreinamentos.apispring.modal.Mensagem;

@Service
public class MensagemService {

	private final List<Mensagem> mensagens = new ArrayList<>();
	private boolean mensagemEncontrada = false;

	public String inserirMensagem(Mensagem mensagem) {
		mensagens.add(mensagem);
		return "Mensagem inserida com sucesso: " + mensagem.getMensagem();
	}

	public void apagarMensagem(Mensagem mensagem) {
		for (int i = 0; i < mensagens.size(); i++) {
	        Mensagem mensagemAtual = mensagens.get(i);
	        if (mensagemAtual.equals(mensagem)) {
	            mensagens.remove(i);
	            mensagemEncontrada = true;
	            System.out.println("Mensagem excluída com sucesso: " + mensagemAtual.getMensagem());
	            break;
			}
		}
		if (!mensagemEncontrada) {
			throw new IllegalArgumentException("Mensagem não encontrada.");
		}

	}

	public List<Object> consultarMensagens() {
		if (mensagens.isEmpty()) {
			List<Object> listaVazia = new ArrayList<Object>();
			listaVazia.add("Lista de mensagens vazia.");
			return listaVazia;
		} else {
			return new ArrayList<>(mensagens);
		}

	}
}
