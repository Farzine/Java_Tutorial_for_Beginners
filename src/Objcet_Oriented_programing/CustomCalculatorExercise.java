package Objcet_Oriented_programing;

//Exercise 6: You have to create a custom calculator with following operations:
//        1. + -> Addition
//        2. - -> Subtraction
//        3. * -> Multiplication
//        4. / -> Division
//        which throws the following exceptions:
//        1. Invalid input Exception ex: 8 & 9
//        2. Cannot divide by 0 Exception
//        3. Max Input Exception if any of the inputs is greater than 100000
//        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000

import java.util.Scanner;

import static Objcet_Oriented_programing.Bicycle.a;

class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Max input Exception! Input can not greater than 1000000!!";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Can not divide by Zero.!!!";
    }
}

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid input!";
    }
}

class CustomCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if(a==0 && b==0)
        {
            throw  new InvalidInputException();
        }
        if(a>1000000 || b>1000000)
        {
            throw new MaxInputException();
        }
        return a+b;
    }
    double subtract(double a, double b) throws InvalidInputException, MaxInputException {
        if(a==0 && b==0)
        {
            throw  new InvalidInputException();
        }
        if(a>1000000 || b>1000000)
        {
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws InvalidInputException, MaxInputException {
        if(a==0 && b==0)
        {
            throw  new InvalidInputException();
        }
        if(a>1000000 || b>1000000)
        {
            throw new MaxInputException();
        }
        return a*b;
    }
    double divide(double a, double b) throws InvalidInputException, CannotDivideByZeroException, MaxInputException {
        if(a==0 && b==0)
        {
            throw  new InvalidInputException();
        }
        if(b==0)
        {
            throw new CannotDivideByZeroException();
        }
        if(a>1000000 || b>1000000)
        {
            throw new MaxInputException();
        }
        return a/b;
    }
}


public class CustomCalculatorExercise {
    public static void main(String[] args) throws InvalidInputException,CannotDivideByZeroException,MaxInputException{
        CustomCalculator c = new CustomCalculator();

        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println("Enter second number: ");
        double b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter operator: ");
        String s = sc.nextLine();
        double ans = 0;
        if(s == "+"){
            ans = c.add(a,b);
        }
        else if(s == "-")
            ans = c.subtract(a,b);
        else if(s == "*")
            ans = c.multiply(a,b);
        else if(s == "/")
            ans = c.divide(a,b);
        System.out.println("The result is: "+ ans);
    }
}
