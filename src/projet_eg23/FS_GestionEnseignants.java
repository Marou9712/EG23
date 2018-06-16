package projet_eg23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.border.MatteBorder;
import javax.swing.ListSelectionModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.border.LineBorder;

public class FS_GestionEnseignants extends JFrame {

	/**
	 * Dashboard "Gestion des enseignants", can disconnect from there
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//to set the name from the selected item (of the list)
	String vNom;
	String vPrenom;
	String vDate;
	String vType;
	String vNbHeures;

	/**
	 * Launch the application.
	 */
	public static void openGestionEnseignants() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FS_GestionEnseignants frame = new FS_GestionEnseignants();
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
	public FS_GestionEnseignants() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\images.jpg"));
		setTitle("Gestion UTT");
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setLayout(null);
		
		//labels
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(10, 11, 112, 14);
		panel.add(lblNom);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom:");
		lblPrnom.setBounds(10, 36, 112, 14);
		panel.add(lblPrnom);
		
		JLabel lblDateDentre = new JLabel("Date d'entr\u00E9e:");
		lblDateDentre.setBounds(10, 60, 112, 14);
		panel.add(lblDateDentre);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(10, 85, 112, 14);
		panel.add(lblType);
		
		JLabel lblNombreDheures = new JLabel("Nombre d'heures:");
		lblNombreDheures.setBounds(10, 110, 112, 14);
		panel.add(lblNombreDheures);
		
		//values
		JLabel txtNom = new JLabel("NIGRO");
		txtNom.setBounds(132, 11, 117, 14);
		panel.add(txtNom);
		
		JLabel txtPrenom = new JLabel("Jean-Marc");
		txtPrenom.setBounds(132, 36, 117, 14);
		panel.add(txtPrenom);
		
		JLabel txtDate = new JLabel("01/09/1997");
		txtDate.setBounds(132, 60, 117, 14);
		panel.add(txtDate);
		
		JLabel txtType = new JLabel("Professeur");
		txtType.setBackground(new Color(255, 255, 255));
		txtType.setBounds(132, 85, 117, 14);
		panel.add(txtType);
		
		JLabel txtNbHeures = new JLabel("2000h");
		txtNbHeures.setBounds(132, 110, 117, 14);
		panel.add(txtNbHeures);
		
		//these functions are not implemented yet
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer.setBackground(new Color(0, 0, 128));
		btnSupprimer.setForeground(new Color(255, 255, 255));
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAjouter.setBackground(new Color(0, 0, 128));
		btnAjouter.setForeground(new Color(255, 255, 255));
		
		//list of teachers
		JList<String> list_enseignant = new JList<String>();
		list_enseignant.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				//set values from item of list
				switch(list_enseignant.getSelectedIndex()) {
				case 0:
					txtNom.setText("NIGRO");
					txtPrenom.setText("Jean-Marc");
					txtDate.setText("01/09/1997");
					txtType.setText("professeur");
					txtNbHeures.setText("2000h");
					break;
				case 1:
					txtNom.setText("BENEL");
					txtPrenom.setText("Aurélien");
					txtDate.setText("01/09/1996");
					txtType.setText("professeur");
					txtNbHeures.setText("1600h");
					break;
				case 2:
					txtNom.setText("LEMERCIER");
					txtPrenom.setText("Marc");
					txtDate.setText("01/09/1995");
					txtType.setText("professeur");
					txtNbHeures.setText("1750h");
					break;
				default:
					txtNom.setText("NOM");
					txtPrenom.setText("Prénom");
					txtDate.setText("jj/mm/aaaa");
					txtType.setText("prag");
					txtNbHeures.setText("1550h");
					break;
				}
			}
		});
		
		setvNom(txtNom.getText());
		setvPrenom(txtPrenom.getText());
		setvDate(txtDate.getText());
		setvType(txtType.getText());
		setvNbHeures(txtNbHeures.getText());
		
		list_enseignant.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_enseignant.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		list_enseignant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		list_enseignant.setModel(new AbstractListModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"Jean-Marc NIGRO", "Aur\u00E9lien BENEL", "Marc LEMERCIER", "Demetrio MACIAS", "Frederic CLEMENT", "Anne LOUIS", "Nicole HIRSON", "Sylvain DURIF", "Pierre DUPOND", "Alain CLEMENT", "Elena MENDEZ", "Corrine ROSE"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		list_enseignant.setSelectedIndex(0);
		
		
		JLabel lblNewLabel = new JLabel("D\u00E9tails sur les enseignants");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(245, 245, 245));
		
		JLabel label = new JLabel("Responsable de:");
		label.setBounds(12, 11, 112, 14);
		panel_1.add(label);
		
		JList<String> list = new JList<String>();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBackground(new Color(245, 245, 245));
		list.setFont(new Font("Tahoma", Font.PLAIN, 14));
		list.setModel(new AbstractListModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"EG23"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(48, 30, 76, 80);
		panel_1.add(list);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 128));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(33)
									.addComponent(list_enseignant, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(77)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))))
							.addGap(81)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(panel, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))))
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(5)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(302)
									.addComponent(btnAjouter)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnSupprimer))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(55)
							.addComponent(list_enseignant, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		
		//not implemented yet, on click get details of UE on dashboard "Gestion des UEs"
		JButton btnDtailsUe = new JButton("D\u00E9tails UE");
		btnDtailsUe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_GestionUEs.openGestionUEs();
				FS_GestionEnseignants.openGestionEnseignants();
			}
		});
		btnDtailsUe.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDtailsUe.setBackground(new Color(0, 0, 128));
		btnDtailsUe.setForeground(new Color(255, 255, 255));
		btnDtailsUe.setBounds(38, 121, 99, 23);
		panel_1.add(btnDtailsUe);
		
		//add or suppress teacher, not implemented yet
		JButton button_1 = new JButton("Ajouter");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(0, 0, 128));
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBounds(229, 48, 134, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Supprimer");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBackground(new Color(0, 0, 128));
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBounds(229, 88, 134, 23);
		panel_1.add(button_2);
		
		//modify values, on click, go to "GestionEnseignants_Modification"
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModifier.setBackground(new Color(0, 0, 128));
		btnModifier.setForeground(new Color(255, 255, 255));
		btnModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D_GestionEnseignantModification.openGestionEnseignantModification(vNom, vPrenom, vDate, vType, vNbHeures);
			}
		});
		btnModifier.setBounds(288, 106, 106, 23);
		panel.add(btnModifier);
		panel_2.setLayout(null);
		
		JLabel lblGestionDesEnseignants = new JLabel("Gestion des Enseignants");
		lblGestionDesEnseignants.setForeground(new Color(255, 255, 255));
		lblGestionDesEnseignants.setBounds(285, 8, 198, 20);
		panel_2.add(lblGestionDesEnseignants);
		lblGestionDesEnseignants.setBackground(new Color(255, 255, 255));
		lblGestionDesEnseignants.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		//disconnect
		JButton button_3 = new JButton("D\u00E9connexion");
		button_3.setBackground(new Color(220, 220, 220));
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FP_Connexion.main(null);
			}
		});
		button_3.setBounds(660, 9, 107, 23);
		panel_2.add(button_3);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		//back to "Menu principal"
		JButton btnRetour = new JButton("");
		btnRetour.setBackground(new Color(220, 220, 220));
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_MenuPrincipal2.openMenuPrincipal();
				FS_GestionEnseignants.this.dispose();
			}
		});
		btnRetour.setIcon(new ImageIcon("C:\\Users\\Marion\\Pictures\\Android\\drawable-hdpi\\ic_keyboard_arrow_left_black_24dp.png"));
		btnRetour.setBounds(0, 0, 42, 36);
		panel_2.add(btnRetour);
		contentPane.setLayout(gl_contentPane);

		//background
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\UTT-5.jpg"));
		label_1.setBounds(-373, -339, 1268, 810);
		contentPane.add(label_1);
		
	}

	/**
	 * Set values from the TextFields in frame D_GestionEnseignantModification (update)
	 */
	public void setVariables() {
		FS_GestionEnseignants.this.setvNom(D_GestionEnseignantModification.vNom);
		FS_GestionEnseignants.this.setvPrenom(D_GestionEnseignantModification.vPrenom);
		FS_GestionEnseignants.this.setvDate(D_GestionEnseignantModification.vDate);
		FS_GestionEnseignants.this.setvType(D_GestionEnseignantModification.vType);
		FS_GestionEnseignants.this.setvNbHeures(D_GestionEnseignantModification.vNbHeures);
	}
	
	public String getvNom() {
		return vNom;
	}
	public void setvNom(String vNom) {
		this.vNom = vNom;
	}

	public String getvPrenom() {
		return vPrenom;
	}
	public void setvPrenom(String vPrenom) {
		this.vPrenom = vPrenom;
	}

	public String getvDate() {
		return vDate;
	}
	public void setvDate(String vDate) {
		this.vDate = vDate;
	}

	public String getvType() {
		return vType;
	}
	public void setvType(String vType) {
		this.vType = vType;
	}

	public String getvNbHeures() {
		return vNbHeures;
	}
	public void setvNbHeures(String vNbHeures) {
		this.vNbHeures = vNbHeures;
	}

}
