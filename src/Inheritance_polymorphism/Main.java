package Inheritance_polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Student Object
        System.out.println("Student Object");
        Student student1 = new Student("Rafael", "Mendoza", "November 6", "661-441-9701", "mendozarafael914@gmail.com", "sr", 304997295, "Computer Science");
        System.out.println(student1);
        System.out.println();
        System.out.println("Faculty Object");
        //Faculty Object
        Faculty faculty1 = new Faculty("Carlos", "Mendoza", null, null, null, 40, "Computer Science", "Algorithms, Data Structures, Object Oriented Programming, Robotics, Computer Graphics");
        System.out.println(faculty1);


        //Polymorphism
        //Adding person objects to an arrayList
        //The arraylist can store its subclasses
        //instantiate ArrayList

        System.out.println("\n\n\n");
        ArrayList<Person> list = new ArrayList<Person>();       //Type person since Person is the Super Class
        list.add(new Student("Lebron", "James", "Mechanical Engineer"));
        list.add(new Student("Daniel", "Ramirez", "Computer Science"));
        list.add(new Faculty("Ze", "Long", "Computer Science"));
        list.add(new Faculty("Raj", "Pamula", "Mechanical Engineer"));

        //loop through list to print each object
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Student) {
                System.out.println("Sutdent Object: ");
            }
            else if (list.get(i) instanceof Faculty) {
                System.out.println("Faculty Object: ");
            }
            System.out.println("First Name: " + list.get(i).getfName() + " Last Name: " + list.get(i).getlName());
        }

    }
}
