import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class HomeGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel background;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeGUI frame = new HomeGUI();
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
	public HomeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 722);
		background = new JPanel();
		background.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(background);
		background.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\home.png"));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(453, 23, 117, 48);
		background.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(901, 24, 106, 30);
		background.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Patient");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\patient.png"));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(49, 63, 153, 43);
		background.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Patient Details");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\details.png"));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(49, 413, 243, 48);
		background.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Admin");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\admin.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(102, 173, 160, 43);
		background.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Update/Delete Info");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\update.png"));
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(357, 173, 243, 43);
		background.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Treatment");
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\treatment.png"));
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(678, 173, 198, 43);
		background.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Discharge");
		btnNewButton_1_1_2.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\Dischanrge.png"));
		btnNewButton_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_2.setBounds(102, 300, 179, 43);
		background.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_2_1 = new JButton("Search Record");
		btnNewButton_1_1_2_1.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\search.png"));
		btnNewButton_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1_1_2_1.setBounds(368, 300, 232, 43);
		background.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_2_2 = new JButton("Room Entry");
		btnNewButton_1_1_2_2.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\roomEntry.png"));
		btnNewButton_1_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1_1_2_2.setBounds(678, 300, 198, 43);
		background.add(btnNewButton_1_1_2_2);
		
		JButton btnNewButton_2 = new JButton("Bill");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\bill.png"));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnNewButton_2.setBounds(153, 492, 167, 81);
		background.add(btnNewButton_2);
		
		JButton btnNewButton_1_1_2_3 = new JButton("Record Details");
		btnNewButton_1_1_2_3.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\details2.png"));
		btnNewButton_1_1_2_3.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnNewButton_1_1_2_3.setBounds(678, 495, 232, 74);
		background.add(btnNewButton_1_1_2_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\home.png"));
		lblNewLabel_2.setBounds(0, 0, 1035, 675);
		background.add(lblNewLabel_2);
	}
}
