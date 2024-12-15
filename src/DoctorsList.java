import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DoctorsList {

    // Method to load doctor data from a file and return as a list of arrays
    public static List<String[]> loadDoctorData(String filePath) {
        List<String[]> doctorDataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String[] doctorData = new String[6];
            int index = 0;

            while ((line = reader.readLine()) != null) {
                // If we encounter a separator line, it indicates the end of the current doctor's info
                if (line.trim().equals("---------------------------------------------------")) {
                    if (index == 6) {
                        doctorDataList.add(doctorData.clone()); // Add the completed doctor data
                    }
                    index = 0; 
                } else {
                    doctorData[index] = line;
                    index++;
                }
            }
        } catch (IOException ex) {
            System.err.println("Error reading doctor data from file: " + ex.getMessage());
            ex.printStackTrace();
        }

        return doctorDataList;
    }

    // Method to get column headers for the doctor data
    public static String[] getColumnHeaders() {
        return new String[]{"Doctor's Name", "Specialization", "Availability", "Licenses", "Contact", "Room Number"};
    }
}