package module2_String.com;

import java.util.Scanner;

/* Write a Java program that accepts an integer (n) and computes the value of
n+nn+nnn. Input number: 5
5 + 55 + 555
*/
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        String ab = new String();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            ab = Integer.toString(a);
            int j = 0;
            int r = a;
            while (i > j) {
                r = Integer.parseInt(ab.concat("" + r));
                j++;
            }
            sum = sum + r;
        }
        System.out.println(sum);
    }
}