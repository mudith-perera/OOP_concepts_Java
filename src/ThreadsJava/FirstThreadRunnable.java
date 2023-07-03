package ThreadsJava;

public class FirstThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World "+ Thread.currentThread());
    }
}
class Demo_runnable{
    public static void main(String[] args) {
        FirstThreadRunnable firstThreadRunnable = new FirstThreadRunnable();
        Thread t = new Thread(firstThreadRunnable,"demo thread");
        t.start();
    }
}
