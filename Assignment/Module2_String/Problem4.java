package module2_String.com;

//Write a Java program to display the system time

import java.time.LocalDateTime;

public class Problem4 {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Localdatetime : " + dt);
    }
}
