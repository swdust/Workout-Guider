package br.com.novaroma.workoutguider.negocio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Exercicio;

public class ExercicioNegocio {
	File arquivoExercicio = new File("exercicio.txt");
	ArquivoGeral dados = new ArquivoGeral(new Exercicio());
	Cliente cliente = new Cliente();
	ArrayList<Exercicio> colecao = new ArrayList<Exercicio>();
	ArrayList<Cliente> colecaoCliente = new ArrayList<Cliente>();

	public boolean existeExercicio(String nome) throws ClassNotFoundException, IOException {
		
		if (!arquivoExercicio.exists()) {
			return false;
		}
		
		
		colecao = dados.retornaColecao();
		for (Exercicio ex : colecao) {
			if (ex.getNome().equals(nome)) {
				return true;
			} else if (ex.getNome() != nome) {
				return false;
			}
		}
		return false;
	}

	public boolean repeticao(int rep) {
		if (rep > 1 && rep <= 100) {
			return true;
		}
		return false;
	}

	public boolean serie(int serie) {
		if (serie > 0 && serie <= 5) {
			return true;
		}
		return false;
	}

	public boolean dificuldade(int dificuldade) {
		return true;
	}

	public boolean contraIndicacao(boolean[] contraindicacao) {
		return true;
	}
	
	public void match() throws ClassNotFoundException, IOException {
		
		colecao = dados.retornaColecao();
		colecaoCliente = dados.retornaColecao();
		
		for (Exercicio ex : colecao) {
			if (ex.getContra().equals("|Asma |") && cliente.getImc() >= 1) {
				colecao.add(0, ex);
				dados.gravaColecao(colecao);
			} else if (ex.getContra().equals("|Cardiopatia |")) {
				colecao.add(0, ex);
				dados.gravaColecao(colecao);
			} else if (ex.getContra().equals("|Diabetes |")) {
				colecao.add(0, ex);
				dados.gravaColecao(colecao);
			} else if (ex.getContra().equals("|Osteoporose |")) {
				colecao.addAll(colecao.indexOf(ex.getContra().equals("|Osteoporose |" )), colecao);
				dados.gravaColecao(colecao);
			}
		}

	}
}
