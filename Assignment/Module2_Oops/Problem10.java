package Com.module2oops;

/*Write a program to print the factorial of a number by defining a method named
'Factorial'.*/

import java.util.Scanner;

class FactorialNumber{
    public int Factorial(int A){
        int Factorial = 1;
        for(int i=1; i<=A; i++){
            Factorial = Factorial*i;
        }
        return Factorial;
    }
}

public class Problem10 {
    public static void main(String[] args) {
        FactorialNumber f1 = new FactorialNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to find the factorial number : ");
        int N = sc.nextInt();
        int F = f1.Factorial(N);
        System.out.print("The factorial of entered number is :  " + F);
    }
}
