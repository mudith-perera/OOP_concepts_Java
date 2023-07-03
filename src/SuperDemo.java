public class SuperDemo {
    String name = "Mudith";
    SuperDemo(){
        System.out.println(this.name);
    }
}

class Test extends SuperDemo{
    Test(){
        super();
    }
}

class Main{
    public static void main(String[] args) {
        Test test = new Test();
    }
}