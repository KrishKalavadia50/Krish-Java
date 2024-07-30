package Com.module1;


import java.util.Scanner;

/*Write a Java program that reads a positive integer and count the number of digits
the number.*/
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :- ");
        int a = sc.nextInt();

        if(a <= 0){
            System.out.println("\u001B[31mPlease enter valid number");
        }


        int digits = 0;
        int number = a;

        while (number > 0){
            number /=10;
            digits++;
        }
        System.out.println("Integer Number :- " + a);
        System.out.println("Number of digits :- " + digits);
    }
}
