import Subjects.Doctor;
import Subjects.Patient;

import java.util.ArrayList;
import java.util.List;

public interface HospitalService {
    Doctor findPediatrician(String user_patient);
    List<String> adultsFilter();
    void addDoctor(Doctor doctor);
    void addPatient(Patient patient);
    List<Doctor> sortDoctorsByName();
    List<Patient> sortPatientsByName();
    String compareExperience(Doctor doctor1, Doctor doctor2);
    String findBySpecialty(String specialty);
}
