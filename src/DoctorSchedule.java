import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DoctorSchedule {

    // Method to save doctor information to a file
    public static boolean saveDoctorInfo(String doctorName, String specialization, String availability, 
                                         String licenses, String contact, String roomNumber, String filePath) {
        if (doctorName == null || doctorName.trim().isEmpty()) {
            return false; 
        }

        
        String doctorInfo = doctorName + "\n" +    // Doctor's Name
                specialization + "\n" +           // Specialization
                availability + "\n" +             // Availability
                licenses + "\n" +                 // Licenses
                contact + "\n" +                  // Contact
                roomNumber + "\n" +               // Room Number
                "---------------------------------------------------\n"; 

        // Write the doctor info to the specified file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(doctorInfo);
            return true; // Indicates successful saving
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; 
        }
    }

    
    public static String checkDoctorAvailability(String availability) {
        return availability != null && !availability.trim().isEmpty()
                ? "Doctor Availability: " + availability
                : "No availability information provided.";
    }
}
