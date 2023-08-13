package Objcet_Oriented_programing;

abstract class Parent2{
    public Parent2(){
        System.out.println("PArent2 constructor");
    }
    public void seyHello(){
        System.out.println("Hello");
    }
    abstract public  void great();// we can use this method any kind of child class by inherit parent class
}

class Child2 extends Parent2{

    @Override
    public void great() {
        System.out.println("Good Morning");
    }
}

abstract class child3 extends Parent2{
    public void Greeting(){
        System.out.println("Hi there");
    }
}

public class abstract_class {
    public static void main(String[] args) {
       // abstract method is a method that declared without an implementation
       //Parent2 p = new Parent2 // we can not make abstract class object
        Parent2 p = new Parent2() { // we can use abstract class obj by override the abstract method
            @Override
            public void great() {
                System.out.println("Hello");
            }
        };
    }
}
