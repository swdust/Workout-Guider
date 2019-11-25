package br.com.novaroma.workoutguider.apresentacao;

import javax.swing.JPanel;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Exercicio;
import javax.swing.JList;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;

public class RemoverExercicio extends JPanel {

	public RemoverExercicio() throws ClassNotFoundException, IOException {
		setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(166, 243, 159, 28);
		add(comboBox);

		JButton confirmarExclusao = new JButton("Excluir");
		confirmarExclusao.setBounds(166, 282, 159, 31);
		add(confirmarExclusao);

		JTextPane txtpnSelecioneUmExerccio = new JTextPane();
		txtpnSelecioneUmExerccio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSelecioneUmExerccio.setEditable(false);
		txtpnSelecioneUmExerccio.setText("Selecione um exerc\u00EDcio:");
		txtpnSelecioneUmExerccio.setBounds(166, 201, 222, 31);
		add(txtpnSelecioneUmExerccio);

		ArquivoGeral arq = new ArquivoGeral(new Exercicio());
		ArrayList<Exercicio> colecao = arq.retornaColecao();
		String[] nomes = new String[colecao.size()];
		int cont = 0;
		for (Exercicio ex : colecao) {
			comboBox.addItem(ex.getNome());
		}

	}
}
