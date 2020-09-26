package Inheritance_polymorphism;

public class Person {
    //data fields
    private String fName;
    private String lName;
    private String birthDate;
    private String phoneNumber;
    private String email;

    //default Constructor
    public Person() {}

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Person(String fName, String lName, String birthDate, String phoneNumber, String email) {
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //getters
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    //setters
    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String outPut = "";
        outPut += "Name: " + this.fName + " " + this.lName +
                "\nBirth Date: " + this.birthDate + "\n" + "Phone Number: " + this.phoneNumber +
                "\nEmail: " + this.email;
        return outPut;
    }
}
