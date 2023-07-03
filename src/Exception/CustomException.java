package Exception;

public class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
}

class CheckNUmber{
    public static void main(String[] args) throws CustomException {
        String name = "mudith";
        if(name == "mudith") {
            throw new CustomException("Dilmith");
        }else{
            System.out.println("not found");
        }
    }
}
