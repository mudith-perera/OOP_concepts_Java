package Constructors;

public class Property {
    Property(){
        System.out.println("p");
    }
    Property(String name){
        this();
        System.out.println("pn " + name);
    }
}
class Apartment extends Property{
    Apartment(){
        System.out.println("a ");
    }
    Apartment(String name){
        //calling default constructor inside the overloaded constructor
        this();
        System.out.println("an "+ name);
    }

    public static void main(String[] args) {
        new Apartment("x");
    }
}
