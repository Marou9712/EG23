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

public class FP_Connexion {

	private JFrame frmGestionUtt;
	private JTextField label_id;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
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
		frmGestionUtt.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marion\\Pictures\\images.jpg"));
		frmGestionUtt.setTitle("Gestion UTT");
		frmGestionUtt.setBounds(100, 100, 800, 500);
		frmGestionUtt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmGestionUtt.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(192, 337, 128, 28);
		panel.add(btnQuitter);
		
		JButton btnSeconnecter = new JButton("Se Connecter");
		btnSeconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FS_MenuPrincipal2.openMenuPrincipal();
				frmGestionUtt.dispose();
			}
		});
		btnSeconnecter.setBounds(491, 340, 128, 28);
		panel.add(btnSeconnecter);
		
		label_id = new JTextField();
		label_id.setColumns(10);
		label_id.setBounds(301, 165, 221, 21);
		panel.add(label_id);
		
		JLabel lblIdentifiant = new JLabel("Identifiant:");
		lblIdentifiant.setBounds(176, 168, 88, 14);
		panel.add(lblIdentifiant);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe:");
		lblMotDePasse.setBounds(176, 237, 88, 14);
		panel.add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBounds(301, 234, 221, 21);
		panel.add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\UTT-2.jpg"));
		label.setBounds(-320, -339, 1114, 810);
		panel.add(label);
	}
}
