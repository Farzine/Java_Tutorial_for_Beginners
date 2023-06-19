package Objcet_Oriented_programing;
class A{
    public int method1(){
        return 4;
    }
    public void method2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override // use the override annotation, if you do any method override
    // If the child class implements the same method present in the parent class again it is renown as method overriding
    // we can't override static,final,private method
    public void method2(){ // method overriding
        System.out.println("I am method 2 of class B");
    }
    public void method3(){
        System.out.println("I am method 3 of class 8");
    }
}

public class method_overridding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();

    }
}
