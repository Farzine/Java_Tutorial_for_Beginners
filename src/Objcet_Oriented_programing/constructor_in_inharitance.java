package Objcet_Oriented_programing;

class Base1{

    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am a overload constructor of Base1 with overload value of a = "+a);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{

    Derived1(){
        super(0); // to execute a parameter Base1 constructor, write super then initialize value
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am overload constructor of Derived1 with value of y = "+y);
    }
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ChildOFDerived extends Derived1{
    ChildOFDerived(){
        System.out.println("I am a child of Derived constructor");
    }
    ChildOFDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of ChildOfDerived with value of z = "+z);
    }
}

public class constructor_in_inharitance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1(); // first child class execute the super class then it's execute its own
        Derived1 c = new Derived1(14,15); // execute the overloaded Derived constructor
        ChildOFDerived e = new ChildOFDerived(12,13,14); // first it excute Base1 then derived1 then itself
    }
}
