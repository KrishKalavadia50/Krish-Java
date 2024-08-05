package module2_String.com;

import java.util.Scanner;

/* 
  W.A.J.P to check whether a given string ends with the contents of another string.
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
*/
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "Java Exercise";
        System.out.print("Enter the end part of string : ");
        String end = sc.nextLine();
        if (a.endsWith(end)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
        sc.close();
    }
}
