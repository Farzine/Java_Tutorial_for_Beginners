package Objcet_Oriented_programing;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i= 34;
        while (i>0){
            System.out.println("I am a thread");
            i--;
        }
    }
}

public class thread_constructor {
    public static void main(String[] args) {
        Mythr t = new Mythr("Farzine");
        Mythr t1 = new Mythr("Hasan");
        t.start();
        System.out.println("The id of the thread is "+ t.getId()); // get the Thread id
        System.out.println("The name of the Thread is "+ t.getName());
        System.out.println("The id of the thread is "+ t1.getId()); // get the Thread id
        System.out.println("The name of the Thread is "+ t1.getName());

    }
}
