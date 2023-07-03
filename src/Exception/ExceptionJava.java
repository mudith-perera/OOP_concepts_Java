package Exception;

import java.io.FileNotFoundException;

public class ExceptionJava {
    public static void main(String [] args){
        ExceptionJava exobj = new ExceptionJava();
        exobj.c();
        System.out.println("Normal Flow");
    }
    void a() throws FileNotFoundException {
        throw new FileNotFoundException("File Format Error");
    }
    void b() throws FileNotFoundException{
        throw new FileNotFoundException("File Format Error");
    }
    void c(){
        try{
            b();
        }catch (Exception e){
            System.out.println("Exception Handled");
        }
    }
}
