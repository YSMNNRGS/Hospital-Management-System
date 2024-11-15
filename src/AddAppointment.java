import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddAppointment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAppointment frame = new AddAppointment();
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
	public AddAppointment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 733);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton next = new JButton("Next");
		next.setFont(new Font("Times New Roman", Font.BOLD, 18));
		next.setBounds(903, 9, 112, 34);
		contentPane.add(next);
		
		JButton Return = new JButton("Return");
		Return.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Return.setBounds(148, 0, 112, 34);
		contentPane.add(Return);
		
		JButton home = new JButton("Home");
		home.setFont(new Font("Times New Roman", Font.BOLD, 18));
		home.setBounds(10, 0, 112, 34);
		contentPane.add(home);
		
		JButton Discardbtn = new JButton("Discard");
		Discardbtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Discardbtn.setBounds(284, 374, 118, 30);
		contentPane.add(Discardbtn);
		
		JButton Savebtn = new JButton("Save");
		Savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Savebtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Savebtn.setBounds(501, 374, 112, 34);
		contentPane.add(Savebtn);
		
		JLabel SelectDoctorSp = new JLabel("Doctor Specialization");
		SelectDoctorSp.setFont(new Font("Times New Roman", Font.BOLD, 15));
		SelectDoctorSp.setBounds(813, 263, 140, 26);
		contentPane.add(SelectDoctorSp);
		
		JComboBox DoctorSpecializationSelect = new JComboBox();
		DoctorSpecializationSelect.setBounds(774, 263, 29, 30);
		contentPane.add(DoctorSpecializationSelect);
		
		JLabel SelectDoctorName = new JLabel("Doctor Name");
		SelectDoctorName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		SelectDoctorName.setBounds(661, 264, 103, 26);
		contentPane.add(SelectDoctorName);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(622, 263, 29, 30);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(334, 263, 229, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel Doctordetail = new JLabel("Doctor Name");
		Doctordetail.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Doctordetail.setBounds(148, 263, 118, 34);
		contentPane.add(Doctordetail);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(334, 209, 229, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Patientname = new JLabel("Patient Name");
		Patientname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Patientname.setBounds(148, 209, 118, 34);
		contentPane.add(Patientname);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setBounds(334, 151, 229, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel Patientid = new JLabel("Patient ID");
		Patientid.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Patientid.setBounds(148, 151, 132, 34);
		contentPane.add(Patientid);
		
		JLabel AddAppointment = new JLabel("ADD APPOINTMENT");
		AddAppointment.setFont(new Font("Times New Roman", Font.BOLD, 40));
		AddAppointment.setBounds(279, 81, 422, 48);
		contentPane.add(AddAppointment);
		
		JLabel Diplay = new JLabel("");
		Diplay.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Untitled design (1)\\appointment.png"));
		Diplay.setBounds(0, 10, 1038, 696);
		contentPane.add(Diplay);
	}
}
