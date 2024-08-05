package module2_Collaction.com;

import java.util.ArrayList;

/* Write a Java program to replace the second element of an Array List with the
specified element. */
public class Problem25 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(50);
        a1.add(100);
        a1.add(150);
        a1.add(200);
        a1.add(250);
        System.out.println(a1);
        a1.set(2, 50);
        System.out.println(a1);
    }
}
