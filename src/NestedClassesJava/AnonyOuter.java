package NestedClassesJava;

interface AnonyOuter {
    void msg();
}
class AnonyInner{
    public static void main(String[] args) {
        AnonyOuter anonyOuter = new AnonyOuter() {
            @Override
            public void msg() {
                System.out.println("hello");
            }
        };
        anonyOuter.msg();
    }
}
