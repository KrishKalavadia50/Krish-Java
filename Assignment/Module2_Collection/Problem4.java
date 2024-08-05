package module2_Collaction.com;

import java.util.ArrayList;

/* Write a Java program to retrieve an element (at a spec. index) from a given array list.
 */
public class Problem4 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(50);
		a1.add(100);
		a1.add(150);
		a1.add(200);
		a1.add(250);

		System.out.println(a1.get(3));
	}
}
