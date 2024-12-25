package Subjects;

public class Hospital {
    private String hospitalname;
    private String location;
    //private
    public Hospital(String hospitalname, String location) {
        this.hospitalname = hospitalname;
        this.location = location;
    }
    public String getHospitalname() {
        return hospitalname;
    }
    public String getLocation() {
        return location;
    }
}
