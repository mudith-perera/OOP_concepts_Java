package ThreadsJava;

public class MultiPriority extends Thread{
    public MultiPriority(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Running thread name: "+ Thread.currentThread().getName() + " , Running thread priority: " +Thread.currentThread().getName()
            + ": "+i);
        }
        System.out.println("End of " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultiPriority m1 = new MultiPriority("First Thread");
        MultiPriority m2 = new MultiPriority("Second Thread");

        //m1.setPriority(Thread.MIN_PRIORITY);
        //m2.setPriority(Thread.MAX_PRIORITY);

        m1.start();
        m2.start();
    }
}
