package Objcet_Oriented_programing;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>(5); // arraylist capacity declared

        ll.add(6);
        ll.add(1);
        ll.add(5);
        ll.add(4);
        ll.add(8);
        ll.add(0,1); // add 1 in 0th index other index will increase by 1

        l1.add(20);
        l1.add(30);
        l1.add(40);

        ll.addAll(6,l1); // add element from 6th index of the ll

        l1.clear();

        System.out.println(ll.contains(6));
        System.out.println(ll.indexOf(1));

        ll.set(1,500); // index 1 a 500 value assign korbe

        for(int i=0; i<ll.size(); i++)
            System.out.println(ll.get(i));
//        for (Integer integer : ll)
//            System.out.println(integer);

    }
}
