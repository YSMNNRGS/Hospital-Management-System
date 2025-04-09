public class Patient {
    String id;
    String name;
    Patient next;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
        this.next = null;
    }
}

public class PatientLinkedList {
    private Patient head;

    public void addPatient(String id, String name) {
        Patient newPatient = new Patient(id, name);
        if (head == null) {
            head = newPatient;
        } else {
            Patient current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPatient;
        }
    }

    public void displayPatients() {
        Patient current = head;
        while (current != null) {
            System.out.println("ID: " + current.id + ", Name: " + current.name);
            current = current.next;
        }
    }


}