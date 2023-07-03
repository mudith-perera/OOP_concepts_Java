package Encapsulation;

public class Manage {
    public static void main(String[] args) {
        Student person = new Student();
        System.out.println(person.getName());
        person.setName("Mudith");
        System.out.println(person.getName());
    }
}
