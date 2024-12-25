package Subjects;

public class Doctor extends Person {
    //private String name;
    private String specialty;
    private int yearsOfExperience;

    // default constructor
    public Doctor() {
        super("Unknown", 0);
        this.specialty = "General";
        this.yearsOfExperience = 0;
    }
    public Doctor(String name, int age, String specialty, int yearsOfExperience) {
        super(name,age);
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }
    //setters
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    //setters and getters for name and age already in person class
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public String getSpecialty() {
        return specialty;
    }
    //doctors' comparer method
    public boolean equals(Doctor other) {
        if (other.yearsOfExperience != yearsOfExperience) {
            return false;
        }
        if (!other.specialty.equals(specialty)) {
            return false;
        }

        return true;
    }
    @Override
    public String toString() {
        return super.getName() + " has " + yearsOfExperience + " years of experience in " + specialty;
    }




}
