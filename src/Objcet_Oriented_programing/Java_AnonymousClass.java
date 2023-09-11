package Objcet_Oriented_programing;
//In Java, a class can contain another class known as nested class. It's possible to create a nested class without giving any name.
// A nested class that doesn't have any name is known as an anonymous class.
// An anonymous class must be defined inside another class. Hence, it is also known as an anonymous inner class.

interface DemoAno{
    void meth1();
    void meth2();
}

//class AnnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am math 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am math 2");
//    }
//}

public class Java_AnonymousClass {
    public static void main(String[] args) {
//        DemoAno obj = new AnnonyDemo();
//        obj.meth1();
        // Anonymous class
        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am math 1");
            }

            @Override
            public void meth2() {
                System.out.println("I am math 2");
            }
        };
        obj.meth1();
    }
}
