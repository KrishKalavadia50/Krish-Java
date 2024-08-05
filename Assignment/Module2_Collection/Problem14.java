package module2_Collaction.com;

import java.util.HashMap;

/* Write a Java program to associate the specified value with the specified key in a
Hash Map */
public class Problem14 {
    public static void main(String[] args) {
        HashMap<Integer, String> h1 = new HashMap<Integer, String>();
        h1.put(1, "Krish");
        h1.put(2, "Radhen");
        h1.put(3, "Harshal");
        h1.put(4, "Karan");
        System.out.println(h1);
    }
}
