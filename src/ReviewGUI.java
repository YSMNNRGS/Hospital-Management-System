import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JList;

public class ReviewGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField recieveFeedback;
	private JTextField recieveEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReviewGUI frame = new ReviewGUI();
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
	public ReviewGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1154, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		recieveFeedback = new JTextField();
		recieveFeedback.setBounds(323, 142, 455, 228);
		contentPane.add(recieveFeedback);
		recieveFeedback.setColumns(10);
		
		recieveEmail = new JTextField();
		recieveEmail.setBounds(323, 436, 455, 39);
		contentPane.add(recieveEmail);
		recieveEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(365, 392, 338, 34);
		contentPane.add(lblNewLabel_2);
		
		JButton btnSend = new JButton("Send");
		btnSend.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\send.png"));
		btnSend.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSend.setBounds(728, 555, 124, 54);
		contentPane.add(btnSend);
		
		JButton btnDiscard = new JButton("Discard");
		btnDiscard.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\Discard.png"));
		btnDiscard.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnDiscard.setBounds(255, 545, 141, 54);
		contentPane.add(btnDiscard);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogout.setBounds(864, 10, 85, 21);
		contentPane.add(btnLogout);
		
		JLabel title = new JLabel("Share your Feedback and Opinion");
		title.setFont(new Font("Times New Roman", Font.BOLD, 25));
		title.setBounds(365, 68, 389, 70);
		contentPane.add(title);
		
		JButton home = new JButton("Home");
		home.setFont(new Font("Times New Roman", Font.BOLD, 14));
		home.setBounds(92, 10, 85, 21);
		contentPane.add(home);
		
		JButton retrun = new JButton("Return");
		retrun.setFont(new Font("Times New Roman", Font.BOLD, 14));
		retrun.setBounds(187, 10, 85, 21);
		contentPane.add(retrun);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Untitled design (1)\\thankyou.png"));
		lblNewLabel.setBounds(10, 0, 1120, 695);
		contentPane.add(lblNewLabel);
	}
}
