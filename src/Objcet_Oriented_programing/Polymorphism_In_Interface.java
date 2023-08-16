package Objcet_Oriented_programing;
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    default void record4kViedo(){
        System.out.println("Recording 4k");
    }
    // jokhn akta interface k onk jaigai implements kra hy abong ter por oi
    // interface a abr akta method add kora hy tkhn seta baki sob implements a inherit kora
    // kstokor tai default keyword use kore oi interface ai method ta describe kora hy
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting..");
    }

    static class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{

        @Override
        public void takeSnap() {
            System.out.println("Taking Snap");
        }

        @Override
        public void recordVideo() {
            System.out.println("Recording video");
        }

        @Override
        public String[] getNetworks() {
            System.out.println("Getting list of Network");
            String[] networklList = {"Farzine","Mahi","Abir"};
            return networklList;
        }

        @Override
        public void connectToNetwork(String network) {
            System.out.println("Connecting to "+ network);
        }
    }

}

public class Polymorphism_In_Interface {
    public static void main(String[] args) {
        MyCamera2 cam2 = new MyCellPhone2.MySmartPhone2();
        //cam2.getNetwork(); --->> not allowed, can only access of MyCamera's method
        cam2.record4kViedo(); // allowed because the method is in the MyCamera interface
        MyCellPhone2.MySmartPhone2 obj = new MyCellPhone2.MySmartPhone2(); // this obj can access all the method
        obj.takeSnap();
        obj.callNumber(56256);
    }
}
