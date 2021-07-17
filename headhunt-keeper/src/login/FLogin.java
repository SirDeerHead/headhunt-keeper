package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

public class FLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FLogin frame = new FLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FLogin() {
		setUndecorated(true);
		/*
		 * JFrame with contentPane
		 */
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		/*
		 * JPanel for JTextField for typing Username
		 */
		JPanel PnlUsername = new JPanel();
		PnlUsername.setBounds(171, 156, 250, 40);
		contentPane.add(PnlUsername);
		PnlUsername.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 10, 230, 19);
		PnlUsername.add(txtUsername);
		txtUsername.setColumns(10);
		
		
		
		/*
		 * JPanel for JPasswordField for typing Password
		 */
		JPanel PnlPassword = new JPanel();
		PnlPassword.setBounds(171, 204, 250, 40);
		contentPane.add(PnlPassword);
		PnlPassword.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		pwdPassword.setBounds(10, 10, 230, 19);
		PnlPassword.add(pwdPassword);
		
		
		
		/*
		 * JPanel that will be a Login button
		 */
		JPanel PnlBtnLogin = new JPanel();
		PnlBtnLogin.setBackground(Color.DARK_GRAY);
		PnlBtnLogin.setBounds(171, 269, 250, 50);
		contentPane.add(PnlBtnLogin);
		PnlBtnLogin.setLayout(null);
		
		
		
		/*
		 * JLabel for text LOG IN on the Login Panel Button (PnlBtnLogin)
		 */
		JLabel lblLogIn = new JLabel("LOG IN");
		lblLogIn.setForeground(Color.WHITE);
		lblLogIn.setFont(new Font("Arial", Font.BOLD, 16));
		lblLogIn.setBounds(92, 10, 60, 30);
		PnlBtnLogin.add(lblLogIn);
		
		
		
		/*
		 * JLabel for X button to close application
		 */
		JLabel lblX_close = new JLabel("X");
		lblX_close.setBackground(new Color(220, 20, 60));
		lblX_close.setForeground(new Color(220, 20, 60));
		lblX_close.setBorder(new LineBorder(new Color(220, 20, 60), 2, true));
		lblX_close.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblX_close.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_close.setBounds(561, 10, 25, 25);
		contentPane.add(lblX_close);
	}
}
