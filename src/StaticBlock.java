public class StaticBlock {
    public static void main(String [] args){
        System.out.println("This is the main method");
        hey hey1 = new hey();
    }
}

class hey{
    hey(){
        System.out.println("constructor");
    }
    {
        System.out.println("This is the Initializer Block");
    }
    static {
        System.out.println("static");
    }

    StaticBlock staticBlock = new StaticBlock();
}