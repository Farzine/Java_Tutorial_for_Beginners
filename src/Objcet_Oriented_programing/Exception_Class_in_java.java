package Objcet_Oriented_programing;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am to string";
    }

    @Override
    public String getMessage() {
        return  "I am getMessage";
    }
}
public class Exception_Class_in_java {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            try {
                throw new MyException(); // you can use build in exception also
                //throw new ArithmeticException("This is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                //output
                // I am getMessage
                //I am to string
                //I am to string
            }
        }
    }
}
