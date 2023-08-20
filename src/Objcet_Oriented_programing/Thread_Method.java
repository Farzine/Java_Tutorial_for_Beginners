package Objcet_Oriented_programing;

class MyNewThr extends Thread{
    public void run(){
        int i=0;
        while (i<500){
            System.out.println("Thank you");
            try {
                Thread.sleep(500); // we can hold the execution for some times with that function
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
        int i=0;
        while (i<50){
            System.out.println("Welcome");
            i++;
        }
    }
}

public class Thread_Method {
    public static void main(String[] args) {
        MyNewThr t1 = new MyNewThr();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try{
            t1.join(); // t2 thread will start after end of the execution of t1
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
