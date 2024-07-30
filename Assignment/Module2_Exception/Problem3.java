package Com.module2_Exception;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Elements : ");
        int[] a = new int[5];
        try {
            for(int i = 0; i<a.length; i++)
            {
                a[i] = sc.nextInt();
            }
            System.out.print("Enter a number if you want to divide with an array element : ");
            int b = sc.nextInt();
            System.out.print("Enter a Aray index you want to divide with entered number : ");
            int c = sc.nextInt();
            int d = a[c]/b;
            System.out.println("Division is : " + d);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}