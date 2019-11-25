package br.com.novaroma.workoutguider.apresentacao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class TelaDadosCliente extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	public TelaDadosCliente() {
		setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNome.setBounds(328, 172, 73, 34);
		add(lblNome);
		
		textField = new JTextField();
		textField.setText((String) null);
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(413, 176, 169, 32);
		add(textField);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblLogin.setBounds(328, 234, 73, 34);
		add(lblLogin);
		
		textField_1 = new JTextField();
		textField_1.setText((String) null);
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(413, 238, 169, 32);
		add(textField_1);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblIdade.setBounds(328, 294, 73, 34);
		add(lblIdade);
		
		textField_2 = new JTextField();
		textField_2.setText((String) null);
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(413, 298, 169, 32);
		add(textField_2);
		
		JLabel label = new JLabel("Visualizar Dados");
		label.setFont(new Font("Verdana", Font.PLAIN, 32));
		label.setBounds(532, 28, 283, 63);
		add(label);
		
		textField_3 = new JTextField();
		textField_3.setText((String) null);
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(413, 356, 169, 32);
		add(textField_3);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblEmail.setBounds(328, 352, 73, 34);
		add(lblEmail);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblCpf.setBounds(328, 411, 73, 34);
		add(lblCpf);
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setForeground(Color.DARK_GRAY);
		textField_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(413, 415, 169, 32);
		add(textField_4);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblSexo.setBounds(328, 476, 73, 34);
		add(lblSexo);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblAltura.setBounds(753, 172, 73, 34);
		add(lblAltura);
		
		textField_6 = new JTextField();
		textField_6.setText((String) null);
		textField_6.setForeground(Color.DARK_GRAY);
		textField_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_6.setColumns(10);
		textField_6.setBounds(827, 174, 169, 32);
		add(textField_6);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblPeso.setBounds(753, 234, 73, 34);
		add(lblPeso);
		
		textField_7 = new JTextField();
		textField_7.setText((String) null);
		textField_7.setForeground(Color.DARK_GRAY);
		textField_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_7.setColumns(10);
		textField_7.setBounds(827, 238, 169, 32);
		add(textField_7);
		
		JLabel lblImc = new JLabel("IMC:");
		lblImc.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblImc.setBounds(753, 294, 73, 34);
		add(lblImc);
		
		textField_8 = new JTextField();
		textField_8.setText((String) null);
		textField_8.setForeground(Color.DARK_GRAY);
		textField_8.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(827, 298, 169, 32);
		add(textField_8);
		
		JLabel lblTempoDisponvel = new JLabel("Tempo Dispon\u00EDvel: ");
		lblTempoDisponvel.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblTempoDisponvel.setBounds(633, 354, 193, 34);
		add(lblTempoDisponvel);
		
		textField_9 = new JTextField();
		textField_9.setText((String) null);
		textField_9.setForeground(Color.DARK_GRAY);
		textField_9.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_9.setColumns(10);
		textField_9.setBounds(827, 358, 169, 32);
		add(textField_9);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(413, 487, 115, 18);
		add(rdbtnFeminino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(413, 503, 115, 18);
		add(rdbtnMasculino);
		
		JLabel lblDoenas = new JLabel("Doen\u00E7as:");
		lblDoenas.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblDoenas.setBounds(711, 411, 115, 34);
		add(lblDoenas);
		
		JCheckBox chckbxAsma = new JCheckBox("Asma");
		chckbxAsma.setBounds(827, 411, 105, 18);
		add(chckbxAsma);
		
		JCheckBox chckbxCardiopatia = new JCheckBox("Cardiopatia");
		chckbxCardiopatia.setBounds(827, 439, 105, 18);
		add(chckbxCardiopatia);
		
		JCheckBox chckbxDiabetes = new JCheckBox("Diabetes");
		chckbxDiabetes.setBounds(827, 468, 105, 18);
		add(chckbxDiabetes);
		
		JCheckBox chckbxOsteoporose = new JCheckBox("Osteoporose");
		chckbxOsteoporose.setBounds(827, 492, 105, 18);
		add(chckbxOsteoporose);

	}
}
