package projet_eg23;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class FP_Connexion {

	private JFrame frmGestionUtt;
	private JTextField idField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 * The main window, to connect.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FP_Connexion window = new FP_Connexion();
					window.frmGestionUtt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FP_Connexion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionUtt = new JFrame();
		frmGestionUtt.setResizable(false);
		frmGestionUtt.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\images.jpg"));
		frmGestionUtt.setTitle("Gestion UTT");
		frmGestionUtt.setBounds(100, 100, 800, 500);
		frmGestionUtt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmGestionUtt.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//QUIT THE APPLICATION
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBackground(new Color(220, 220, 220));
		btnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);	//on click, quit the application
			}
		});
		btnQuitter.setBounds(192, 337, 128, 28);
		panel.add(btnQuitter);
		
		//CONNECT
		JButton btnSeconnecter = new JButton("Se Connecter");
		btnSeconnecter.setBackground(new Color(220, 220, 220));
		btnSeconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//on click, close the current window and go to the menu
				FS_MenuPrincipal2.openMenuPrincipal();
				frmGestionUtt.dispose();
			}
		});
		btnSeconnecter.setBounds(491, 340, 128, 28);
		panel.add(btnSeconnecter);
		
		//labels		
		JLabel lblIdentifiant = new JLabel("Identifiant:");
		lblIdentifiant.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdentifiant.setBounds(176, 168, 88, 14);
		panel.add(lblIdentifiant);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe:");
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMotDePasse.setBounds(176, 237, 88, 14);
		panel.add(lblMotDePasse);

		//textFields
		idField = new JTextField();
		idField.setColumns(10);
		idField.setBounds(301, 165, 221, 21);
		panel.add(idField);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBounds(301, 234, 221, 21);
		panel.add(passwordField);

		//logo
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\logo_utt3.png"));
		lblNewLabel.setBounds(734, 411, 50, 49);
		panel.add(lblNewLabel);

		//background
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\UTT-3.jpg"));
		label.setBounds(-438, -339, 1268, 810);
		panel.add(label);
	}
}
