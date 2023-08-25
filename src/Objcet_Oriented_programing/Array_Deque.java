package Objcet_Oriented_programing;

import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque <Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(7);
        ad1.add(8);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        ad1.addFirst(9);
        System.out.println(ad1.getFirst()); // see oracle documentation
    }
}
