package Objcet_Oriented_programing;
class Something{
    int a;
    Something(int v){ // int a; this.a = a; amon dilaw hbe
        //a = v;
        this.a = v; // this keyword refer the referance of a
    }
    public int returnone(){
        return 1;
    }

    public int getA() {
        return a;
    }
}

class second extends Something {
    second(int v) {
        super(v); // super keyword is a reference variable used to refer immediate parent class object instance variable
        // super keyword used to invoke parent class method
        // can be used to invoke parent class default constructor
        System.out.println("I am the constructor");
    }
}

public class This_and_Super_keyword {
    public static void main(String[] args) {
        Something s = new Something(5);
        System.out.println(s.getA());
        second c = new second(10);

    }
}
