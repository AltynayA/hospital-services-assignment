import Subjects.Doctor;
import Subjects.Patient;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//dynamically adding doctors and patients to arrays
public class HospitalServiceImpl implements HospitalService {
    private  List<Doctor> doctors = new ArrayList<>();
    private  List<Patient> patients = new ArrayList<>();
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    // Default constructor
    public HospitalServiceImpl() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    @Override
    public List<String> adultsFilter() {
        List<String> filteredPatients = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getAge() >= 18) {
                filteredPatients.add(patient.getName());
            }
        }
        return filteredPatients;
    }

    @Override
    public Doctor findPediatrician(String user_patient) {
        Patient targetPatient = null;
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(user_patient)) {
                targetPatient = patient;
                break;
            }
        }
        if (targetPatient.getAge() < 18) {
            for (Doctor doctor : doctors) {
                if(doctor.getSpecialty().equals(Specialties.Pediatry)) {
                    System.out.println("The matching doctor for " + targetPatient.getName() + " is " + doctor.getName());
                    return doctor;
                }
            }
            return null;
        }
         return null;
     }


    // Sort doctors by name
    @Override
    public List<Doctor> sortDoctorsByName() {
        Collections.sort(doctors, Comparator.comparing(Doctor::getName));
        return doctors;
    }
    // Sort patients by name
    @Override
    public List<Patient> sortPatientsByName() {
        Collections.sort(patients, Comparator.comparing(Patient::getName));
        return patients;
    }
     @Override
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
     @Override
     public String findBySpecialty(String specialty) {
        for (Doctor doctor : doctors) {
            if(doctor.getSpecialty().equalsIgnoreCase(specialty)) {
                return doctor.getName();
            }
        }
        return "No doctor with the specialty: " + specialty;
     }
}
