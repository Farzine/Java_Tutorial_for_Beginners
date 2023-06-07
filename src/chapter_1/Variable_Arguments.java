package chapter_1;

public class Variable_Arguments {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    static int sum(int ...arr){ // tripple dot argument gula k array te pack kore
        // available as int array
        int result =0;
        for(int a:arr)
            result += a;
        return result;
    }
//    static int sum(int x,int ...arr){ // avabew kora kora jbe
//        // available as int array
//        int result =x;
//        for(int a:arr)
//            result += a;
//        return result;
//    }
    public static void main(String[] args) {
        System.out.println("Welcome to variable arguments:");
        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("The sum of 4 , 3 and 5 is: "+ sum(4,3,5));
        System.out.println("The sum of 1, 3, 2 and 4 is: "+ sum(1,2,3,4));
    }
}
