package chapter_1;

import java.util.Scanner;

class Subject{
    int max = 100;
    int obtd;
}
public class rough {
    public static void main(String[] args)
    {
        Subject s1 = new Subject();
        System.out.print("Enter Maths Marks:");
        Scanner scn = new Scanner(System.in);
        s1.obtd = scn.nextInt();
        Subject s2 = new Subject();
        System.out.print("Enter Science Marks:");
        //Scanner scn = new Scanner(System.in);
        s2.obtd = scn.nextInt();
        Subject s3 = new Subject();
        System.out.print("Enter English Marks:");
        //Scanner scn = new Scanner(System.in);
        s3.obtd = scn.nextInt();
        int total = (s1.obtd)+(s2.obtd)+(s3.obtd);
        int per = (total*100)/300;
        System.out.println("Percentage obtained :"+per);
    }
}
