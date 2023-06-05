package chapter_1;

public class method_java {
    //method
    static int logic(int x, int y){ // method like function
        int z;
        if(x>y) z= x+y;
        else z = (x+y)*5;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = logic(a,b); // static method theke static method kai call kora jai, non static method k call kora jai na
        System.out.println(c);

    }
}
