package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import model.Fila;
import model.Item;
import controller.MainController;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frmGerenciadorDeSenhas;
	private MainController jController;
	JLabel lblNewLabel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmGerenciadorDeSenhas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
		// criar referencia de um controller para janela principal
		jController = new MainController();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGerenciadorDeSenhas = new JFrame();
		frmGerenciadorDeSenhas.setTitle("Gerenciador de Senhas");
		frmGerenciadorDeSenhas.setBounds(100, 100, 632, 176);
		frmGerenciadorDeSenhas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGerenciadorDeSenhas.getContentPane().setLayout(null);
		
		JLabel lblRetiradaDeSenha = new JLabel("RETIRADA DE SENHA");
		lblRetiradaDeSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblRetiradaDeSenha.setBounds(67, 28, 149, 16);
		frmGerenciadorDeSenhas.getContentPane().add(lblRetiradaDeSenha);
		
		JButton btnNewButton = new JButton("Serviço Normal");

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				jController.retirarSenhaNormal();
			}
		});
		btnNewButton.setBounds(67, 56, 149, 29);
		frmGerenciadorDeSenhas.getContentPane().add(btnNewButton);
		
		JButton btnServioPreferencial = new JButton("Serviço Preferencial");
		btnServioPreferencial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jController.retirarSenhaPreferencial();
			}
		});
		btnServioPreferencial.setBounds(67, 97, 149, 29);
		frmGerenciadorDeSenhas.getContentPane().add(btnServioPreferencial);
		
		JLabel lblChamarSenha = new JLabel("CHAMAR SENHA");
		lblChamarSenha.setBounds(292, 28, 103, 16);
		frmGerenciadorDeSenhas.getContentPane().add(lblChamarSenha);
		
		JButton btnChamarFila = new JButton("Chamar Fila");
		btnChamarFila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jController.chamarSenha();
						
			}
		});
	
		btnChamarFila.setBounds(281, 56, 117, 29);
		frmGerenciadorDeSenhas.getContentPane().add(btnChamarFila);
		
		JLabel lblSenhaAtual = new JLabel("SENHA ATUAL");
		lblSenhaAtual.setBounds(480, 28, 89, 16);
		frmGerenciadorDeSenhas.getContentPane().add(lblSenhaAtual);
		
		JLabel lblNewLabel = new JLabel("teste");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(467, 56, 117, 65);
		frmGerenciadorDeSenhas.getContentPane().add(lblNewLabel);
	}
}
