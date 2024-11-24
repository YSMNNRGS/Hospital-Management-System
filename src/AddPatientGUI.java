import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;

public class AddPatientGUI extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField recieveName;
    private JTextField recieveCNIC;
    private JTextField recieveAge;
    private JTextField recieveGender;
    private JTextField recieveContact;
    private JTextField recieveHistory;
    private DefaultTableModel tableModel;
    private JTable table;
    private ArrayList<Patient> patientsList = new ArrayList<>();

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

    public AddPatientGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1029, 712);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Times New Roman", Font.BOLD, 23));
        gender.setBounds(490, 356, 95, 21);
        contentPane.add(gender);
        
        JButton returnBtn = new JButton("Return");
        returnBtn.setFont(new Font("Times New Roman", Font.BOLD, 11));
        returnBtn.setBounds(154, 21, 85, 21);
        contentPane.add(returnBtn);
        
        JButton HomeBtn = new JButton("Home");
        HomeBtn.setFont(new Font("Times New Roman", Font.BOLD, 11));
        HomeBtn.setBounds(47, 21, 85, 21);
        contentPane.add(HomeBtn);
        HomeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddPatientGUI.this.dispose();
                HomeGUI homeFrame = new HomeGUI();
                homeFrame.setVisible(true);
            }
        });

        // Initialize text fields
        recieveName = new JTextField();
        recieveName.setBounds(633, 178, 146, 33);
        contentPane.add(recieveName);
        recieveName.setColumns(10);

        recieveCNIC = new JTextField();
        recieveCNIC.setColumns(10);
        recieveCNIC.setBounds(633, 235, 146, 33);
        contentPane.add(recieveCNIC);

        recieveAge = new JTextField();
        recieveAge.setColumns(10);
        recieveAge.setBounds(633, 289, 146, 33);
        contentPane.add(recieveAge);

        recieveGender = new JTextField();
        recieveGender.setColumns(10);
        recieveGender.setBounds(633, 346, 146, 33);
        contentPane.add(recieveGender);

        recieveContact = new JTextField();
        recieveContact.setColumns(10);
        recieveContact.setBounds(633, 397, 146, 33);
        contentPane.add(recieveContact);

        recieveHistory = new JTextField();
        recieveHistory.setColumns(10);
        recieveHistory.setBounds(633, 464, 221, 105);
        contentPane.add(recieveHistory);

        // Create save button
        JButton save = new JButton("Save");
        save.setBackground(new Color(255, 255, 255));
        save.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\save.png"));
        save.setFont(new Font("Times New Roman", Font.BOLD, 18));
        save.setBounds(628, 602, 134, 44);
        contentPane.add(save);

        // Table setup
        String[] columnNames = {"Name", "DoB", "Admission Date"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(28, 115, 452, 518);
        contentPane.add(scrollPane);

        // Add ActionListener to the save button
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Check if any field is empty
                if (recieveName.getText().trim().isEmpty() || recieveCNIC.getText().trim().isEmpty() ||
                    recieveAge.getText().trim().isEmpty() || recieveGender.getText().trim().isEmpty() ||
                    recieveContact.getText().trim().isEmpty() || recieveHistory.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(AddPatientGUI.this, "Enter all data!");
                } else {
                    // Create a new patient
                    Patient newPatient = new Patient(
                        recieveName.getText(),
                        recieveCNIC.getText(),
                        recieveAge.getText(),
                        recieveGender.getText(),
                        recieveContact.getText(),
                        recieveHistory.getText()
                    );
                    patientsList.add(newPatient);

                    // Show success message
                    JOptionPane.showMessageDialog(AddPatientGUI.this, "Data added successfully!");

                    // Clear the fields after saving
                    recieveName.setText("");
                    recieveCNIC.setText("");
                    recieveAge.setText("");
                    recieveGender.setText("");
                    recieveContact.setText("");
                    recieveHistory.setText("");

                    // Update the table
                    updatePatientTable();

                    // Save patient data to the file
                    savePatientToFile(newPatient);
                }
            }
        });

        JLabel history = new JLabel("History:");
        history.setFont(new Font("Times New Roman", Font.BOLD, 23));
        history.setBounds(490, 469, 87, 27);
        contentPane.add(history);

        JLabel contact = new JLabel("Contact:");
        contact.setFont(new Font("Times New Roman", Font.BOLD, 23));
        contact.setBounds(490, 402, 126, 33);
        contentPane.add(contact);

        // Add combo box for gender selection (M, F, Neither)
        JComboBox<String> genderComboBox = new JComboBox<>(new String[]{"M", "F", "Neither"});
        genderComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        genderComboBox.setBounds(633, 346, 146, 33);
        contentPane.add(genderComboBox);

        JLabel age = new JLabel("Date of Birth:");
        age.setFont(new Font("Times New Roman", Font.BOLD, 20));
        age.setBounds(490, 291, 133, 25);
        contentPane.add(age);

        JLabel cnic = new JLabel("CNIC:");
        cnic.setFont(new Font("Times New Roman", Font.BOLD, 23));
        cnic.setBounds(490, 240, 109, 21);
        contentPane.add(cnic);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Times New Roman", Font.BOLD, 23));
        name.setBounds(490, 182, 95, 30);
        contentPane.add(name);

        JLabel title = new JLabel("Add Patient");
        title.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\addPatient.png"));
        title.setFont(new Font("Times New Roman", Font.BOLD, 40));
        title.setBounds(516, 67, 283, 44);
        contentPane.add(title);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital-Management-backgrounds-icons\\AddPatient.png"));
        lblNewLabel.setBounds(10, -2, 995, 667);
        contentPane.add(lblNewLabel);
    }

    // Update patient table
    private void updatePatientTable() {
        // Clear the table model
        tableModel.setRowCount(0);

        // Get today's date in the same format
        String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        // Loop through the patients list and add them to the table
        for (Patient patient : patientsList) {
            Object[] row = {
                patient.getName(),
                patient.getCnic(),
                patient.getAge(),
                patient.getGender(),
                patient.getContact(),
                patient.getHistory(),
                patient.getAdmissionDate()
            };
            tableModel.addRow(row);
        }
    }

    // Save patient data to file
    private void savePatientToFile(Patient patient) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("savedPatients.txt", true))) {
            writer.write(patient.getName() + "|" +
                         patient.getCnic() + "|" +
                         patient.getAge() + "|" +
                         patient.getGender() + "|" +
                         patient.getContact() + "|" +
                         patient.getHistory() + "|" +
                         new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving data to file!");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Not used in this example
    }
}
