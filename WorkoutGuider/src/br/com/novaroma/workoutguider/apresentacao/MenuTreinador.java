package br.com.novaroma.workoutguider.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class MenuTreinador extends JFrame {

	private JPanel contentPane;
	JLayeredPane layeredPane;
	/**
	 * Launch the application.
	 */
	public static JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTreinador window = new MenuTreinador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	
	public MenuTreinador() throws ClassNotFoundException, IOException, ParseException {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnTreinador = new JMenu("Treinador");
		menuBar.add(mnTreinador);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenu mnExercicio = new JMenu("Exercicio");
		menuBar.add(mnExercicio);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnExercicio.add(mntmListar);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mnExercicio.add(mntmCadastrar);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mnExercicio.add(mntmAlterar);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mnExercicio.add(mntmExcluir);
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Workout Guider");
		frame.setBounds(0, 0, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaLogin telaLogin = new TelaLogin();
		frame.setContentPane(telaLogin);
		telaLogin.setLayout(null);
	}
}
