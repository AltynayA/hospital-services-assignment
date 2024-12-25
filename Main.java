import Subjects.Doctor;
import Subjects.Hospital;
import Subjects.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        patient1.setName("Gabriel Clark");
        patient1.setAge(21);
        Patient patient2 = new Patient();
        patient2.setName("Lucy Torres");
        patient2.setAge(15);
        Patient patient3 = new Patient();
        patient3.setName("Sophie Kim");
        patient3.setAge(26);
        Hospital hospital1 = new Hospital("West Valley Clinic", "Palo Alto,CA");
        Doctor doctor1 = new Doctor();
        doctor1.setName("Alice Johnson");
        doctor1.setYearsOfExperience(10);
        doctor1.setSpecialty("Oncology");
        Doctor doctor2 = new Doctor();
        doctor2.setName("Grayson Martin");
        doctor2.setYearsOfExperience(19);
        doctor2.setSpecialty("Dentistry");
        Doctor doctor3 = new Doctor("Grayson Martin",47, Specialties.Pediatry, 19);
        List<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        HospitalService service = new HospitalService(doctors);
        //user enters specialty and matching doctor is found
        System.out.println("Enter a specialty to find the matching doctor");
        Scanner in = new Scanner(System.in);
        String user_search = in.nextLine();
        System.out.println(service.findBySpecialty(user_search));
        //using finding pediatrician method for a certain patient
        System.out.println(service.findPediatrician(patient2));;
        //method for patient
        System.out.println(patient1.ageCheck());
        //method from hospital service
        System.out.println(service.compareExperience(doctor1,doctor2));



    }
}
