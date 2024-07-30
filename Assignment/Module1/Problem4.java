package Com.module1;

import java.util.Scanner;

/*• Write a program in Java to input 5 numbers from keyboard and find their sum and
average using for loop.*/
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 5;
        for(int i=0; i<num; i++) {
            System.out.print("Enter number " + (i + 1) + " :- ");
            int number = sc.nextInt();
            sum += number;
        }
            double Average = (double) sum/num;

        System.out.println("Sum is :- " + "\u001B[32m" + sum + "\u001B[0m");
        System.out.println("Average is :- " + "\u001B[32m" + Average + "\u001B[0m");

    }
}

