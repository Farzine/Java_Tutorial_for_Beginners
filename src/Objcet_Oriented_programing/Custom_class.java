package Objcet_Oriented_programing;

 class Employee{ // we can not creat two public class in one class, if we creat then it show errors
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My name is: "+name);
        System.out.println("My ID is: "+id);
    }
    public int getSalary(){
        return salary;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is custom class");
        Employee farzine = new Employee();
        Employee rakib = new Employee();

        // setting attributes
        farzine.id =102;
        farzine.name = "Farzine";
        farzine.salary = 12000;

        rakib.id = 104;
        rakib.name = "Md.Rakib";
        rakib.salary = 1000;

        System.out.println(farzine.id);
        System.out.println(farzine.name);
        farzine.printDetails();
        System.out.println("Farzine salary is "+farzine.getSalary());
        rakib.printDetails();
        System.out.println("Farzine salary is "+rakib.getSalary());

    }
}
