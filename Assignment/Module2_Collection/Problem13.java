package module2_Collaction.com;

import java.util.HashSet;

/* Write a Java program to get the number of elements in a hash set. */
public class Problem13 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(50);
		h1.add(100);
		h1.add(150);
		h1.add(200);
		h1.add(250);
		System.out.println(h1);
		
		System.out.println("Size : " + h1.size()) ;
	}
}
