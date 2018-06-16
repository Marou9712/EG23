package projet_eg23;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class BD_ChoixPositionnement extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void openBD() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BD_ChoixPositionnement frame = new BD_ChoixPositionnement();
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
	public BD_ChoixPositionnement() {
		setTitle("Choix positionnement");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\images.jpg"));
		setBounds(100, 100, 400, 255);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBounds(0, 0, 400, 255);
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BD_ChoixPositionnement.this.dispose();
			}
		});
		btnAnnuler.setBounds(55, 178, 89, 23);
		contentPane.add(btnAnnuler);
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BD_ChoixPositionnement.this.dispose();
			}
		});
		btnOk.setBounds(227, 178, 89, 23);
		contentPane.add(btnOk);
		
		
		JRadioButton rdbtnSt = new JRadioButton("TCBR");
		rdbtnSt.setBounds(20, 15, 141, 23);
		contentPane.add(rdbtnSt);
		
		JRadioButton rdbtnSt_1 = new JRadioButton("ST09");
		rdbtnSt_1.setBounds(20, 45, 141, 23);
		contentPane.add(rdbtnSt_1);
		
		JRadioButton rdbtnMsi = new JRadioButton("MSI");
		rdbtnMsi.setBounds(20, 75, 141, 23);
		contentPane.add(rdbtnMsi);
		
		JRadioButton rdbtnMpl = new JRadioButton("MPL");
		rdbtnMpl.setBounds(20, 105, 141, 23);
		contentPane.add(rdbtnMpl);
		
		JRadioButton rdbtnMri = new JRadioButton("MRI");
		rdbtnMri.setBounds(20, 135, 141, 23);
		contentPane.add(rdbtnMri);
		
		JRadioButton rdbtnSt_2 = new JRadioButton("ST10");
		rdbtnSt_2.setBounds(215, 15, 141, 23);
		contentPane.add(rdbtnSt_2);
		
		JRadioButton rdbtnSt_3 = new JRadioButton("ST51");
		rdbtnSt_3.setBounds(215, 45, 141, 23);
		contentPane.add(rdbtnSt_3);
		
		JRadioButton rdbtnSt_4 = new JRadioButton("ST52");
		rdbtnSt_4.setBounds(215, 75, 141, 23);
		contentPane.add(rdbtnSt_4);
		
		JRadioButton rdbtnMaster = new JRadioButton("Master");
		rdbtnMaster.setBounds(215, 105, 141, 23);
		contentPane.add(rdbtnMaster);
		
	}
}
