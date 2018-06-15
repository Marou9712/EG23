package projet_eg23;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class FS_StatsES extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void openStatsES() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FS_StatsES frame = new FS_StatsES();
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
	public FS_StatsES() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 777, 37);
		contentPane.add(panel);
		
		JLabel lblStatistiquesDesFlux = new JLabel("Statistiques des flux entrants et sortants");
		lblStatistiquesDesFlux.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStatistiquesDesFlux.setBackground(Color.WHITE);
		lblStatistiquesDesFlux.setBounds(202, 8, 341, 20);
		panel.add(lblStatistiquesDesFlux);
		
		JButton button = new JButton("D\u00E9connexion");
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBounds(660, 9, 107, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\Marion\\Pictures\\Android\\drawable-hdpi\\ic_keyboard_arrow_left_black_24dp.png"));
		button_1.setBounds(0, 0, 42, 36);
		panel.add(button_1);
		
		JLabel lblDonnes = new JLabel("Donn\u00E9es:");
		lblDonnes.setBounds(21, 82, 46, 14);
		contentPane.add(lblDonnes);
		
		JLabel lblNewLabel = new JLabel("Semestre:");
		lblNewLabel.setBounds(21, 51, 56, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nombre d'admissions TC", "Nombre d'admissions IUT", "Nombre d'admissions pr\u00E9pa", "Nombre d'admissions autres", "Nombre d\u00E9tudiants r\u00E9orient\u00E9s", "Nombre d\u00E9tudiants d\u00E9missionnaires", "Nombre d\u00E9tudiants dipl\u00F4m\u00E9s"}));
		comboBox.setBounds(101, 79, 150, 20);
		contentPane.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(84, 137, 602, 266);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEntres = new JLabel("Entr\u00E9es");
		lblEntres.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblEntres.setBounds(10, 11, 46, 14);
		panel_1.add(lblEntres);
		
		JLabel lblSorties = new JLabel("Sorties");
		lblSorties.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblSorties.setBounds(546, 11, 46, 14);
		panel_1.add(lblSorties);
		
		JLabel lblNombreDadmissionsTc = new JLabel("Nombre d'admissions TC:");
		lblNombreDadmissionsTc.setBounds(39, 65, 129, 14);
		panel_1.add(lblNombreDadmissionsTc);
		
		JLabel lblNombreDadmissionsIut = new JLabel("Nombre d'admissions IUT:");
		lblNombreDadmissionsIut.setBounds(39, 105, 129, 14);
		panel_1.add(lblNombreDadmissionsIut);
		
		JLabel lblNombreDadmissionsPrpa = new JLabel("Nombre d'admissions pr\u00E9pa:");
		lblNombreDadmissionsPrpa.setBounds(39, 149, 139, 14);
		panel_1.add(lblNombreDadmissionsPrpa);
		
		JLabel lblNombreDadmissionsAutres = new JLabel("Nombre d'admissions autres:");
		lblNombreDadmissionsAutres.setBounds(39, 200, 139, 14);
		panel_1.add(lblNombreDadmissionsAutres);
		
		JLabel lblNombreDtudiantsRorients = new JLabel("Nombre d'\u00E9tudiants r\u00E9orient\u00E9s:");
		lblNombreDtudiantsRorients.setBounds(341, 65, 156, 14);
		panel_1.add(lblNombreDtudiantsRorients);
		
		JLabel lblNombreDtudiantsDmissionnaires = new JLabel("Nombre d'\u00E9tudiants d\u00E9missionnaires:");
		lblNombreDtudiantsDmissionnaires.setBounds(341, 105, 175, 14);
		panel_1.add(lblNombreDtudiantsDmissionnaires);
		
		JLabel lblNombreDtudiantsDiplms = new JLabel("Nombre d'\u00E9tudiants dipl\u00F4m\u00E9s:");
		lblNombreDtudiantsDiplms.setBounds(341, 149, 156, 14);
		panel_1.add(lblNombreDtudiantsDiplms);
		
		JLabel nbTC = new JLabel("0");
		nbTC.setHorizontalAlignment(SwingConstants.TRAILING);
		nbTC.setBounds(188, 65, 30, 14);
		panel_1.add(nbTC);
		
		JLabel nbIUT = new JLabel("0");
		nbIUT.setHorizontalAlignment(SwingConstants.TRAILING);
		nbIUT.setBounds(188, 105, 30, 14);
		panel_1.add(nbIUT);
		
		JLabel nbPrepa = new JLabel("0");
		nbPrepa.setHorizontalAlignment(SwingConstants.TRAILING);
		nbPrepa.setBounds(188, 149, 30, 14);
		panel_1.add(nbPrepa);
		
		JLabel nbAutres = new JLabel("0");
		nbAutres.setHorizontalAlignment(SwingConstants.TRAILING);
		nbAutres.setBounds(188, 200, 30, 14);
		panel_1.add(nbAutres);
		
		JLabel nbReorientes = new JLabel("0");
		nbReorientes.setHorizontalAlignment(SwingConstants.TRAILING);
		nbReorientes.setBounds(526, 65, 30, 14);
		panel_1.add(nbReorientes);
		
		JLabel nbDemission = new JLabel("0");
		nbDemission.setHorizontalAlignment(SwingConstants.TRAILING);
		nbDemission.setBounds(526, 105, 30, 14);
		panel_1.add(nbDemission);
		
		JLabel nbDiplome = new JLabel("0");
		nbDiplome.setHorizontalAlignment(SwingConstants.TRAILING);
		nbDiplome.setBounds(526, 149, 30, 14);
		panel_1.add(nbDiplome);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"P18", "A17", "P17", "A16", "P16", "A15", "P15", "A14", "P14", "A13", "P13", "A12", "P12", "A11", "P11", "A10", "P10", "A09", "P09", "A08"}));
		comboBox_1.setBounds(195, 48, 56, 20);
		contentPane.add(comboBox_1);
		
		JButton btnOk_sem = new JButton("OK");
		btnOk_sem.setBounds(261, 47, 46, 23);
		contentPane.add(btnOk_sem);
		
		JButton btnOk_data = new JButton("OK");
		btnOk_data.setBounds(261, 78, 46, 23);
		contentPane.add(btnOk_data);
		
		JLabel graph = new JLabel("");
		graph.setBounds(31, 41, 708, 360);
		contentPane.add(graph);
		graph.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\admission_tc.PNG"));
	}
}
