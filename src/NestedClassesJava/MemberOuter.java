package NestedClassesJava;

public class MemberOuter {
    private int data = 30;
    class MemberInner{
        int msg(){
            System.out.println("This is from Inner class..");
            return data;
        }
    }

    public static void main(String[] args) {
        //To access the inner class, create an object of the outer class, and then create an object of the inner class
        MemberOuter memberOuter = new MemberOuter();
        MemberOuter.MemberInner memberInner = memberOuter.new MemberInner();
        System.out.println(memberInner.msg());

    }
}
