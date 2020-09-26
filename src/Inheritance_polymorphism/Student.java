package Inheritance_polymorphism;

public class Student extends Person {
    //data fields
    private String classStanding;
    private long cinNumber;
    private String major;

    //default Constructor
    public Student() {}

    public Student(String fName, String lName, String major) {
        super(fName, lName);
        this.major = major;
    }

    public Student(String fName, String lName, String birthDate, String phoneNumber, String email, String classStanding, long cinNumber, String major) {
        //super() is used to initialize parameters inherited from the person class
        super(fName, lName, birthDate, phoneNumber, email);
        this.classStanding = classStanding;
        this.cinNumber = cinNumber;
        this.major = major;
    }

    //getters
    public String getClassStanding() {
        return classStanding;
    }

    public long getCinNumber() {
        return cinNumber;
    }

    public String getMajor() {
        return major;
    }

    //setters
    public void setClassStanding(String classStanding) {
        this.classStanding = classStanding;
    }

    public void setCinNumber(long cinNumber) {
        this.cinNumber = cinNumber;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        String outPut = "";
        outPut += super.toString() + "\n Major: " + this.major + "\nCIN#: " + this.cinNumber + "\n Class Standing: " + this.classStanding;
        return outPut;
    }
}