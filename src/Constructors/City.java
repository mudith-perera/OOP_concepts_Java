package Constructors;

public class City {

    public City(){
        System.out.println("Default Constructor");
    }
    public City(int x){
        System.out.println("Overloaded Constructor");
    }
}

class Sydney extends City{
    public Sydney(int x){
        super(3);
    }
}

class World {
    public static void main(String[] args) {
        Sydney sydney = new Sydney(2);
    }
}