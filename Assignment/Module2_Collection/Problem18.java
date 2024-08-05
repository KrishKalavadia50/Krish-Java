package module2_Collaction.com;

import java.util.ArrayList;

/* Write a Java program to compare two array lists. */

public class Problem18 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(50);
        a1.add(100);
        a1.add(150);
        a1.add(200);
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(50);
        a2.add(100);
        a2.add(150);
        a2.add(200);

        if (a1.equals(a2)) {
            System.out.println("a2 Same Array List... " + a1 );
        } else {
            System.out.println("a2 Not same Array List.. " + a1 );
        }
    }
}
