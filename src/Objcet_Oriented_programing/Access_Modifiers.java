package Objcet_Oriented_programing;

/*
Modifier       Class     Package   SubClass   World
Public          Yes        Yes       Yes       Yes
Protected       Yes        Yes       Yes       No
Default         Yes        Yes       No        No
Private         Yes         No       No        No
*/

class C1{
    public int x = 5;
    protected int y = 67;
    int z = 9;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
    }
}
