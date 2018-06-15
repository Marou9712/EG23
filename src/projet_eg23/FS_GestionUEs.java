package projet_eg23;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FS_GestionUEs extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void openGestionUEs() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FS_GestionUEs frame = new FS_GestionUEs();
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
	public FS_GestionUEs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(546, 102, 169, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 70, 507, 380);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NF16", "Bases de donn\u00E9es"},
			},
			new String[] {
				"Code", "Label"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(0).setMinWidth(10);
		table.getColumnModel().getColumn(1).setPreferredWidth(400);
		
		JLabel lblRechercherUneUe = new JLabel("Rechercher une UE:");
		lblRechercherUneUe.setBounds(536, 77, 116, 14);
		contentPane.add(lblRechercherUneUe);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Marion\\Pictures\\Android\\1x\\round_search_black_18dp.png"));
		button.setBounds(725, 102, 31, 27);
		contentPane.add(button);
		
		JButton btnVoir = new JButton("Voir");
		btnVoir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_GestionUEDetails.openGestionUEDetails();
				FS_GestionUEs.this.dispose();
			}
		});
		btnVoir.setBounds(589, 248, 89, 23);
		contentPane.add(btnVoir);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 0, 777, 37);
		contentPane.add(panel);
		
		JLabel lblGestionDesUes = new JLabel("Gestion des UEs");
		lblGestionDesUes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGestionDesUes.setBackground(Color.WHITE);
		lblGestionDesUes.setBounds(299, 8, 137, 20);
		panel.add(lblGestionDesUes);
		
		JButton button_1 = new JButton("D\u00E9connexion");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FP_Connexion.main(null);
				FS_GestionUEs.this.dispose();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_1.setBounds(660, 9, 107, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FS_MenuPrincipal2.openMenuPrincipal();
				FS_GestionUEs.this.dispose();
			}
		});
		button_2.setIcon(new ImageIcon("C:\\Users\\Marion\\Pictures\\Android\\drawable-hdpi\\ic_keyboard_arrow_left_black_24dp.png"));
		button_2.setBounds(0, 0, 42, 36);
		panel.add(button_2);
	}
}
