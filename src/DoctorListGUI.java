import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DoctorListGUI {

    public static void main(String[] args) {
        // Create a JFrame for the Doctor List window
        JFrame frame = new JFrame("Doctor List");
        frame.setSize(958, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null); // Absolute layout to position elements manually
        
        // Custom JPanel for background image (optional)
        BackgroundPanel backgroundPanel = new BackgroundPanel("path_to_your_image.jpg"); // Set a background image path
        backgroundPanel.setLayout(null);
        frame.setContentPane(backgroundPanel);

        // Column headers for the table
        String[] columnHeaders = {"Doctor's Name", "Specialization", "Availability", "Licenses", "Contact", "Room Number"};

        // Data model for the table (initially empty)
        DefaultTableModel model = new DefaultTableModel(columnHeaders, 0);

        // JTable to display doctor information
        JTable doctorTable = new JTable(model);
        doctorTable.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        // JScrollPane to add a scrollbar for the table
        JScrollPane scrollPane = new JScrollPane(doctorTable);
        scrollPane.setBounds(30, 100, 890, 350); // Positioning the table
        backgroundPanel.add(scrollPane);

        // Button to load doctor data from the file
        JButton btnLoadData = new JButton("Load Doctor Data");
        btnLoadData.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnLoadData.setBounds(340, 480, 250, 50); // Positioning the button
        btnLoadData.setBackground(new Color(135, 206, 235)); // Light blue color
        btnLoadData.setForeground(Color.BLACK);
        backgroundPanel.add(btnLoadData);

        // Action listener for the "Load Doctor Data" button
        btnLoadData.addActionListener(e -> {
            model.setRowCount(0); // Clear the existing rows in the table

            // Read the data from the file and populate the table
            try (BufferedReader reader = new BufferedReader(new FileReader("availableStuff.txt"))) {
                String line;
                String[] doctorData = new String[6];
                int index = 0;

                while ((line = reader.readLine()) != null) {
                    // If we encounter a separator line, it indicates the end of the current doctor's info
                    if (line.trim().equals("---------------------------------------------------")) {
                        // Add the data as a new row in the table if we've collected all 6 details
                        if (index == 6) {
                            model.addRow(doctorData);
                        }
                        // Reset index to start collecting next doctor's data
                        index = 0;
                    } else {
                        // Collect the doctor's data
                        doctorData[index] = line;
                        index++;
                    }
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error reading doctor data from file.", "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        });

        // Title Label
        JLabel titleLabel = new JLabel("Doctor List", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
        titleLabel.setBounds(320, 30, 300, 50); // Positioning the title at the top
        backgroundPanel.add(titleLabel);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nargi\\Downloads\\doctorsList.png"));
        lblNewLabel.setBounds(10, 0, 924, 553);
        backgroundPanel.add(lblNewLabel);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Custom JPanel for background image
    static class BackgroundPanel extends JPanel {
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
}
