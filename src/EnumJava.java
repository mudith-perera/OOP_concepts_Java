import java.util.Scanner;

public class EnumJava {
    public enum days{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
    public static void main(String[] args){
        days da = days.FRIDAY;
        System.out.println(da);
    }
}
