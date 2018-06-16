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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class FS_GestionUEDetails extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void openGestionUEDetails() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FS_GestionUEDetails frame = new FS_GestionUEDetails();
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
	public FS_GestionUEDetails() {
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
		panel.setBounds(0, 0, 784, 37);
		contentPane.add(panel);
		
		JLabel lblGestionDesUes = new JLabel("Gestion des UEs");
		lblGestionDesUes.setForeground(new Color(255, 255, 255));
		lblGestionDesUes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGestionDesUes.setBackground(Color.WHITE);
		lblGestionDesUes.setBounds(318, 8, 139, 20);
		panel.add(lblGestionDesUes);
		
		//disconnect on click
		JButton button = new JButton("D\u00E9connexion");
		button.setBackground(new Color(245, 245, 245));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FP_Connexion.main(null);
				FS_GestionUEDetails.this.dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBounds(660, 9, 107, 23);
		panel.add(button);
		
		//get back on click
		JButton button_1 = new JButton("");
		button_1.setBackground(new Color(245, 245, 245));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_GestionUEs.openGestionUEs();
				FS_GestionUEDetails.this.dispose();
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\Marion\\Pictures\\Android\\drawable-hdpi\\ic_keyboard_arrow_left_black_24dp.png"));
		button_1.setBounds(0, 0, 42, 36);
		panel.add(button_1);
		
		//labels
		JLabel lblResponsab = new JLabel("Responsable de l'UE:");
		lblResponsab.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResponsab.setBounds(418, 214, 153, 14);
		contentPane.add(lblResponsab);
		
		JLabel lblMarcLemercier = new JLabel("Marc LEMERCIER");
		lblMarcLemercier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMarcLemercier.setBounds(608, 214, 112, 14);
		contentPane.add(lblMarcLemercier);
		
		//scrollpane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(20, 98, 372, 341);
		contentPane.add(scrollPane);

		//table of students
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ISI", "00000", "DUPONT", "Isabelle"},
				{"ISI", "00001", "DUPONT", "Isabelle"},
				{"ISI", "00002", "DUPONT", "Isabelle"},
				{"ISI", "00003", "DUPONT", "Isabelle"},
				{"ISI", "00004", "DUPONT", "Isabelle"},
				{"ISI", "00005", "DUPONT", "Isabelle"},
				{"ISI", "00006", "DUPONT", "Isabelle"},
				{"ISI", "00007", "DUPONT", "Isabelle"},
				{"ISI", "00008", "DUPONT", "Isabelle"},
				{"ISI", "00009", "DUPONT", "Isabelle"},
				{"ISI", "00010", "DUPONT", "Isabelle"},
				{"ISI", "00011", "DUPONT", "Isabelle"},
				{"ISI", "00012", "DUPONT", "Isabelle"},
				{"ISI", "00013", "DUPONT", "Isabelle"},
				{"ISI", "00014", "DUPONT", "Isabelle"},
				{"ISI", "00015", "DUPONT", "Isabelle"},
				{"ISI", "00016", "DUPONT", "Isabelle"},
				{"ISI", "00017", "DUPONT", "Isabelle"},
				{"ISI", "00018", "DUPONT", "Isabelle"},
			},
			new String[] {
				"D\u00E9partement", "Code", "Nom", "Pr\u00E9nom"
			}
		));
		scrollPane.setViewportView(table);
		
		//success percent
		JLabel lblPourcentageDeRussite = new JLabel("Pourcentage de r\u00E9ussite");
		lblPourcentageDeRussite.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPourcentageDeRussite.setBounds(418, 251, 181, 14);
		contentPane.add(lblPourcentageDeRussite);
		
		JLabel label_1 = new JLabel("80%");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(683, 251, 37, 14);
		contentPane.add(label_1);
		
		JLabel lblCode = new JLabel("CODE");
		lblCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCode.setBounds(61, 65, 46, 14);
		contentPane.add(lblCode);
		
		//comboBox of all semesters between from 10 years ago
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"P18", "A17", "P17", "A16", "P16", "A15", "P15", "A14", "P14", "A13", "P13", "A12", "P12", "A11", "P11", "A10", "P10", "A09", "P09", "A08"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(164, 63, 56, 20);
		contentPane.add(comboBox);
		

		//background
		JLabel label_bg = new JLabel("");
		label_bg.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\UTT-5.jpg"));
		label_bg.setBounds(-373, -339, 1268, 810);
		contentPane.add(label_bg);
	}
}
