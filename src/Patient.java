import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient {
    private String name;
    private String cnic;
    private String age;
    private String gender;
    private String contact;
    private String history;
    private String admissionDate;

    // Constructor
    public Patient(String name, String cnic, String age, String gender, String contact, String history) {
        this.name = name;
        this.cnic = cnic;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.history = history;
        this.admissionDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCnic() {
        return cnic;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContact() {
        return contact;
    }

    public String getHistory() {
        return history;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }
}
