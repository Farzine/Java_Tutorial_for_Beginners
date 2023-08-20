package Objcet_Oriented_programing;

class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        while (true) {
            System.out.println("Thank you " + this.getName());
        }
    }
}


public class Thread_priorities {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("Farzine1");
        Mythr1 t2 = new Mythr1("Farzine2");
        Mythr1 t3 = new Mythr1("Farzine3");
        Mythr1 t4 = new Mythr1("Farzine4");
        Mythr1 t5 = new Mythr1("Farzine5(Most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
