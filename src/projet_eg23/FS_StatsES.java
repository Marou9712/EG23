package projet_eg23;

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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FS_StatsES extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String dataType = "";

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\images.jpg"));
		setTitle("Gestion UTT");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setLayout(null);
		panel.setBounds(0, 0, 777, 37);
		contentPane.add(panel);
		
		JLabel lblStatistiquesDesFlux = new JLabel("Statistiques des flux entrants et sortants");
		lblStatistiquesDesFlux.setForeground(new Color(255, 255, 255));
		lblStatistiquesDesFlux.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStatistiquesDesFlux.setBackground(Color.WHITE);
		lblStatistiquesDesFlux.setBounds(216, 8, 341, 20);
		panel.add(lblStatistiquesDesFlux);
		
		//on click disconnect
		JButton button = new JButton("D\u00E9connexion");
		button.setBackground(new Color(220, 220, 220));
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBounds(660, 9, 107, 23);
		panel.add(button);
		
		//on click, get back to FS_MenuPrincipal
		JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_MenuPrincipal.openMenuPrincipal();
				FS_StatsES.this.dispose();
			}
		});
		button_1.setBackground(new Color(220, 220, 220));
		button_1.setIcon(new ImageIcon("C:\\Users\\Marion\\Pictures\\Android\\drawable-hdpi\\ic_keyboard_arrow_left_black_24dp.png"));
		button_1.setBounds(0, 0, 42, 36);
		panel.add(button_1);
		
		JLabel lblDonnes = new JLabel("Donn\u00E9es:");
		lblDonnes.setBounds(23, 115, 70, 14);
		contentPane.add(lblDonnes);
		
		JLabel lblNewLabel = new JLabel("Ann\u00E9e:");
		lblNewLabel.setBounds(22, 71, 70, 14);
		contentPane.add(lblNewLabel);
		
		//comboBox, choose type of graph to show
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Nombre d'admissions TC", "Nombre d'admissions IUT", "Nombre d'admissions pr\u00E9pa", "Nombre d'admissions autres", "Nombre d'\u00E9tudiants r\u00E9orient\u00E9s", "Nombre d'\u00E9tudiants d\u00E9missionnaires", "Nombre d'\u00E9tudiants dipl\u00F4m\u00E9s"}));
		comboBox.setBounds(103, 112, 231, 20);
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switch(comboBox.getSelectedIndex()){
					case 0:
						dataType = "tc";
						break;
					case 1:
						dataType = "iut";
						break;
					case 2:
						dataType = "pre";
						break;
					case 3:
						dataType = "aut";
						break;
					case 4:
						dataType = "reo";
						break;
					case 5:
						dataType = "dem";
						break;
					case 6:
						dataType = "dip";
						break;
					default:
						dataType = "def";
						break;
				}
			}
		});
		contentPane.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(65, 168, 648, 266);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//labels stats
		JLabel lblEntres = new JLabel("Entr\u00E9es");
		lblEntres.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblEntres.setBounds(10, 11, 46, 14);
		panel_1.add(lblEntres);
		
		JLabel lblSorties = new JLabel("Sorties");
		lblSorties.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblSorties.setBounds(602, 11, 46, 14);
		panel_1.add(lblSorties);
		
		JLabel lblNombreDadmissionsTc = new JLabel("Nombre d'admissions TC:");
		lblNombreDadmissionsTc.setBounds(39, 65, 163, 14);
		panel_1.add(lblNombreDadmissionsTc);
		
		JLabel lblNombreDadmissionsIut = new JLabel("Nombre d'admissions IUT:");
		lblNombreDadmissionsIut.setBounds(39, 105, 163, 14);
		panel_1.add(lblNombreDadmissionsIut);
		
		JLabel lblNombreDadmissionsPrpa = new JLabel("Nombre d'admissions pr\u00E9pa:");
		lblNombreDadmissionsPrpa.setBounds(39, 149, 163, 14);
		panel_1.add(lblNombreDadmissionsPrpa);
		
		JLabel lblNombreDadmissionsAutres = new JLabel("Nombre d'admissions autres:");
		lblNombreDadmissionsAutres.setBounds(39, 191, 163, 14);
		panel_1.add(lblNombreDadmissionsAutres);
		
		JLabel lblNombreDtudiantsRorients = new JLabel("Nombre d'\u00E9tudiants r\u00E9orient\u00E9s:");
		lblNombreDtudiantsRorients.setBounds(341, 65, 203, 14);
		panel_1.add(lblNombreDtudiantsRorients);
		
		JLabel lblNombreDtudiantsDmissionnaires = new JLabel("Nombre d'\u00E9tudiants d\u00E9missionnaires:");
		lblNombreDtudiantsDmissionnaires.setBounds(341, 105, 203, 14);
		panel_1.add(lblNombreDtudiantsDmissionnaires);
		
		JLabel lblNombreDtudiantsDiplms = new JLabel("Nombre d'\u00E9tudiants dipl\u00F4m\u00E9s:");
		lblNombreDtudiantsDiplms.setBounds(341, 149, 203, 14);
		panel_1.add(lblNombreDtudiantsDiplms);
		
		//values, to change according to year
		JLabel nbTC = new JLabel("0");
		nbTC.setHorizontalAlignment(SwingConstants.TRAILING);
		nbTC.setBounds(206, 65, 47, 14);
		panel_1.add(nbTC);
		
		JLabel nbIUT = new JLabel("0");
		nbIUT.setHorizontalAlignment(SwingConstants.TRAILING);
		nbIUT.setBounds(206, 105, 47, 14);
		panel_1.add(nbIUT);
		
		JLabel nbPrepa = new JLabel("0");
		nbPrepa.setHorizontalAlignment(SwingConstants.TRAILING);
		nbPrepa.setBounds(206, 149, 47, 14);
		panel_1.add(nbPrepa);
		
		JLabel nbAutres = new JLabel("0");
		nbAutres.setHorizontalAlignment(SwingConstants.TRAILING);
		nbAutres.setBounds(206, 191, 47, 14);
		panel_1.add(nbAutres);
		
		JLabel nbReorientes = new JLabel("0");
		nbReorientes.setHorizontalAlignment(SwingConstants.TRAILING);
		nbReorientes.setBounds(548, 65, 54, 14);
		panel_1.add(nbReorientes);
		
		JLabel nbDemission = new JLabel("0");
		nbDemission.setHorizontalAlignment(SwingConstants.TRAILING);
		nbDemission.setBounds(548, 105, 54, 14);
		panel_1.add(nbDemission);
		
		JLabel nbDiplome = new JLabel("0");
		nbDiplome.setHorizontalAlignment(SwingConstants.TRAILING);
		nbDiplome.setBounds(548, 149, 54, 14);
		panel_1.add(nbDiplome);
		
		//comboBox of the ten last years
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008"}));
		comboBox_1.setBounds(102, 68, 89, 20);
		contentPane.add(comboBox_1);
		
		//on click, change values corresponding regarding the year
		JButton btnOk_sem = new JButton("OK");
		btnOk_sem.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOk_sem.setForeground(new Color(255, 255, 255));
		btnOk_sem.setBackground(new Color(0, 0, 128));
		btnOk_sem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//not implemented yet
			}
		});
		btnOk_sem.setBounds(213, 64, 57, 29);
		contentPane.add(btnOk_sem);
		
		//on click, show corresponding graph compared to the chosen data
		JButton btnOk_data = new JButton("OK");
		btnOk_data.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOk_data.setForeground(new Color(255, 255, 255));
		btnOk_data.setBackground(new Color(0, 0, 128));
		btnOk_data.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_StatsES_graphs.openGraph(dataType);
			}
		});
		btnOk_data.setBounds(344, 108, 57, 29);
		contentPane.add(btnOk_data);		
		
				//background
				JLabel label = new JLabel("");
				label.setBounds(-429, -333, 1268, 810);
				contentPane.add(label);
				label.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\UTT-5.jpg"));
	}
}
