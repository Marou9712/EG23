package projet_eg23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class FS_GestionSemestreEnCours extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JScrollPane scrollPane;
	
	/**
	 * Launch the application.
	 */
	public static void openGestionSemestreEnCours() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FS_GestionSemestreEnCours frame = new FS_GestionSemestreEnCours();
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
	public FS_GestionSemestreEnCours() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\images.jpg"));
		setTitle("Gestion UTT");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);	
		
		{
		//set table of students
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "GREGOFF", "Helene", "TCBR"},
				{"2", "DUSQUENNE", "Rosalie", "ST09"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
				{"3", "NOM2", "Prénom2", "Positionnement"},
			},
			new String[] {
				"Numero Etudiant", "Nom", "Pr\u00E9nom", "Positionnement"
			}
		));
		//table.setBounds(50, 50, 500, 350);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(143, 126, 500, 324);
		contentPanel.add(scrollPane);
		}		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setLayout(null);
		panel.setBounds(0, 0, 784, 37);
		contentPanel.add(panel);
		
		JLabel lblGestionDuSemestre = new JLabel("Gestion du semestre en cours");
		lblGestionDuSemestre.setForeground(new Color(255, 255, 255));
		lblGestionDuSemestre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGestionDuSemestre.setBackground(Color.WHITE);
		lblGestionDuSemestre.setBounds(272, 7, 250, 20);
		panel.add(lblGestionDuSemestre);
		
		JButton btnDconnexion = new JButton("D\u00E9connexion");
		btnDconnexion.setBackground(new Color(220, 220, 220));
		btnDconnexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FP_Connexion.main(null);
				FS_GestionSemestreEnCours.this.dispose();
			}
		});
		btnDconnexion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDconnexion.setBounds(667, 8, 107, 23);
		panel.add(btnDconnexion);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(new Color(220, 220, 220));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_MenuPrincipal2.openMenuPrincipal();
				FS_GestionSemestreEnCours.this.dispose();
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\ic_keyboard_arrow_left_black_24dp.png"));
		button_1.setBounds(0, 0, 42, 36);
		panel.add(button_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Tous les \u00E9tudiants", "Etudiants en retard", "Etudiants avec retard critique", "Etudiants avec parcours d'excellence"}));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(219, 56, 233, 20);
		contentPanel.add(comboBox);
		
		JLabel lblFiltrer = new JLabel("Filtrer:");
		lblFiltrer.setBounds(143, 59, 46, 14);
		contentPanel.add(lblFiltrer);
		//getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPanel, label, scrollPane, table}));
		

		//background
		JLabel label = new JLabel("");
		label.setBounds(-397, -310, 1268, 810);
		contentPanel.add(label);
		label.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\UTT-5.jpg"));
	
		
	}
}
