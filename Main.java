import Subjects.Doctor;
import Subjects.Hospital;
import Subjects.Patient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Gabriel Clark", 21, 1);
        Patient patient2 = new Patient("Lucy Torres", 15, 2);
        Patient patient3 = new Patient("Sophie Kim", 26, 3);
        Patient patient4 = new Patient("Sying Su", 12, 4);
        Patient patient5 = new Patient("Marthe Sauvé", 28, 5);
        Hospital hospital1 = new Hospital("West Valley Clinic", "Palo Alto,CA");
        Doctor doctor1 = new Doctor("Alice Johnson", 39, "Oncology", 10);
        Doctor doctor2 = new Doctor();
        doctor2.setName("Lillian J. Barbosa");
        doctor2.setAge(41);
        doctor2.setYearsOfExperience(19);
        doctor2.setSpecialty("Dentistry");
        Doctor doctor3 = new Doctor("Grayson Martin", 47, "Pediatry", 25);
        Doctor doctor4 = new Doctor("Eivind Berge", 35, "Endocrinology", 12);
        // Cresting instance of HospitalServiceImpl class, this will process all method in the class
        HospitalServiceImpl service = new HospitalServiceImpl();
        // Creating a list of doctors
        service.addDoctor(doctor1);
        service.addDoctor(doctor2);
        service.addDoctor(doctor3);
        service.addDoctor(doctor4);
        // Searching method: finding a doctor with user's searched specialty
        System.out.println("Enter a specialty to find the matching doctor");
        Scanner in = new Scanner(System.in);
        String user_search = in.nextLine().trim();
        System.out.println(service.findBySpecialty(user_search));
        // Creating list of patients
        service.addPatient(patient1);
        service.addPatient(patient2);
        service.addPatient(patient3);
        service.addPatient(patient4);
        service.addPatient(patient5);
        // Filtering method: showing adult patients
        System.out.println("Here are adult patients:");
        for (String adultpatient : service.adultsFilter()) {
            System.out.println(adultpatient);
        }
        // Sorting  method: doctors
        System.out.println("Here are doctors sorted alphabetically");
        for (Doctor doctor : service.sortDoctorsByName())  {
            System.out.println(doctor);
        }
        // Sorting  method: patients
        System.out.println("Here are patients sorted alphabetically");
        for(Patient patient : service.sortPatientsByName()) {
            System.out.println(patient);
        }
        //System.out.println(service.getAllPatients());
        // (Searching) a pediatrician  for a certain patient
        System.out.println("Enter a patient to  find a pediatrician");
        Scanner input = new Scanner(System.in);
        String patientName = in.nextLine().trim();
        Doctor foundPediatrician = service.findPediatrician(patientName);
        System.out.println(foundPediatrician != null ? foundPediatrician: "No pediatrician");
        // Info about the patient
        patient1.printDetails();
        // equals() and hashCode()
        System.out.println(patient1.equals(patient2));
        System.out.println(patient1.hashCode());
        }
    }

