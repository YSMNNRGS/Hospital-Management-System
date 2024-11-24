import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillingSystemGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hospital Billing System");
        frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 14));
        frame.setSize(1055, 779); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null); // Set absolute layout
        
        JButton btnNext = new JButton("Next");
        btnNext.setBackground(new Color(255, 255, 255));
        btnNext.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        JLabel titleHeader = new JLabel("Billing System");
        titleHeader.setFont(new Font("Times New Roman", Font.BOLD, 32));
        titleHeader.setBounds(394, 52, 238, 64);
        frame.getContentPane().add(titleHeader);
        btnNext.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnNext.setBounds(831, 20, 95, 30);
        frame.getContentPane().add(btnNext);
        
        JButton btnReturn = new JButton("Return");
        btnReturn.setBackground(new Color(255, 255, 255));
        btnReturn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnReturn.setForeground(new Color(0, 0, 0));
        btnReturn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnReturn.setBounds(153, 14, 81, 30);
        frame.getContentPane().add(btnReturn);
        
        JButton HomeBtn = new JButton("Home");
        HomeBtn.setBackground(new Color(255, 255, 255));
        HomeBtn.setForeground(new Color(0, 0, 0));
        HomeBtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        HomeBtn.setBounds(25, 14, 81, 30);
        frame.getContentPane().add(HomeBtn);
        HomeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the current AddPatientGUI window
                //BillingSystemGUI.this.dispose();

                // Open the HomeGUI window
                HomeGUI homeFrame = new HomeGUI();
                homeFrame.setVisible(true);
            }
        });

        // Patient ID
        JLabel lblPatientID = new JLabel("Patient ID:");
        lblPatientID.setForeground(new Color(0, 0, 0));
        lblPatientID.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblPatientID.setBounds(195, 126, 151, 43);
        JTextField txtPatientID = new JTextField(20);
        txtPatientID.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txtPatientID.setBounds(396, 126, 238, 43);
        frame.getContentPane().add(lblPatientID);
        frame.getContentPane().add(txtPatientID);

        // Patient Name
        JLabel lblPatientName = new JLabel("Patient Name:");
        lblPatientName.setForeground(new Color(0, 0, 0));
        lblPatientName.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblPatientName.setBounds(195, 226, 116, 25);
        JTextField txtPatientName = new JTextField(20);
        txtPatientName.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txtPatientName.setBounds(398, 217, 236, 43);
        frame.getContentPane().add(lblPatientName);
        frame.getContentPane().add(txtPatientName);

        // Service Cost
        JLabel lblServiceCost = new JLabel("Service Cost:");
        lblServiceCost.setForeground(new Color(0, 0, 0));
        lblServiceCost.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblServiceCost.setBounds(195, 318, 130, 25);
        JTextField txtServiceCost = new JTextField(10);
        txtServiceCost.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txtServiceCost.setBounds(396, 306, 236, 49);
        frame.getContentPane().add(lblServiceCost);
        frame.getContentPane().add(txtServiceCost);

        // Medication Cost
        JLabel lblMedicationCost = new JLabel("Medication Cost:");
        lblMedicationCost.setForeground(new Color(0, 0, 0));
        lblMedicationCost.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblMedicationCost.setBounds(195, 407, 151, 25);
        JTextField txtMedicationCost = new JTextField(10);
        txtMedicationCost.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txtMedicationCost.setBounds(394, 398, 238, 43);
        frame.getContentPane().add(lblMedicationCost);
        frame.getContentPane().add(txtMedicationCost);

        // Total Cost
        JLabel lblTotalCost = new JLabel("Total Cost:");
        lblTotalCost.setForeground(new Color(0, 0, 0));
        lblTotalCost.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblTotalCost.setBounds(195, 497, 100, 25);
        JTextField txtTotalCost = new JTextField(10);
        txtTotalCost.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txtTotalCost.setBounds(396, 488, 238, 43);
        txtTotalCost.setEditable(false);
        frame.getContentPane().add(lblTotalCost);
        frame.getContentPane().add(txtTotalCost);

        // Calculate Button
        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setForeground(new Color(0, 0, 0));
        btnCalculate.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital System related icons - png\\calculate.png"));
        btnCalculate.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnCalculate.setBounds(425, 594, 166, 43);
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double serviceCost = Double.parseDouble(txtServiceCost.getText());
                    double medicationCost = Double.parseDouble(txtMedicationCost.getText());
                    double totalCost = serviceCost + medicationCost;
                    txtTotalCost.setText(String.format("PKR %.2f", totalCost));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.getContentPane().add(btnCalculate);
        
        JLabel background = new JLabel("");
        background.setForeground(new Color(255, 255, 255));
        background.setFont(new Font("Times New Roman", Font.BOLD, 14));
        background.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\Hospital-Management-backgrounds-icons\\appointment.png"));
        background.setBounds(-8, 7, 1039, 725);
        frame.getContentPane().add(background);

      
        frame.setLocationRelativeTo(null);

        // Set the window visible
        frame.setVisible(true);
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
