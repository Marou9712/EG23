package projet_eg23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

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

import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.SpinnerModel;

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
	 */

	/**
	 * Launch the application.
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
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		{
			label = new JLabel("Par semestre:");
			label.setBounds(50, 67, 90, 14);
			contentPanel.add(label);
		}
		
		
		{
			
		Object rowData[][] = { { "1", "Helene Gregoff", "TCBR2"},
                { "4", "Anna Benoist", "ISI02"} };
		Object columnNames[] = { "Numero Etudiant", "Nom et Prenom", "Niveau de Formation",};
	
		
		table = new JTable(rowData, columnNames);
		//table.setBounds(50, 50, 500, 350);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(50, 100, 500, 300);
		contentPanel.add(scrollPane);
		
		
		}
		Object codeSemestre[] = {"A00", "P00","A01", "P01","A02", "P02","A03", "P03","A04", "P04","A05", "P05","A06", "P06","A07", "P07","A08", "P08","A09", "P09","A10", "P10",
				"A11", "P11","A12", "P12","A13", "P13","A14", "P14","A15", "P15","A16", "P16","A17", "P17","A18", "P18"};
		JSpinner spinner = new JSpinner(new SpinnerListModel(codeSemestre));
		spinner.setBounds(152, 62, 82, 23);
		contentPanel.add(spinner);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 600, 37);
		contentPanel.add(panel);
		
		JLabel lblGestionDuSemestre = new JLabel("Repartition des etudiants");
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
		
		JLabel lblParCategorie = new JLabel("Par categorie:");
		lblParCategorie.setBounds(303, 66, 90, 14);
		contentPanel.add(lblParCategorie);
		
		Object category[] = {"TCBR", "ST09", "MSI", "MPL", "MRI", "ST10", "ST51", "ST52"};
		JSpinner spinner_1 = new JSpinner( new SpinnerListModel(category));
		spinner_1.setBounds(445, 61, 82, 23);
		contentPanel.add(spinner_1);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPanel, label, scrollPane, table}));
		
		
		ChangeListener listener = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				table.repaint();
				
			}
		    };

		 spinner.addChangeListener(listener);
		 spinner_1.addChangeListener(listener);
	}
}
