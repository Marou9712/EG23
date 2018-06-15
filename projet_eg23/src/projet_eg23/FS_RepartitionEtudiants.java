package projet_eg23;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FS_RepartitionEtudiants extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
