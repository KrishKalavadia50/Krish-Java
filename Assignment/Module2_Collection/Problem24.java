package module2_Collaction.com;

import java.util.ArrayList;

/* Write a Java program to increase the size of an array list. */

public class Problem24 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(50);
        a1.add(100);
        a1.add(150);
        a1.add(200);
        System.out.println(a1.size());
        a1.ensureCapacity(8);
        a1.add(250);
        a1.add(300);
        a1.add(350);
        a1.add(400);
        System.out.println(a1.size());
    }
}
