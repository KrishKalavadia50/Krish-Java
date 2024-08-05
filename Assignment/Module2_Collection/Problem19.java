package module2_Collaction.com;

import java.util.ArrayList;
import java.util.Collections;

/* Write a Java program of swap two elements in an array list */
public class Problem19 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(50);
        a1.add(100);
        a1.add(150);
        a1.add(200);

        Collections.swap(a1, 1, 3);

        System.out.println(a1);
    }
}
