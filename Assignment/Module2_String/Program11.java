package module2_String.com;

import java.util.Scanner;

/*
 W.A.J.P to find the second most frequent character in a given string. The given string
is: successes the second most frequent char in the string is: c
 */

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency[c]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            System.out.print("the " + i + " is " + frequency[i]);
        }


        int maxFreq = -1;
        int secondMaxFreq = -1;
        char maxChar = '\0';
        char secondMaxChar = '\0';

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFreq) {
                secondMaxFreq = maxFreq;
                secondMaxChar = maxChar;
                maxFreq = frequency[i];
                maxChar = (char) i;
            } else if (frequency[i] > secondMaxFreq && frequency[i] < maxFreq) {
                secondMaxFreq = frequency[i];
                secondMaxChar = (char) i;
            }
        }

        System.out.print("Secound max charectore is : " + secondMaxChar);
        sc.close();
    }
}
