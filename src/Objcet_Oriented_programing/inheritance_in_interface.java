package Objcet_Oriented_programing;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{ // interface can inherit or extends a interface
//    void meth1(); // rather then we can use extend to use sampleInterface method
//    void meth2();
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface{

    @Override
    public void meth1() {
        System.out.println("Math1");
    }

    @Override
    public void meth2() {
        System.out.println("Math2");
    }

    @Override
    public void meth3() {
        System.out.println("Math3");
    }

    @Override
    public void meth4() {
        System.out.println("Math4");
    }
}

public class inheritance_in_interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
