import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientDetail {
    
    // Action for "Change Doctor" button
    public static ActionListener changeDoctorAction(PatientDetailGUI frame) {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AddPatientGUI addPatientFrame = new AddPatientGUI();
                addPatientFrame.setVisible(true);
            }
        };
    }

    // Action for "Home" button
    public static ActionListener homeAction(PatientDetailGUI frame) {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                HomeGUI homeFrame = new HomeGUI();
                homeFrame.setVisible(true);
            }
        };
    }

    // Action for "Update Patient" button
    public static ActionListener updatePatientAction(PatientDetailGUI frame) {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AddPatientGUI addPatientFrame = new AddPatientGUI();
                addPatientFrame.setVisible(true);
            }
        };
    }

    // Action for "Remove Patient" button
    public static ActionListener removePatientAction(PatientDetailGUI frame) {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AddPatientGUI addPatientFrame = new AddPatientGUI();
                addPatientFrame.setVisible(true);
            }
        };
    }

    // Action for "Add Patient" button
    public static ActionListener addPatientAction(PatientDetailGUI frame) {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AddPatientGUI addPatientFrame = new AddPatientGUI();
                addPatientFrame.setVisible(true);
            }
        };
    }
}
