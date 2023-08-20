/*
Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program

There are two ways to create a thread.

It can be created by extending the Thread class and overriding its run() method:

Another way to create a thread is to implement the Runnable interface

If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method

If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's

constructor and then calling the thread's start() method
 */

package Objcet_Oriented_programing;

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true) {
            System.out.println("My thread 1 is running");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){ // thread override method
        while(true) {
            System.out.println("My thread 2 is running");
        }
    }
}

public class Thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start(); // start method override the run method
        t2.start();
    }
}
