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
		
		JLabel homeTitle = new JLabel("Home");
		homeTitle.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\home.png"));
		homeTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
		homeTitle.setBounds(453, 23, 117, 48);
		background.add(homeTitle);
		
		JButton logoutBtn = new JButton("LOGOUT");
        logoutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
		logoutBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
		logoutBtn.setBounds(901, 24, 106, 30);
		background.add(logoutBtn);
		
		JLabel titleText = new JLabel("Patient");
		titleText.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\patient.png"));
		titleText.setFont(new Font("Times New Roman", Font.BOLD, 30));
		titleText.setBounds(49, 63, 153, 43);
		background.add(titleText);
		
		JLabel patientDetails = new JLabel("Patient Details");
		patientDetails.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\details.png"));
		patientDetails.setFont(new Font("Times New Roman", Font.BOLD, 30));
		patientDetails.setBounds(49, 413, 243, 48);
		background.add(patientDetails);
		
		JButton AdminBtn = new JButton("Admin");
		AdminBtn.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\admin.png"));
		AdminBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		AdminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AdminBtn.setBounds(102, 173, 160, 43);
		background.add(AdminBtn);
		
		JButton updateInfoBtn = new JButton("Update/Delete Info");
		updateInfoBtn.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\update.png"));
		updateInfoBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		updateInfoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		updateInfoBtn.setBounds(357, 173, 243, 43);
		background.add(updateInfoBtn);
		
		JButton treatmentBtn = new JButton("Treatment");
		treatmentBtn.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\treatment.png"));
		treatmentBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		treatmentBtn.setBounds(678, 173, 198, 43);
		background.add(treatmentBtn);
		
		JButton DischargedBtn = new JButton("Discharge");
		DischargedBtn.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\Dischanrge.png"));
		DischargedBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		DischargedBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		DischargedBtn.setBounds(102, 300, 179, 43);
		background.add(DischargedBtn);
		
		JButton searchBtn = new JButton("Search Record");
		searchBtn.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\search.png"));
		searchBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		searchBtn.setBounds(368, 300, 232, 43);
		background.add(searchBtn);
		
		JButton RoomBtn = new JButton("Room Entry");
		RoomBtn.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\roomEntry.png"));
		RoomBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		RoomBtn.setBounds(678, 300, 198, 43);
		background.add(RoomBtn);
		
		JButton BillBtn = new JButton("Bill");
		BillBtn.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\bill.png"));
		BillBtn.setFont(new Font("Times New Roman", Font.BOLD, 23));
		BillBtn.setBounds(153, 492, 167, 81);
		BillBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Open the BillingSystemGUI page when clicked
		        BillingSystemGUI billingSystemFrame = new BillingSystemGUI();
		        billingSystemFrame.setVisible(true);
		    }
		});
		background.add(BillBtn);

		JButton recordsBtn = new JButton("Record Details");
		recordsBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Open the PatientDetail page when clicked
		        PatientDetail patientDetailFrame = new PatientDetail();
		        patientDetailFrame.setVisible(true);
		    }
		});

		recordsBtn.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\details2.png"));
		recordsBtn.setFont(new Font("Times New Roman", Font.BOLD, 23));
		recordsBtn.setBounds(678, 495, 232, 74);
		background.add(recordsBtn);
		
		JLabel backgroundPic = new JLabel("");
		backgroundPic.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital-Management-backgrounds-icons\\HomePage.png"));
		backgroundPic.setBounds(0, 0, 1035, 675);
		background.add(backgroundPic);
	}
}
