package module2_Collaction.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* Write a Java program to get a collection view of the values contained in this map. */
public class Problem28 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Kivi", 50);
        map.put("Dragon", 22);
        map.put("Passion", 50);

        Collection<Integer> values = map.values();

        System.out.println("Values contained in the map: " + values);
    }
}
