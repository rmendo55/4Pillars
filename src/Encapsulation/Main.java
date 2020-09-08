package Encapsulation;

public class Main {
    public static void main(String[] args) {
        //Instantiating a student Object
        Student student1 = new Student();
        System.out.println(student1); //This will print all variables of student1 with default values
        Student student2 = new Student("California State University Los Angeles", "Rafael Mendoza", "4",304997295);
        System.out.println(student2); //This will print all variables of student2 with initialized values

        //using getter method: Cannot do this student2.name since variable name is not public
        //printing the name only
        System.out.println("Student 2: " + student2.getName()); //This is why getters are needed. To have access to them
        System.out.println();
        //Lets the change the CIN number of student2
        //cannot do this: student2.cin = 3049972
        //must do this
        System.out.println("Before: " + student2.getCin() + "\n");
        student2.setCin(3049972);
        System.out.println("After");
        System.out.println("New CIN: " + student2.getCin());
    }
}
