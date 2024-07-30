package Com.module1;

import java.util.Scanner;


//Write a Java program to Take three numbers from the user and print the greatest number.
public class Problem1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your A :- ");
        a = sc.nextInt();
        System.out.print("Enter Your B :- ");
        b = sc.nextInt();
        System.out.print("Enter Your C :- ");
        c = sc.nextInt();


        if (a > b && a > c) {
            System.out.println("Your max number is...A :- " + a);
        } else if (b > a && b > c){
                System.out.println("Your max number is...B :- " + b);
        }else{
                System.out.println("Your max number is...C :- " + c);
        }
    }
}

