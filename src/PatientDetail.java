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
    private JTextField recievePatientID;

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

    public PatientDetail() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 933, 721);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton ChangeDoc = new JButton("Change Doctor");
        ChangeDoc.setFont(new Font("Times New Roman", Font.BOLD, 16));
        ChangeDoc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        recievePatientID = new JTextField();
        recievePatientID.setFont(new Font("Times New Roman", Font.BOLD, 13));
        recievePatientID.setBounds(393, 144, 141, 33);
        contentPane.add(recievePatientID);
        recievePatientID.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Enter Patient ID");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel_1.setBounds(187, 144, 226, 33);
        contentPane.add(lblNewLabel_1);

        JButton btnNext = new JButton("Next");
        btnNext.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnNext.setBounds(737, 21, 107, 33);
        contentPane.add(btnNext);

        JButton btnTeturn = new JButton("Return");
        btnTeturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnTeturn.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnTeturn.setBounds(167, 25, 97, 29);
        contentPane.add(btnTeturn);

        JButton HomeBtn = new JButton("Home");
        HomeBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
        HomeBtn.setBounds(34, 21, 97, 33);
        contentPane.add(HomeBtn);
        HomeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the current PatientDetail window
                PatientDetail.this.dispose();

                // Open the HomeGUI window
                HomeGUI homeFrame = new HomeGUI();
                homeFrame.setVisible(true);
            }
        });

        ChangeDoc.setBounds(362, 400, 153, 60);
        contentPane.add(ChangeDoc);

        JButton btnUpdatePatient = new JButton("Update Patient");
        btnUpdatePatient.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnUpdatePatient.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                // Close the current window (PatientDetail)
                PatientDetail.this.dispose();

                // Open the Add Patient screen
                AddPatientGUI addPatientFrame = new AddPatientGUI();
                addPatientFrame.setVisible(true);
            }
        });
        btnUpdatePatient.setBounds(583, 245, 153, 60);
        contentPane.add(btnUpdatePatient);

        JButton btnRemovePatient = new JButton("Remove Patient");
        btnRemovePatient.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnRemovePatient.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                // Close the current window (PatientDetail)
                PatientDetail.this.dispose();

                // Open the Add Patient screen
                AddPatientGUI addPatientFrame = new AddPatientGUI();
                addPatientFrame.setVisible(true);
            }
        });
        btnRemovePatient.setBounds(343, 245, 153, 60);
        contentPane.add(btnRemovePatient);

        // "Add Patient" button action
        JButton addPatient = new JButton("Add Patient");
        addPatient.setFont(new Font("Times New Roman", Font.BOLD, 16));
        addPatient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the current window (PatientDetail)
                PatientDetail.this.dispose();

                // Open the Add Patient screen
                AddPatientGUI addPatientFrame = new AddPatientGUI();
                addPatientFrame.setVisible(true);
            }
        });
        addPatient.setBounds(126, 245, 153, 60); // Set the bounds for the button
        contentPane.add(addPatient);

        JLabel title = new JLabel("Patient Details");
        title.setFont(new Font("Times New Roman", Font.BOLD, 45));
        title.setBounds(265, 52, 368, 60);
        contentPane.add(title);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital-Management-backgrounds-icons\\PatientDetailPage.png"));
        lblNewLabel.setBounds(10, 10, 899, 664);
        contentPane.add(lblNewLabel);
    }
}
