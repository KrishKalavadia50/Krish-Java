package Com.module1;

import java.util.Scanner;


/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
message.*/
public class Problem2 {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character :- ");
        a = sc.next();
        if (a.length() > 1) {
            System.out.print("\u001B[31mError⚠️ ");
            System.out.print("Please Enter a Valid Char");
            System.exit(0);
        }

        char Alf = a.charAt(0);
        if ((Alf >= 'a' && Alf <= 'z') || (Alf >= 'A' && Alf <= 'Z')) {
            if (Alf == 'a' || Alf == 'e' || Alf == 'i' || Alf == 'o' || Alf == 'u' || Alf == 'A' || Alf == 'E' || Alf == 'I' || Alf == 'O' || Alf == 'U') {
                System.out.println("\u001B[32mIt's a Vowel");
            } else {
                System.out.println("\u001B[32mIt's a Consonant ");
            }
        } else {
            System.out.println("\u001B[31mPlease Enter a valid Char !! ");
        }


    }
}
