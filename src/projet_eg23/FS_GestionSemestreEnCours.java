package projet_eg23;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerListModel;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import javax.swing.table.TableColumn;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FS_GestionSemestreEnCours extends JFrame {

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
		setBounds(100, 100, 600, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		{
			label = new JLabel("Filtrer:");
			label.setBounds(50, 67, 90, 14);
			contentPanel.add(label);
		}
		
		
		{
			
		Object rowData[][] = { { "1", "Helene Gregoff", "TCBR"},
                { "Row2-Column1", "Row2-Column2", "Row2-Column3"} };
		Object columnNames[] = { "Numero Etudiant", "Nom et Prenom", "Formation"};
		
		table = new JTable(rowData, columnNames);
		//table.setBounds(50, 50, 500, 350);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(50, 100, 500, 300);
		contentPanel.add(scrollPane);
		
		
		}
		Object typeEtudiant[] = {"Les etudiantes retards", "Les etudiants retards critique","Les etudiants excellents"};
		JSpinner spinner = new JSpinner(new SpinnerListModel(typeEtudiant));
		spinner.setBounds(104, 60, 233, 20);
		contentPanel.add(spinner);
		
		ChangeListener listener = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				table.repaint();
				
			}
		    };

		 spinner.addChangeListener(listener);
		
		JButton btnNewButton = new JButton("Cursus spécialisé");
		btnNewButton.setBounds(379, 60, 163, 23);
		contentPanel.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BD_ChoixPositionnement choixPositionBD = new BD_ChoixPositionnement();
			}
		});
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 600, 37);
		contentPanel.add(panel);
		
		JLabel lblGestionDuSemestre = new JLabel("Gestion du semestre en cours");
		lblGestionDuSemestre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGestionDuSemestre.setBackground(Color.WHITE);
		lblGestionDuSemestre.setBounds(180, 7, 250, 20);
		panel.add(lblGestionDuSemestre);
		
		JButton button = new JButton("Déconnexion");
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBounds(490, 9, 107, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(0, 0, 42, 36);
		panel.add(button_1);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPanel, label, scrollPane, table}));
	
	}
}
