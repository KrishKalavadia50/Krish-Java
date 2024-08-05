package module2_Collaction.com;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

/* Write a Java program to sort a given array list. */
public class Problem8 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(50);
        a1.add(150);
        a1.add(100);
        a1.add(250);
        a1.add(200);
        System.out.println("Unsorted array : " + a1);

        Collections.sort(a1);

        System.out.println("Sorted array : " + a1);
    }
}
