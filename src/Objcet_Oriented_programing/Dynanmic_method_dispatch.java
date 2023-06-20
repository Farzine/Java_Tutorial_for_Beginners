package Objcet_Oriented_programing;
class Phone{
    public void name(){
        System.out.println("My name is java in class 1");
    }
    public void great(){
        System.out.println("Good Morning");
    }
}

class SmartPhone extends Phone{
    public void welcome(){
        System.out.println("welcome to you");
    }
    public void name(){
        System.out.println("My name is java in class 2");
    }
}

public class Dynanmic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        // run time polymorphism, Dynamic method dispatch
        Phone obj = new SmartPhone(); // super class obj can reference sub class obj
        obj.great();
        obj.name(); // it's run the smartphone class name method
        //obj.welcome(); // this is not allowed, can't run the method that has not in the super class
    }
}
