package module2_Collaction.com;

import java.util.HashSet;

/* Write a Java program to convert a hash set to an array */

public class Problem21 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(50);
		h1.add(100);
		h1.add(150);
		h1.add(200);
		h1.add(250);
		
		Integer[] a = new Integer[h1.size()];
		h1.toArray(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
