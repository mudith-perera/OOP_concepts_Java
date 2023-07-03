package Inheritance;

public class Car extends Vehicle {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.color = "blue";
        System.out.println(car.color);
    }
}
