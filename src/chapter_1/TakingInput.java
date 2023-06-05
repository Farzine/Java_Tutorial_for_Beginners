package chapter_1;

import java.util.Scanner; // external code import for scanner function
public class TakingInput {
    public static void main(String[] args){
        System.out.println("It works"); // write sout and enter for system.out.println()
        Scanner sc = new Scanner(System.in); // System.in means we can take input from keyboard
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        boolean c = sc.hasNextInt(); // checking c input is  int type data or not
        System.out.println(c);
        String str = sc.next(); // read word string
        System.out.println(str);
        String str1 = sc.nextLine(); // read a line up to \n
        System.out.println(str1);
        System.out.println("Hello "+"Farzine "+"Hossen"); // for output of multiple variable use '+'
    }
}
