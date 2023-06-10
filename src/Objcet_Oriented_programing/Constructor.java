package Objcet_Oriented_programing;

class MyMainEmployee{
    private int id;
    private String name;
    private int age;

    public MyMainEmployee(String my_name, int my_id){ // it can also take parameter
        //id = 45;
        //name = "Good Boy";
        name = my_name;
        id = my_id;
    }
    // constructor over loading
    public MyMainEmployee(String names, int my_id, int ages) {
        id =my_id;
        name = names;
        age = ages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor { // A member function used to initilized an object while creating it
    public static void main(String[] args) {
        MyMainEmployee farzine = new MyMainEmployee("Farzine",104); // the constructor taking the parameter
        MyMainEmployee emply = new MyMainEmployee("farzine",155,40);
//        farzine.setId(100);
//        System.out.println(farzine.getId());
//        farzine.setName("Hii boy");
//        System.out.println(farzine.getName());
        System.out.println(farzine.getId()); // automatically invoke from constructor
        System.out.println(farzine.getName()); // automatically invoke from constructor

    }
}
