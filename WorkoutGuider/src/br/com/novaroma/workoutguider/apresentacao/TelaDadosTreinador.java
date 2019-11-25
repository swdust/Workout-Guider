package br.com.novaroma.workoutguider.apresentacao;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.novaroma.workoutguider.utils.*;
import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Treinador;

public class TelaDadosTreinador extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public TelaDadosTreinador() {
		setLayout(null);
		
		//arq.alteraObjeto(TelaLogin.t1, objetoAlterado);
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(26, 61, 36, 32);
		add(lblNome);
		
		textField = new JTextField();
		textField.setText(TelaLogin.t1.getNome());    
		textField.setBounds(62, 73, 118, 32);
		add(textField);
		textField.setColumns(10);

	}
}
