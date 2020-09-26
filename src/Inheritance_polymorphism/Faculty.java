package Inheritance_polymorphism;

public class Faculty extends Person{
    //data fields
    private int hoursPerWeek;
    private String department;
    private String courses;

    //default Constructor
    public Faculty() {}

    public Faculty(String fName, String lName, String department) {
        super(fName, lName);
        this.department = department;
    }

    public Faculty(String fName, String lName, String birthDate, String phoneNumber, String email, int hoursPerWeek, String department, String courses) {
        super(fName, lName, birthDate, phoneNumber, email);
        this.hoursPerWeek = hoursPerWeek;
        this.department = department;
        this.courses = courses;
    }

    //getters
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public String getDepartment() {
        return department;
    }

    public String getCourses() {
        return courses;
    }

    //setters

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        String outPut = "";
        outPut += super.toString() + "\n Department: " + this.department + "\nCourses: " + this.courses + "\nHours per week: " + this.hoursPerWeek;
        return outPut;
    }
}
