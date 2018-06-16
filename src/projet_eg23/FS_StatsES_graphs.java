package projet_eg23;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FS_StatsES_graphs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * Data correspond to the type of data we want to see in the graph
	 */
	public static void openGraph(String data) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//create the frame
					FS_StatsES_graphs frame = new FS_StatsES_graphs(data);
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
	public FS_StatsES_graphs(String data) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //on click on the cross, close the current frame
		setBounds(100, 100, 652, 411);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\images.jpg"));
		setTitle("Gestion UTT");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//show the corresponding graph, for now, we can just show one image because of the static context, 
		// although we wanted to try 2 different graphs
		JLabel label = new JLabel("");
		String uri;
		switch(data) {
		case "tc":
			uri = "admission_tc.PNG";
			break;
		default:
			uri = "admission_iut.PNG";
			break;
		}
		//set the icon
		label.setIcon(new ImageIcon("C:\\Users\\Marion\\Documents\\ISI_utt\\Semestre6\\EG23\\Projet\\projet_eg23\\images\\" + uri));
		label.setBounds(0, 0, 636, 379);
		contentPane.add(label);
	}
}
