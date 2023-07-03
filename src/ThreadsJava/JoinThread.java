package ThreadsJava;



public class JoinThread implements Runnable {
    @Override
    public void run() {
        System.out.println("ruin");
    }
}

class main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new JoinThread(),"First Child");
        Thread t2 = new Thread(new JoinThread(),"Second Child");
        Thread t3 = new Thread(new JoinThread(),"Third Child");

        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
