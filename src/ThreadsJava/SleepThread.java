package ThreadsJava;

public class SleepThread implements Runnable{
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("From child thread: "+(i+1));
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new SleepThread());

        t.start();
    }
}
