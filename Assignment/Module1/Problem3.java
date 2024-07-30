package Com.module1;

import java.util.Scanner;
/*Write a Java program that takes a year from user and print whether that year is a leap
year or not.*/
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year :- ");
        int year = sc.nextInt();

        if(year%4==0 ){
            System.out.println("\u001B[32mThis year is a leap year... " + year);
        }else {
            System.out.println("\u001B[31mThis year is not a leap year... " + year);
        }
    }
}
