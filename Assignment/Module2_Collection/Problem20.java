package module2_Collaction.com;

import java.util.ArrayList;
//import java.util.Collections;

/* Write a Java program to join two array lists. */

public class Problem20 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(250);
        a1.add(300);
        a1.add(350);
        a1.add(400);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(50);
        a2.add(100);
        a2.add(150);
        a2.add(200);

        a2.addAll(a1);

        System.out.println(a2);

    }
}
