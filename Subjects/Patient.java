package Subjects;

import java.util.Objects;

public class Patient extends Person {
    private int patientID;
// Default constructor
    public Patient() {
        super("Unknown", 0);
    }
    public Patient(String name, int age, int patientID) {
        super(name,age);
        this.patientID = patientID;
    }
    // Getters and Setters
    public int getPatientID() {
        return patientID;
    }
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    // Polymorphism: overriden methods from Person class
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Patient ID: " + patientID);
    }
    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj  == null || getClass()!= obj.getClass()) {
            return false;
        }
        // If two arguments are the same class or object is not null, it casts obj to Patient class to compare properties
        Patient patient = (Patient) obj;
        if (!getName().equals(patient.getName())) {
            return false;
        }
        if (getAge() != patient.getAge()) {
            return false;
        }
        if (getPatientID() != patient.getPatientID()) {
            return false;
        }
        return true;
    }
    // hashCode()
    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + getPatientID();  // Directly use the int value
        return result;
    }
    // toString()
    @Override
    public String toString() {
        return getName();
    }

    }



