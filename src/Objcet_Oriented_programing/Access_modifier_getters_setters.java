package Objcet_Oriented_programing;

class MyEmployee{
    private int id;
    private String name ;

    // private access modifier k use korte getter setter use kora hy, we can use this technique for validation data type
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }

    public void setId(int x) {
          id = x;
    }
}

public class Access_modifier_getters_setters {
    public static void main(String[] args) {
        MyEmployee farzine = new MyEmployee();
        //farzine.id = 45; // if the data type is private,then we can not access it
        //farzine.name = "Farzine";// Throws an errors due to private access modifier
        farzine.setName("Farzine");
        System.out.println(farzine.getName());
        farzine.setId(101);
        System.out.println(farzine.getId());

    }
}
