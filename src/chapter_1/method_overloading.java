package chapter_1;

public class method_overloading {
    // method overloading, same name but different parameter, method cannot overloading by changing the return type of method
    static void test(){
        System.out.println("First method");
    }

    static void test(int x){
        System.out.println("Second method" + x);
    }

    static void test(int x, char c){
        System.out.println("Third method "+x+" "+c);
    }

    static void change(int x){
        x= 500;
    }

    static void change2(int [] arr){
        arr[0] = 1;
    }
    static void tellJoke(){ // static method k call krte kono object create krte hy na, baki khetre obj create krte hy
        for(int i=0; i<5; i++) {
            System.out.println("I love you");
        }
    }

    public static void main(String[] args) {
        //tellJoke();

        // case: 1 Changing the integer
//        int x = 6;
//        change(x);
//        System.out.println(x); // it will not change the value bcz it passes the copy of the variable to the method

        // case: 2 changing in array
//        int [] marks = {50,60,70,80};
//        change2(marks);
//        System.out.println(marks[0]); // it will change the value bcz the array is passing address

        test();
        test(100);
        test(105,'a');
    }
}
