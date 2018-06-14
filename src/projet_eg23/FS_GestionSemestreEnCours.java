package projet_eg23;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
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
			label.setBounds(43, 17, 90, 14);
			contentPanel.add(label);
		}
		
		
		{
			
		Object rowData[][] = { { "1", "Helene Gregoff", "TCBR"},
                { "Row2-Column1", "Row2-Column2", "Row2-Column3"} };
		Object columnNames[] = { "Numero Etudiant", "Nom et Prenom", "Formation",};
		TableModel model = new DefaultTableModel(rowData, columnNames);
		
		table = new JTable(rowData, columnNames);
		table.setBounds(43, 50, 500, 350);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(43, 50, 500, 350);
		contentPanel.add(scrollPane);
		
		
		}
		Object typeEtudiant[] = {"Les etudiantes retards", "Les etudiants retards critique","Les etudiants excellents"};
		JSpinner spinner = new JSpinner(new SpinnerListModel(typeEtudiant));
		spinner.setBounds(104, 11, 233, 20);
		contentPanel.add(spinner);
		
		JButton btnNewButton = new JButton("Cursus spécialisé");
		btnNewButton.setBounds(379, 8, 163, 23);
		contentPanel.add(btnNewButton);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPanel, label, scrollPane, table}));
	
	}
}
