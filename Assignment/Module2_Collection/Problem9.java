package module2_Collaction.com;

/* � Write a Java program to copy one array list into another. */

import java.util.ArrayList;

public class Problem9 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(50);
        a1.add(100);
        a1.add(150);
        a1.add(200);
        a1.add(250);
        System.out.println("Array List : " + a1);

        ArrayList<Integer> a2 = a1;

        System.out.println("Array List2 : " + a2);
    }
}
