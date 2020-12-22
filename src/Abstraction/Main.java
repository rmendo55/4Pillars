package Abstraction;


class Truck extends Car
{

    public Truck(String name, int year)
    {
        super(name, year);
    }
    @Override
    public void start() {
        System.out.println("The truck is accelerating!");
    }

    @Override
    public void brake() {
        System.out.println("The truck is braking!");
    }
}

class Suv extends Car
{
    public Suv(String name, int year)
    {
        super(name, year);
    }
    @Override
    public void start() {
        System.out.println("The Suv is accelerating!");
    }

    @Override
    public void brake() {
        System.out.println("The Suv is braking!");
    }
}

abstract class Car
{
    String name;
    int year;

    public Car() {}
    public Car (String name, int year)
    {
        this.name = name;
        this.year = year;
    }

    public abstract void start();
    public abstract void brake();

}
public class Main {
    public static void main(String[] args) {
        Truck fLighting = new Truck("Ford Lightning", 1993);
        fLighting.start();
        fLighting.brake();

        Suv bmwX5 = new Suv("BMW X5", 2020);
        bmwX5.start();
        bmwX5.brake();
    }
}
