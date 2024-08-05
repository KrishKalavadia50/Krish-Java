package module2_Collaction.com;

import java.util.HashMap;

/* Write a Java program to check whether a map contains key-value mappings (empty)
or not. */
public class Problem23 {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Black");
		h1.put(2, "Blue");
		h1.put(3, "Red");
		h1.put(4, "Green");
		h1.put(5, "Yellow");
		h1.put(6, "Navy Blue");
		System.out.println(h1);
		System.out.println("Empty : " + h1.isEmpty());

		h1.clear();
		System.out.println(h1);
		System.out.println("Empty : " + h1.isEmpty());
	}
}
