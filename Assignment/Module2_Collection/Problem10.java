package module2_Collaction.com;

// Write a Java program to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Problem10 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(50);
		a1.add(100);
		a1.add(150);
		a1.add(200);
		a1.add(250);
		System.out.println("Array List : " + a1);

		Collections.shuffle(a1);
		
		System.out.println("After shuffle : " + a1);
	}
}
