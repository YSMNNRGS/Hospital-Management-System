import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PatientDetail extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientDetail frame = new PatientDetail();
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
	public PatientDetail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2_1 = new JButton("Change Doctor");
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNext.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\next.png"));
		btnNext.setBounds(737, 21, 107, 33);
		contentPane.add(btnNext);
		
		JButton btnTeturn = new JButton("Return");
		btnTeturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTeturn.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\return.png"));
		btnTeturn.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTeturn.setBounds(172, 21, 121, 33);
		contentPane.add(btnTeturn);
		
		JButton home = new JButton("Home");
		home.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\home.png"));
		home.setFont(new Font("Tahoma", Font.BOLD, 13));
		home.setBounds(34, 21, 121, 33);
		contentPane.add(home);
		btnNewButton_2_1.setBounds(362, 400, 153, 60);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnUpdatePatient = new JButton("Update Patient");
		btnUpdatePatient.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnUpdatePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdatePatient.setBounds(583, 245, 153, 60);
		contentPane.add(btnUpdatePatient);
		
		JButton btnRemovePatient = new JButton("Remove Patient");
		btnRemovePatient.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRemovePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemovePatient.setBounds(374, 245, 153, 60);
		contentPane.add(btnRemovePatient);
		
		JButton btnNewButton = new JButton("Add Patient");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(167, 245, 153, 60);
		contentPane.add(btnNewButton);
		
		JLabel title = new JLabel("Patient Details");
		title.setFont(new Font("Times New Roman", Font.BOLD, 45));
		title.setBounds(254, 66, 368, 60);
		contentPane.add(title);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\details.png"));
		lblNewLabel.setBounds(10, 10, 899, 664);
		contentPane.add(lblNewLabel);
	}

}
