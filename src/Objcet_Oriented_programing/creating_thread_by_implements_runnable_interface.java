package Objcet_Oriented_programing;

class MyThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("I am Runnable Thread 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("I am Runnable Thread 2");
        }
    }
}

public class creating_thread_by_implements_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 r1 = new MyThreadRunnable1();
        Thread t1 = new Thread(r1);
        MyThreadRunnable2 r2 = new MyThreadRunnable2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
