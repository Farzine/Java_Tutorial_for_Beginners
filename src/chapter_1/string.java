package chapter_1;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
//        String name = new String("Farzine");
//        String name = "Farzine";
//        System.out.println(name);
//        int a = 6;
//        float b = 5.6434f;
//        System.out.printf("The vale of a is %d and the value of b is %8.4f\n", a,b); // format specifier, 8 sapces and 4 digit after point
//        System.out.format("The vale of a is %d and the value of b is %f", a,b); // these 2 are same
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        System.out.println(s);
//        int len = s.length();
//        System.out.println(len);
//        String lowerString = s.toLowerCase();
//        System.out.println(lowerString);
//        String upparCase = s.toUpperCase();
//        System.out.println(upparCase);
//        String nonTrimString = "    Farzine    ";
//        System.out.println(nonTrimString);
//        System.out.println(nonTrimString.trim()); // ager abong pisoner space remove kore
        String name = "Farzinea";
//        System.out.println(name.substring(2)); //index 2 theke baki string print hbe
//        System.out.println(name.substring(1,4)); // index 1 to 3 will be printed
//        System.out.println(name.replace('z','n')); // string ar akoi rokom charecter tar gula k onno charecter diye replace kore dai
//        System.out.println(name.replace("Far","Mar")); // replace as substring
//        System.out.println(name.startsWith("Far")); // if its starts with Far then it return true
//        System.out.println(name.endsWith("hello"));
        System.out.println(name.charAt(5)); // print the 5th index
        System.out.println(name.indexOf('a')); // return the char starting index
        System.out.println(name.indexOf("ar")); // return the substring starting index
        System.out.println(name.indexOf('a',5)); // return char index, search start from 5
        System.out.println(name.indexOf("zin",2)); // return the substring starting index, search start from 2
        System.out.println(name.lastIndexOf("zin",7)); // inedex of ar moto same jinis but ata search ses theke suru kore, ataro 4ta varity ase
        System.out.println(name.equals("farzinea")); // compare the string and return boolean
        System.out.println(name.equalsIgnoreCase("farzinea")); // ignored case
        
    }
}
