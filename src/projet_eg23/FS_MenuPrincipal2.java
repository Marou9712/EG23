package projet_eg23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class FS_MenuPrincipal2 extends JFrame {

	/**
	 * Secondary Window, principal menu.
	 * From there we can access the 5 dashboards or disconnect.
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void openMenuPrincipal() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FS_MenuPrincipal2 frame = new FS_MenuPrincipal2();
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
	public FS_MenuPrincipal2() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\images.jpg"));
		setTitle("Gestion UTT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//dashboard "Gestion des enseignants"
		JButton button = new JButton("Gestion des enseignants");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 128));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_GestionEnseignants.openGestionEnseignants();
				FS_MenuPrincipal2.this.dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(241, 82, 293, 51);
		contentPane.add(button);

		//dashboard "Gestion des UEs"
		JButton button_1 = new JButton("Gestion des UEs");
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBackground(new Color(0, 0, 128));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_GestionUEs.openGestionUEs();
				FS_MenuPrincipal2.this.dispose();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(241, 161, 293, 51);
		contentPane.add(button_1);

		//dashboard "Répartition des étudiants"
		JButton button_2 = new JButton("R\u00E9partition des \u00E9tudiants");
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBackground(new Color(0, 0, 128));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_RepartitionEtudiants.openRepartionEtudiants();
				FS_MenuPrincipal2.this.dispose();
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(241, 242, 293, 51);
		contentPane.add(button_2);

		//dashboard "Statistique des flux entrant et sortant"
		JButton button_3 = new JButton("Statistiques E/S");
		button_3.setForeground(new Color(255, 255, 255));
		button_3.setBackground(new Color(0, 0, 128));
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_StatsES.openStatsES();
				FS_MenuPrincipal2.this.dispose();
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(241, 314, 293, 51);
		contentPane.add(button_3);

		//dashboard "Semestre en cours"
		JButton button_4 = new JButton("Semestre en cours");
		button_4.setForeground(new Color(255, 255, 255));
		button_4.setBackground(new Color(0, 0, 128));
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_GestionSemestreEnCours.openGestionSemestreEnCours();
				FS_MenuPrincipal2.this.dispose();
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBounds(241, 387, 293, 51);
		contentPane.add(button_4);
		
		//disconnect
		JButton button_5 = new JButton("D\u00E9connexion");
		button_5.setBackground(new Color(220, 220, 220));
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FP_Connexion.main(null);
				FS_MenuPrincipal2.this.dispose();
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_5.setBounds(671, 11, 103, 23);
		contentPane.add(button_5);
		
		//label "accueil"
		JLabel label = new JLabel("Accueil");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(10, 11, 94, 20);
		contentPane.add(label);
		
		//background
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\UTT-5.jpg"));
		label_1.setBounds(-373, -339, 1268, 810);
		contentPane.add(label_1);
			
		
	}

}
