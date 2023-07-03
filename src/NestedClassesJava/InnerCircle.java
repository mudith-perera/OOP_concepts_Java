package NestedClassesJava;

class OuterCircle {
    void map(){
        System.out.println("Outer Circle");
    }
}
public class InnerCircle{
    public static void main(String[] args) {
        new InnerCircle().draw();
    }
    void draw(){
        new OuterCircle().map();
        class OuterCircle{
            void map(){
                System.out.println("Inner Circle");
            }
        }
    }
    class OuterCircle{
        void map(){
            System.out.println("Middle Circle");
        }
    }
}

