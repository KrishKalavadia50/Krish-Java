package module2_Collaction.com;

/* Write a Java program to append the specified element to the end of a hash set. */
//import java.util.HashSet;
import java.util.LinkedHashSet;

public class Problem11 {
	public static void main(String[] args) {
		LinkedHashSet<String> lh1 = new LinkedHashSet<String>();
		lh1.add("Black");
		lh1.add("Blue");
		lh1.add("Red");
		lh1.add("Green");
		lh1.add("Yellow");
		lh1.add("Navy Blue");
		System.out.println(lh1);

		lh1.add("Medlight");
		System.out.println(lh1);
	}
}
