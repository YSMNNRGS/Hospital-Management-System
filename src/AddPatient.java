import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AddPatient {
    private ArrayList<Patient> patientsList = new ArrayList<>();

    // Add a new patient to the list
    public void addPatient(String name, String cnic, String dob, String gender, String contact, String history) {
        if (name.trim().isEmpty() || cnic.trim().isEmpty() || dob.trim().isEmpty() ||
            gender.trim().isEmpty() || contact.trim().isEmpty() || history.trim().isEmpty()) {
            throw new IllegalArgumentException("All fields must be filled!");
        }

        Patient newPatient = new Patient(name, cnic, dob, gender, contact, history, null);
        patientsList.add(newPatient);
        savePatientToFile(newPatient);
        System.out.println("Patient added successfully: " + name);
    }

    // Save patient data to a file
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
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }

    // Print all patients for verification
    public void printAllPatients() {
        for (Patient patient : patientsList) {
            System.out.println(patient);
        }
    }
}
