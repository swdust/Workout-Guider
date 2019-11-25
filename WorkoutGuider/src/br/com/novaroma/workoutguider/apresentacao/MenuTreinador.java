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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTreinador frame = new MenuTreinador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */

	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public MenuTreinador() throws ClassNotFoundException, IOException, ParseException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1264, 660);
		contentPane.add(layeredPane);

		AdicionarExercicio adicionarEx = new AdicionarExercicio();
		adicionarEx.setBounds(0, 0, 1264, 660);
		layeredPane.add(adicionarEx);

		ListarExercicios listarEx = new ListarExercicios();
		listarEx.setBounds(0, 0, 1264, 660);
		layeredPane.add(listarEx);

		RemoverExercicio removerEx = new RemoverExercicio();
		removerEx.setBounds(0, 0, 1264, 660);
		layeredPane.add(removerEx);

		ListarClientes listarCl = new ListarClientes();
		listarCl.setBounds(0, 0, 1264, 660);
		layeredPane.add(listarCl);

		TelaDadosTreinador dadosT = new TelaDadosTreinador();
		dadosT.setBounds(0, 0, 1264, 660);
		layeredPane.add(dadosT);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnTreinador = new JMenu("Treinador");
		menuBar.add(mnTreinador);

		JMenuItem mntmVisualizarCadastro = new JMenuItem("Visualizar cadastro");
		mntmVisualizarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(dadosT);
			}
		});
		mnTreinador.add(mntmVisualizarCadastro);

		JMenuItem mntmAlterarCadastro = new JMenuItem("Alterar cadastro");
		mnTreinador.add(mntmAlterarCadastro);

		JMenuItem mntmExcluirConta = new JMenuItem("Excluir conta");
		mnTreinador.add(mntmExcluirConta);

		JSeparator separator = new JSeparator();
		mnTreinador.add(separator);

		JMenuItem mntmVoltar = new JMenuItem("Voltar");
		mntmVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.getFrame().setVisible(true);
				dispose();
			}
		});
		mnTreinador.add(mntmVoltar);

		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);

		JMenuItem mntmVisualizar = new JMenuItem("Listar");
		mntmVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(listarCl);
			}
		});
		mnCliente.add(mntmVisualizar);

		JMenuItem mntmRemover = new JMenuItem("Remover");
		mnCliente.add(mntmRemover);

		JMenu mnExercicios = new JMenu("Exercicios");
		menuBar.add(mnExercicios);

		JMenuItem mntmAdicionar = new JMenuItem("Adicionar");
		mntmAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(adicionarEx);
			}
		});
		mnExercicios.add(mntmAdicionar);

		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(listarEx);
			}
		});
		mnExercicios.add(mntmListar);

		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mnExercicios.add(mntmAlterar);

		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(removerEx);
			}
		});
		mnExercicios.add(mntmExcluir);

	}
}
