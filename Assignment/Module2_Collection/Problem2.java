package module2_Collaction.com;

//Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.Iterator;

public class Problem2 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("Black");
		a1.add("Blue");
		a1.add("Red");
		a1.add("Green");
		a1.add("Yellow");
		a1.add("Navy Blue");

		Iterator<String> i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
