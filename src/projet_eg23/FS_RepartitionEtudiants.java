package projet_eg23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.SpinnerModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;

public class FS_RepartitionEtudiants extends JFrame {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JLabel label;
	private JScrollPane scrollPane;
	
	/**
	 * Launch the application.
	 * Dashboard, from here we can disconnect or go back to the menu
	 */
	public static void openRepartionEtudiants() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FS_RepartitionEtudiants frame = new FS_RepartitionEtudiants();
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
	public FS_RepartitionEtudiants() {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		
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
			
			
		//set list of students
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "GREGOFF", "Helene", "TCBR2"},
				{"4", "BENOIST", "Anna", "ISI02"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"},
				{"2", "NOM1", "Prenom1", "Niveau"}},
			new String[] {
				"Numero Etudiant", "Nom", "Prenom", "Niveau de Formation"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				true, true, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(2).setResizable(false);
		table.setBackground(new Color(255, 255, 255));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		//table.setBounds(50, 50, 500, 350);
		
		//set table into scrollPane
		scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(123, 82, 500, 368);
		contentPanel.add(scrollPane);
		}
				
	
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(new Color(0, 0, 128));
		panel.setLayout(null);
		panel.setBounds(0, 0, 784, 37);
		contentPanel.add(panel);
		
		//title
		JLabel lblGestionDuSemestre = new JLabel("R\u00E9partition des \u00E9tudiants");
		lblGestionDuSemestre.setForeground(new Color(255, 255, 255));
		lblGestionDuSemestre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGestionDuSemestre.setBackground(Color.WHITE);
		lblGestionDuSemestre.setBounds(252, 7, 250, 20);
		panel.add(lblGestionDuSemestre);
		
		//disconnect
		JButton btnDconnexion = new JButton("D\u00E9connexion");
		btnDconnexion.setBackground(new Color(220, 220, 220));
		btnDconnexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FP_Connexion.main(null);
				FS_RepartitionEtudiants.this.dispose();
			}
		});
		btnDconnexion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDconnexion.setBounds(657, 8, 107, 23);
		panel.add(btnDconnexion);
		
		//go back to FS_MenuPrincipal2
		JButton button_1 = new JButton("");
		button_1.setBackground(new Color(220, 220, 220));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_MenuPrincipal2.openMenuPrincipal();
				FS_RepartitionEtudiants.this.dispose();
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\ic_keyboard_arrow_left_black_24dp.png"));
		button_1.setBounds(0, 0, 42, 36);
		panel.add(button_1);
		
		//labels
		JLabel lblParCategorie = new JLabel("Par categorie:");
		lblParCategorie.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblParCategorie.setBounds(385, 53, 107, 14);
		contentPanel.add(lblParCategorie);

		label = new JLabel("Par semestre:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(132, 54, 99, 14);
		contentPanel.add(label);
		
		//comboBox filtering the list, not implemented yet
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"A18", "P17", "A17", "P16", "A16", "P15", "A15", "P14", "A14", "P13", "A13", "P12", "A12", "P11", "A11", "P10", "A10", "P09", "A09", "P08"}));
		comboBox.setBounds(246, 52, 56, 20);
		contentPanel.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"ALL", "TCBR", "ST09", "MSI", "MPL", "MRI", "ST10", "ST51", "ST52"}));
		comboBox_1.setBounds(510, 52, 56, 20);
		contentPanel.add(comboBox_1);
		
					//background
					JLabel label_1 = new JLabel("");
					label_1.setBounds(-247, -325, 1268, 810);
					contentPanel.add(label_1);
					label_1.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\UTT-5.jpg"));
		//getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPanel, label, scrollPane, table}));
		
		
		ChangeListener listener = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				table.repaint();
			}
		    };
	}
}
