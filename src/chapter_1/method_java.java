package chapter_1;

public class method_java {
    //method
     int logic(int x, int y){ // method is like function
        int z;
        if(x>y) z= x+y;
        else z = (x+y)*5;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // calling a method:
        /*a method can be called by creating an object of
        the class in which the method exists followed by the method call, by creating
        obj you can use method for several obj, it's created the copy of instance of obj
        but in static it can not copy to another
         */
        method_java obj = new method_java();
        int c1 = obj.logic(a,b);
        //int c = logic(a,b); // static method theke static method kai call kora jai, non static method k call kora jai na, logic a static lagaw
        System.out.println(c1);

    }
}
