package projet_eg23;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;

public class D_GestionEnseignantModification extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	private JTextField textField_heures;
	private JTextField textField_type;
	private JTextField textField_date;
	private JTextField textField_prenom;
	private JTextField textField_nom;

	//values
	static String vNom;
	static String vPrenom;
	static String vDate;
	static String vType;
	static String vNbHeures;

	/**
	 * Launch the application.
	 */
	public static void openGestionEnseignantModification(String nom, String prenom, String date, String type, String nbHeures) {
		vNom = nom;
		vPrenom = prenom;
		vDate = date;
		vType = type;
		vNbHeures = nbHeures;
		try {
			D_GestionEnseignantModification dialog = new D_GestionEnseignantModification();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * Create the dialog.
	 */
	public D_GestionEnseignantModification() {

		setResizable(false);
		setBounds(100, 100, 399, 230);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("Nom:");
			label.setBounds(43, 17, 90, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Pr\u00E9nom:");
			label.setBounds(43, 42, 90, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Date d'entr\u00E9e:");
			label.setBounds(43, 66, 90, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Type:");
			label.setBounds(43, 91, 90, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Nombre d'heures:");
			label.setBounds(43, 116, 90, 14);
			contentPanel.add(label);
		}
		{
			textField_heures = new JTextField();
			textField_heures.setColumns(10);
			textField_heures.setBounds(179, 110, 120, 20);
			textField_heures.setText(vNbHeures);
			contentPanel.add(textField_heures);
		}
		{
			textField_type = new JTextField();
			textField_type.setColumns(10);
			textField_type.setBounds(179, 85, 120, 20);
			textField_type.setText(vType);
			contentPanel.add(textField_type);
		}
		{
			textField_date = new JTextField();
			textField_date.setColumns(10);
			textField_date.setBounds(179, 60, 120, 20);
			textField_date.setText(vDate);
			contentPanel.add(textField_date);
		}
		{
			textField_prenom = new JTextField();
			textField_prenom.setColumns(10);
			textField_prenom.setBounds(179, 36, 120, 20);
			textField_prenom.setText(vPrenom);
			contentPanel.add(textField_prenom);
		}
		{
			textField_nom = new JTextField();
			textField_nom.setColumns(10);
			textField_nom.setBounds(179, 11, 120, 20);
			textField_nom.setText(vNom);
			contentPanel.add(textField_nom);
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				//OK
				JButton okButton = new JButton("OK");
				okButton.setForeground(new Color(255, 255, 255));
				okButton.setFont(new Font("Tahoma", Font.BOLD, 11));
				okButton.setBackground(new Color(0, 0, 128));
				//on click save modification
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						vNom = textField_nom.getText();
						vPrenom = textField_prenom.getText();
						vDate = textField_date.getText();
						vType = textField_type.getText();
						vNbHeures = textField_heures.getText();						
						D_GestionEnseignantModification.this.dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				//cancel
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(255, 255, 255));
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 11));
				cancelButton.setBackground(new Color(0, 0, 128));
				//on click close this dialog
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						D_GestionEnseignantModification.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
