/*package br.com.novaroma.workoutguider.utils;

import java.io.IOException;

import br.com.novaroma.workoutguider.dados.ArquivoExercicio;
import br.com.novaroma.workoutguider.entidades.Exercicios;
import br.com.novaroma.workoutguider.entidades.Treino;

public class VetorAjustavel extends ArquivoExercicio {

	public VetorAjustavel() {
	}

	// Método de array ajustável

	public Exercicios[] ajusteArray(Exercicios[] value) throws IOException, ClassNotFoundException {

		Exercicios[] arrayTemporario = new Exercicios[value.length + 1];
		System.arraycopy(value, 0, arrayTemporario, 0, value.length);
		value = arrayTemporario;
		return value;

	}

	public Treino[] ajusteArrayTreino(Treino[] value) throws IOException, ClassNotFoundException {

		Treino[] arrayTemporarioValor = new Treino[value.length + 1];
		System.arraycopy(value, 0, arrayTemporarioValor, 0, value.length);
		value = arrayTemporarioValor;
		return value;

	}
}*/