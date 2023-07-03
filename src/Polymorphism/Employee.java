package Polymorphism;

public class Employee extends Person {
    //Method Overriding
    void walk(){
        System.out.println("Running fast...");
    }

    public static void main(String[] args) {
        Person person = new Employee();
        person.walk();
    }
}
