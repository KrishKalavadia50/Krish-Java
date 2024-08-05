package module2_Collaction.com;

import java.util.ArrayList;
import java.util.HashSet;

/* � Write a Java program to convert a hash set to a List/Array List */
public class Problem22 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        h1.add(50);
        h1.add(100);
        h1.add(150);
        h1.add(200);
        h1.add(250);

        ArrayList<Integer> a1 = new ArrayList<Integer>(h1);
        System.out.println(a1);
    }
}
 