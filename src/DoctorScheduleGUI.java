import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class DoctorScheduleGUI {
    private static HashMap<String, Doctor> doctorDatabase = new HashMap<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Doctor Schedule & Profile");
        frame.setSize(931, 731);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null); // Absolute layout

        // Custom JPanel for background image
        BackgroundPanel backgroundPanel = new BackgroundPanel("path_to_your_image.jpg");
        backgroundPanel.setLayout(null);
        frame.setContentPane(backgroundPanel); // Set background panel as the content pane
        
        JButton btnNewButton_1_1 = new JButton("Next");
        btnNewButton_1_1.setBackground(new Color(255, 255, 255));
        btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnNewButton_1_1.setBounds(796, 10, 85, 27);
        backgroundPanel.add(btnNewButton_1_1);
        
        JButton btnReturn = new JButton("Return");
        btnReturn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnReturn.setBounds(140, 10, 85, 27);
        backgroundPanel.add(btnReturn);
        
        JButton btnNewButton = new JButton("Home");
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnNewButton.setBounds(43, 10, 85, 25);
        backgroundPanel.add(btnNewButton);

        // Title Label
        JLabel titleLabel = new JLabel("Doctor Schedule & Profile", SwingConstants.CENTER);
        titleLabel.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\Doctor2.png"));
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
        titleLabel.setBounds(86, 47, 700, 50); // Centered title
        backgroundPanel.add(titleLabel);

        // Doctor Name
        JLabel lblDoctorName = new JLabel("Doctor Name:");
        lblDoctorName.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblDoctorName.setBounds(169, 124, 150, 25);
        JTextField txtDoctorName = new JTextField(20);
        txtDoctorName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
        txtDoctorName.setBounds(329, 124, 400, 25);
        backgroundPanel.add(lblDoctorName);
        backgroundPanel.add(txtDoctorName);

        // Specialization
        JLabel lblSpecialization = new JLabel("Specialization:");
        lblSpecialization.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblSpecialization.setBounds(169, 180, 150, 25);
        JTextField txtSpecialization = new JTextField(20);
        txtSpecialization.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
        txtSpecialization.setBounds(329, 181, 400, 25);
        backgroundPanel.add(lblSpecialization);
        backgroundPanel.add(txtSpecialization);

        // Education
        JLabel lblEducation = new JLabel("Education:");
        lblEducation.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblEducation.setBounds(169, 226, 150, 25);
        JTextField txtEducation = new JTextField(20);
        txtEducation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
        txtEducation.setBounds(329, 227, 400, 25);
        backgroundPanel.add(lblEducation);
        backgroundPanel.add(txtEducation);

        // Accreditation
        JLabel lblAccreditation = new JLabel("Accreditation:");
        lblAccreditation.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblAccreditation.setBounds(169, 274, 150, 25);
        JTextField txtAccreditation = new JTextField(20);
        txtAccreditation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
        txtAccreditation.setBounds(329, 278, 400, 25);
        backgroundPanel.add(lblAccreditation);
        backgroundPanel.add(txtAccreditation);

        // Licenses
        JLabel lblLicenses = new JLabel("Licenses:");
        lblLicenses.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblLicenses.setBounds(169, 332, 150, 25);
        JTextField txtLicenses = new JTextField(20);
        txtLicenses.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
        txtLicenses.setBounds(329, 333, 400, 25);
        backgroundPanel.add(lblLicenses);
        backgroundPanel.add(txtLicenses);

        // Experience
        JLabel lblExperience = new JLabel("Experience:");
        lblExperience.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblExperience.setBounds(169, 386, 150, 25);
        JTextField txtExperience = new JTextField(20);
        txtExperience.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
        txtExperience.setBounds(329, 387, 400, 25);
        backgroundPanel.add(lblExperience);
        backgroundPanel.add(txtExperience);

        // Availability
        JLabel lblAvailability = new JLabel("Availability:");
        lblAvailability.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblAvailability.setBounds(169, 433, 150, 25);
        JTextField txtAvailability = new JTextField(20);
        txtAvailability.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
        txtAvailability.setBounds(329, 434, 400, 25);
        backgroundPanel.add(lblAvailability);
        backgroundPanel.add(txtAvailability);

        // Buttons
        JButton btnSearch = new JButton("Search Doctor");
        btnSearch.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\search.png"));
        btnSearch.setBounds(140, 491, 211, 51);
        btnSearch.setFont(new Font("Arial", Font.BOLD, 14));
        JButton btnCheckSchedule = new JButton("Check Schedule");
        btnCheckSchedule.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\check.png"));
        btnCheckSchedule.setBounds(536, 491, 193, 51);
        btnCheckSchedule.setFont(new Font("Arial", Font.BOLD, 14));
        JButton btnUpdate = new JButton("Update Doctor Info");
        btnUpdate.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\update.png"));
        btnUpdate.setBounds(139, 570, 212, 48);
        btnUpdate.setFont(new Font("Arial", Font.BOLD, 14));
        JButton btnSave = new JButton("Save Doctor Info");
        btnSave.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\save.png"));
        btnSave.setBounds(536, 569, 193, 51);
        btnSave.setFont(new Font("Arial", Font.BOLD, 14));

        // Add action listeners for buttons
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String doctorName = txtDoctorName.getText().trim();
                if (doctorDatabase.containsKey(doctorName)) {
                    Doctor doctor = doctorDatabase.get(doctorName);
                    txtSpecialization.setText(doctor.getSpecialization());
                    txtEducation.setText(doctor.getEducation());
                    txtAccreditation.setText(doctor.getAccreditation());
                    txtLicenses.setText(doctor.getLicenses());
                    txtExperience.setText(doctor.getExperience());
                    txtAvailability.setText(doctor.getAvailability());
                } else {
                    JOptionPane.showMessageDialog(frame, "Doctor not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btnCheckSchedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String doctorName = txtDoctorName.getText().trim();
                if (doctorDatabase.containsKey(doctorName)) {
                    Doctor doctor = doctorDatabase.get(doctorName);
                    JOptionPane.showMessageDialog(frame, "Doctor Availability: " + doctor.getAvailability(),
                            "Schedule Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Doctor not found.", "Schedule Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String doctorName = txtDoctorName.getText().trim();
                if (doctorDatabase.containsKey(doctorName)) {
                    Doctor doctor = doctorDatabase.get(doctorName);
                    doctor.setSpecialization(txtSpecialization.getText());
                    doctor.setEducation(txtEducation.getText());
                    doctor.setAccreditation(txtAccreditation.getText());
                    doctor.setLicenses(txtLicenses.getText());
                    doctor.setExperience(txtExperience.getText());
                    doctor.setAvailability(txtAvailability.getText());
                    JOptionPane.showMessageDialog(frame, "Doctor information updated successfully.", "Update Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Doctor not found. Use 'Save' to add new doctor.", "Update Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String doctorName = txtDoctorName.getText().trim();
                if (!doctorName.isEmpty()) {
                    Doctor newDoctor = new Doctor(
                            doctorName,
                            txtSpecialization.getText(),
                            txtEducation.getText(),
                            txtAccreditation.getText(),
                            txtLicenses.getText(),
                            txtExperience.getText(),
                            txtAvailability.getText()
                    );
                    doctorDatabase.put(doctorName, newDoctor);
                    JOptionPane.showMessageDialog(frame, "Doctor information saved successfully.", "Save Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter a doctor name.", "Save Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add buttons to frame
        backgroundPanel.add(btnSearch);
        backgroundPanel.add(btnCheckSchedule);
        backgroundPanel.add(btnUpdate);
        backgroundPanel.add(btnSave);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Untitled design (1)\\doctor info.png"));
        lblNewLabel.setBounds(10, 0, 897, 684);
        backgroundPanel.add(lblNewLabel);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Set the frame visible
        frame.setVisible(true);
    }
}

// Custom JPanel for background image
class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String imagePath) {
        this.backgroundImage = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the background image
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}

// Doctor class to hold information about each doctor
class Doctor {
    private String name;
    private String specialization;
    private String education;
    private String accreditation;
    private String licenses;
    private String experience;
    private String availability;

    public Doctor(String name, String specialization, String education, String accreditation, String licenses, String experience, String availability) {
        this.name = name;
        this.specialization = specialization;
        this.education = education;
        this.accreditation = accreditation;
        this.licenses = licenses;
        this.experience = experience;
        this.availability = availability;
    }

    public String getSpecialization() { return specialization; }
    public String getEducation() { return education; }
    public String getAccreditation() { return accreditation; }
    public String getLicenses() { return licenses; }
    public String getExperience() { return experience; }
    public String getAvailability() { return availability; }

    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public void setEducation(String education) { this.education = education; }
    public void setAccreditation(String accreditation) { this.accreditation = accreditation; }
    public void setLicenses(String licenses) { this.licenses = licenses; }
    public void setExperience(String experience) { this.experience = experience; }
    public void setAvailability(String availability) { this.availability = availability; }
}
