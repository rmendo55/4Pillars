package Encapsulation;

public class Student {
    //data fields
    //declaring private variables (Variables only accessed within the same class)
    private String schoolName;
    private String name;
    private String schoolYr;
    private int cin;

    //default Constructor (When instantiating a Student object and values aren't initialized the default constructor is called)
    //All variables will be initialized with default values
    public Student() {}

    //This constructor initializes all variables with values that are provided
    public Student(String schoolName, String name, String schoolYr, int cin) {
        this.schoolName = schoolName;
        this.name = name;
        this.schoolYr = schoolYr;
        this.cin = cin;
    }

    //provided getters since all variables are declared private

    public String getSchoolName() {
        return this.schoolName;
    }

    public String getName() {
        return this.name;
    }

    public String getSchoolYr() {
        return this.schoolYr;
    }

    public int getCin() {
        return this.cin;
    }

    //providing setters to change the variable values if needed and since the variables are private

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolYr(String schoolYr) {
        this.schoolYr = schoolYr;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    //toString method: Represents the values of this instance

    @Override
    public String toString() {
        String outPut = "";
        outPut += "Student Name: " + this.name + "\n" + "CIN: " + this.cin + "\n" + "School Name: " + this.schoolName + "\n" +
                "School Year: " + this.schoolYr + "\n";
        return outPut;
    }
}
