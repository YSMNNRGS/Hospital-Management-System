import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class AddPatientGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField recieveName;
	private JTextField recieveCNIC;
	private JTextField recieveAge;
	private JTextField recieveGender;
	private JTextField recieveContact;
	private JTextField recieveHistory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPatientGUI frame = new AddPatientGUI();
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
	public AddPatientGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029, 712);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton save = new JButton("Save");
		save.setBackground(new Color(95, 154, 160));
		save.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\save.png"));
		save.setFont(new Font("Times New Roman", Font.BOLD, 18));
		save.setBounds(499, 601, 134, 44);
		contentPane.add(save);
		
		recieveHistory = new JTextField();
		recieveHistory.setColumns(10);
		recieveHistory.setBounds(504, 463, 221, 105);
		contentPane.add(recieveHistory);
		
		recieveContact = new JTextField();
		recieveContact.setColumns(10);
		recieveContact.setBounds(504, 396, 146, 33);
		contentPane.add(recieveContact);
		
		recieveGender = new JTextField();
		recieveGender.setColumns(10);
		recieveGender.setBounds(504, 345, 146, 33);
		contentPane.add(recieveGender);
		
		recieveAge = new JTextField();
		recieveAge.setColumns(10);
		recieveAge.setBounds(504, 288, 146, 33);
		contentPane.add(recieveAge);
		
		recieveCNIC = new JTextField();
		recieveCNIC.setColumns(10);
		recieveCNIC.setBounds(504, 234, 146, 33);
		contentPane.add(recieveCNIC);
		
		recieveName = new JTextField();
		recieveName.setBounds(504, 177, 146, 33);
		contentPane.add(recieveName);
		recieveName.setColumns(10);
		
		JLabel history = new JLabel("History:");
		history.setFont(new Font("Times New Roman", Font.BOLD, 23));
		history.setBounds(335, 463, 87, 27);
		contentPane.add(history);
		
		JLabel contact = new JLabel("Contact:");
		contact.setFont(new Font("Times New Roman", Font.BOLD, 23));
		contact.setBounds(335, 396, 126, 33);
		contentPane.add(contact);
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Times New Roman", Font.BOLD, 23));
		gender.setBounds(335, 353, 109, 25);
		contentPane.add(gender);
		
		JLabel age = new JLabel("Age:");
		age.setFont(new Font("Times New Roman", Font.BOLD, 23));
		age.setBounds(335, 296, 95, 25);
		contentPane.add(age);
		
		JLabel cnic = new JLabel("CNIC:");
		cnic.setFont(new Font("Times New Roman", Font.BOLD, 23));
		cnic.setBounds(335, 234, 109, 21);
		contentPane.add(cnic);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Times New Roman", Font.BOLD, 23));
		name.setBounds(335, 176, 95, 30);
		contentPane.add(name);
		
		JLabel title = new JLabel("Add Patient");
		title.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\addPatient.png"));
		title.setFont(new Font("Times New Roman", Font.BOLD, 40));
		title.setBounds(387, 66, 283, 44);
		contentPane.add(title);
		
		JLabel background = new JLabel("");
		background.setFont(new Font("Times New Roman", Font.BOLD, 23));
		background.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Untitled design (1)\\admit patient.png"));
		background.setBounds(0, 10, 1045, 675);
		contentPane.add(background);
	}
}
