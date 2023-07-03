public class Teacher extends Person {
    void getPromotion() {
        System.out.println("Teacher");
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.getPromotion();
        new Teacher().getPromotion();
    }
}
