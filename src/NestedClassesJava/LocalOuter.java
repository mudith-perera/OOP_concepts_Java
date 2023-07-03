package NestedClassesJava;

public class LocalOuter {
    private int data = 30;
    void Display(){
        class LocalInner{
            void msg(){
                System.out.println(data);
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.msg();
    }

    public static void main(String[] args) {
        LocalOuter localOuter = new LocalOuter();
        localOuter.Display();
    }
}
