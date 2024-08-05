package module2_Collaction.com;

import java.util.HashSet;
import java.util.Iterator;

/* � Write a Java program to iterate through all elements in a hash list */
public class Problem12 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        h1.add(50);
        h1.add(100);
        h1.add(150);
        h1.add(200);
        h1.add(250);
        System.out.println(h1);

        Iterator<Integer> i1 = h1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }
}
