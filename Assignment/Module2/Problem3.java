package Com.module2;

import java.util.Scanner;

/* � Write A Java Program to take two Array input from user and sort them in
ascending or descending order as per user�s choice */

public class Problem3 {
    public void acendingOrder(int[] x)
    {
        int[] a = x;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1-i; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void decendingOrder(int[] x)
    {
        int[] a = x;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1-i; j++)
            {
                if(a[j] < a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first array elements : ");
        for(int i = 0; i<a.length; i++)
        {
            System.out.println("Enter the " + i + " elements : ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the secound array elements : ");
        for(int i = 0; i<b.length; i++)
        {
            System.out.println("Enter the " + i + " elements : ");
            b[i] = sc.nextInt();
        }

        Problem3 p3 = new Problem3();
        p3.acendingOrder(a);

        System.out.println("Choose 'a' for acending and 'd' for desending.." );
        System.out.println("Enter the your choice for 1st array and 2nd array concurrently : ");
        char a1 = sc.next().charAt(0);
        char b1 = sc.next().charAt(0);

        if((a1 == 'a') && (b1 == 'a'))
        {
            p3.acendingOrder(a);
            p3.acendingOrder(b);
        }
        else if((a1 == 'a') && (b1 == 'd'))
        {
            p3.acendingOrder(a);
            p3.decendingOrder(b);
        }
        else if((a1 == 'd') && (b1 == 'a'))
        {
            p3.decendingOrder(a);
            p3.acendingOrder(b);
        }
        else if((a1 == 'd') && (b1 == 'd'))
        {
            p3.decendingOrder(a);
            p3.decendingOrder(b);
        }
        else
        {
            System.out.println("Enter correct charectore !!");
        }

        System.out.println("Array1 : ");
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Array2 : ");
        for(int i = 0; i<b.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        sc.close();

    }
}