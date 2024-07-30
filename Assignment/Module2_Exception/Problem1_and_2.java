package Com.module2_Exception;

import java.util.Scanner;

/*
1) W.A.J. P to demonstrate try catch block,
2) Take two numbers from the user and perform the division operation and handle
Arithmetic Exception. O/P- Enter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero
*/
public class Problem1_and_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();
        try {
            int c = (a / b);
            System.out.println("Number Division is : " + c);
        } catch (Exception e) {
            e.printStackTrace();
//                System.out.println(e);
        }
    }
}