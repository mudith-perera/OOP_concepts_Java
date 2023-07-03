package Package2;
//Method 1 (Import All classes)
//import Package1.*;

//Method 2 (Import a specific class)
//import Package1.Message;

//Method 3 (Fully qualified name)

public class PackTest {
    public static void main(String[] args) {
//        //Method 1,2 (START)
//        Message message = new Message();
//        message.msg();
//        //Method 1,2 (END)

        //Method 3 (START)
        Package1.Message message = new Package1.Message();
        message.msg();
        //Method 3 (END)
    }
}
