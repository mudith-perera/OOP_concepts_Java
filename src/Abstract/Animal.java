package Abstract;

//Abstract Class
abstract class Animal {
    //Abstract Method (No body for this method)
    public abstract void animalSound();

    //Regular method
    public void sleep(){
        System.out.println("zzzz");
    }
}

//Subclass (inherited from Animal class)
//To this to be Concrete class Animal class methods all should be abstract
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says : wee wee");
    }
}

class Main{
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}