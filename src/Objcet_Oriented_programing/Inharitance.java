package Objcet_Oriented_programing;

class Base{ // super class
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am out");
    }
}

class Derived extends Base{ // extends keyword allows to access base class
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inharitance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(6);
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());
    }
}
