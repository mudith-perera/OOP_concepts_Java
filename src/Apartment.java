class Property{
    Property(){
        System.out.println("p ");
    }
    Property(String name){
        this();
        System.out.println("pn" + name);
    }
}
public class Apartment extends Property {
    Apartment(){
        System.out.println("a ");
    }
    Apartment(String name){
        this();
        System.out.println("an"+name);
    }

    public static void main(String[] args) {
        new Apartment("X");
    }
}
