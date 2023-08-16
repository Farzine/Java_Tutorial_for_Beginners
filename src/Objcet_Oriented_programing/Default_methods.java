package Objcet_Oriented_programing;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4kViedo(){
        System.out.println("Recording 4k");
    }
    // jokhn akta interface k onk jaigai implements kra hy abong ter por oi
    // interface a abr akta method add kora hy tkhn seta baki sob implements a inherit kora
    // kstokor tai default keyword use kore oi interface ai method ta describe kora hy
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting..");
    }

    static class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{

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
public class Default_methods {
    public static void main(String[] args) {
       MyCellPhone.MySmartPhone ms = new MyCellPhone.MySmartPhone();
       String[] ar = ms.getNetworks();
       ms.record4kViedo();
       for(String item : ar)
       {
           System.out.println(item);
       }
    }
}
