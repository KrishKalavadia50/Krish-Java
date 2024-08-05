package module2_Collaction.com;

import java.util.HashSet;
import java.util.Set;

/* Write a Java program to compare two sets and retain elements which are same on
both sets */
public class problem27 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(50);
        s1.add(100);
        s1.add(150);
        s1.add(200);
        System.out.println(s1);

        Set<Integer> s2 = new HashSet<Integer>();
        s2.add(50);
        s2.add(100);
        s2.add(250);
        s2.add(300);
        System.out.println(s2);

        s1.retainAll(s2);

        System.out.println(s1);
    }
}
