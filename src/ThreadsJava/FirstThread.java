package ThreadsJava;
//1st method - By Extending thread class
public class FirstThread extends Thread {
    //Overriding the run method
    @Override
    public void run(){
        System.out.println("Hello World "+ Thread.currentThread());
    }
}

class Demo{
    public static void main(String [] args){
        FirstThread ft = new FirstThread();
        //Starting of a thread
        ft.start();
    }
}
