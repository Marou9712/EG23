package projet_eg23;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class D_GestionEnseignantModif extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void openModifDialog() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D_GestionEnseignantModif frame = new D_GestionEnseignantModif();
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
	public D_GestionEnseignantModif() {
		setTitle("Modifier");
		setBounds(100, 100, 403, 255);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 14, 1, 256);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D_GestionEnseignantModif.this.dispose();
			}
		});
		btnAnnuler.setBounds(55, 178, 89, 23);
		getContentPane().add(btnAnnuler);
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D_GestionEnseignantModif.this.dispose();
			}
		});
		btnOk.setBounds(227, 178, 89, 23);
		getContentPane().add(btnOk);
		
		JLabel label = new JLabel("Nom:");
		label.setBounds(33, 29, 90, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Pr\u00E9nom:");
		label_1.setBounds(33, 54, 90, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Date d'entr\u00E9e:");
		label_2.setBounds(33, 78, 90, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Type:");
		label_3.setBounds(33, 103, 90, 14);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Nombre d'heures:");
		label_4.setBounds(33, 128, 90, 14);
		getContentPane().add(label_4);
		
		textField = new JTextField();
		textField.setBounds(169, 23, 120, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 48, 120, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 72, 120, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 97, 120, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 122, 120, 20);
		getContentPane().add(textField_4);

	}
}
