package Interfaces;

//Interface
interface Animal{
    //interface methods (same as abstract methods)
    public void animalSound();
    public void sleep();
}

//Cannot extend
class Pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says wee wee");
    }
    public void sleep(){
        System.out.println("Zzzz");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}
