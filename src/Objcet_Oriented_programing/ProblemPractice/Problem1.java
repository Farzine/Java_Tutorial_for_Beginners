// Creat a class Circle and use inheritance to create
// another class cylinder from it
package Objcet_Oriented_programing.ProblemPractice;

class Circle{
    public int radius;
    Circle(int radius){
        System.out.println("I am circle parameterize constructor");
        this.radius = radius;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle{
    public int height;

    Cylinder(int radius, int height){
      super(radius);
        System.out.println("I am Cylinder parameterized constructor");
      this.height = height;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Problem1 {
    public static void main(String[] args) {

        Cylinder obj = new Cylinder(12,13);
        Circle obj1 = new Circle(8);

    }
}
