import Subjects.Doctor;
import Subjects.Patient;

import java.util.ArrayList;
import java.util.List;

public class HospitalService {
    private final List<Doctor> doctors;
    //default constructor
    public HospitalService() {
        this.doctors = new ArrayList<>();
    }

    public HospitalService(List<Doctor> doctors) {
        this.doctors = doctors;
    }
     Doctor findPediatrician(Patient patient) {
         if (patient.getAge() < 18) {
             for (Doctor doctor : doctors) {
                 if(doctor.getSpecialty().equals(Specialties.Pediatry)) {
                     System.out.println("This is the matching doctor: "+ doctor.getName());
                     return doctor;
                 }
             }
             return null;
         }
         return null;
     }

     public String compareExperience(Doctor doctor1, Doctor doctor2){
        if (doctor1.getYearsOfExperience() == doctor2.getYearsOfExperience()) {
            return "They have the same experience.";
        }
        else if (doctor1.getYearsOfExperience() > doctor2.getYearsOfExperience()) {
            return doctor1.getName() + " has more experience than " + doctor2.getName();
        }
        else {
            return doctor2.getName() + " has more experience than " + doctor1.getName();
        }
     }

     Doctor findBySpecialty(String specialty) {
        for (Doctor doctor : doctors) {
            if(doctor.getSpecialty().equals(specialty)) {
                return doctor;
            }
        }
        return null;
     }
}
