package module2_String.com;
/* W.A.J.P to concatenate a given string to the end of another string. */

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = new String("Hello...How are you ");
        System.out.print("Enter the String : ");
        String b = sc.nextLine();
        String c = a.concat(b);
        System.out.print("The new string is : " + c);
        sc.close();
    }
}
