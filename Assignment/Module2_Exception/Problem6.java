package Com.module2_Exception;

/*W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid*/

import java.util.Scanner;

public class Problem6 {

    public static void VoterID(int a)
    {
        if(a>=18)
        {
            System.out.println("You are eligible for voting ✅️");
        }
        else
        {
            throw new  ArithmeticException("You are not eligible for voting ❎");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int a = sc.nextInt();
        VoterID(a);
    }
}
