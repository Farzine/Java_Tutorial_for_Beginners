/*
Types of Exceptions
        Built-in Exception           Use-Defined Exception
                        |
                ________|_________________
                |                        |
        Checked Exceptions           Unchecked Exceptions
        . ClassNotFoundException     . ArthmeticException
        . InterruptedException       . ClassCastException
        . IOException                . NullPointerException
        . InstantiationException     . ArrayIndexOutOfBoundsException
        . SQLException               . ArrayStoreException
        . FileNotFoundException      . IllegalThreadStateException

*/





package Objcet_Oriented_programing;

public class Exception_in_java {
    public static void main(String[] args) {
        int a = 6800;
        int b = 0;

        try{
            int c = a/b;
            System.out.println("The result is " + c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program"); // without try Catch function the program will not execute the syntax and continue the program, without it , the program stop executing
    }
}
