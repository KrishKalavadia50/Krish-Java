package module2_Collaction.com;

import java.util.ArrayList;

/* � Write a Java program to insert an element into the array list at the first position. */
public class Problem3 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(50);
        a1.add(100);
        a1.add(150);
        a1.add(200);
        a1.add(250);
        System.out.println(a1);

        a1.add(0, 01);

        System.out.println(a1);
    }
}
