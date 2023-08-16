package Objcet_Oriented_programing;
// in java interface is a
// group of related methods with empty body
// interface ar object banano jai na, referance banano jai
// interface a sob method implements krte hy
// akta class akadhik interface k implements krte pare

interface Bicycle{
    int a=45;
    void applyBraek(int decrement);
    void speedup(int increment);
}
interface BlowHorn{
    void BigHorn(int increment);
    void SmallHorn(int decrement);
}

class AvonCycle implements Bicycle,BlowHorn{

    void blowHorn(){
        System.out.println("Pepepe");
    }

    @Override
    public void applyBraek(int decrement) {
        System.out.println("Applying break");
    }

    @Override
    public void speedup(int increment) {
        System.out.println("Applying accelerator");
    }

    @Override
    public void BigHorn(int increment) {

    }

    @Override
    public void SmallHorn(int decrement) {

    }
}


public class Interface_Class {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBraek(1);
        // you can create properties in interface
        System.out.println(cycle.a);
        // you can not modify the properties in interfaces as they are final;
        //cycle.a=46; don't work
    }
}
