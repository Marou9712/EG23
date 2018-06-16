package projet_eg23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FS_MenuPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void openMenuPrincipal() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FS_MenuPrincipal window = new FS_MenuPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FS_MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\images.jpg"));
		frame.setTitle("Gestion UTT");
		frame.getContentPane().setLayout(null);
		
		JLabel lblAccueil = new JLabel("Accueil");
		lblAccueil.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAccueil.setBounds(10, 11, 58, 20);
		frame.getContentPane().add(lblAccueil);
		
		JButton btnGestionDesEnseignants = new JButton("Gestion des enseignants");
		btnGestionDesEnseignants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_GestionEnseignants.openGestionEnseignants();
				frame.dispose();
			}
		});
		btnGestionDesEnseignants.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGestionDesEnseignants.setBounds(245, 78, 293, 51);
		frame.getContentPane().add(btnGestionDesEnseignants);
		
		JButton btnGestionDesUes = new JButton("Gestion des UEs");
		btnGestionDesUes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_GestionUEs.openGestionUEs();
				frame.dispose();
			}
		});
		btnGestionDesUes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGestionDesUes.setBounds(245, 157, 293, 51);
		frame.getContentPane().add(btnGestionDesUes);
		
		JButton btnRpartitionDestudiants = new JButton("R\u00E9partition des \u00E9tudiants");
		btnRpartitionDestudiants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_RepartitionEtudiants.openRepartionEtudiants();
				frame.dispose();
			}
		});
		btnRpartitionDestudiants.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRpartitionDestudiants.setBounds(245, 238, 293, 51);
		frame.getContentPane().add(btnRpartitionDestudiants);
		
		JButton btnStatistiquesEs = new JButton("Statistiques E/S");
		btnStatistiquesEs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_StatsES.openStatsES();
				frame.dispose();
			}
		});
		btnStatistiquesEs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStatistiquesEs.setBounds(245, 310, 293, 51);
		frame.getContentPane().add(btnStatistiquesEs);
		
		JButton btnSemestreEnCours = new JButton("Semestre en cours");
		btnSemestreEnCours.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_GestionSemestreEnCours.openGestionSemestreEnCours();
				frame.dispose();
			}
		});
		btnSemestreEnCours.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSemestreEnCours.setBounds(245, 383, 293, 51);
		frame.getContentPane().add(btnSemestreEnCours);
		
		JButton btnDconnexion = new JButton("D\u00E9connexion");
		btnDconnexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FP_Connexion.main(null);
				frame.dispose();
			}
		});
		btnDconnexion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDconnexion.setBounds(681, 12, 103, 23);
		frame.getContentPane().add(btnDconnexion);
	}

}
