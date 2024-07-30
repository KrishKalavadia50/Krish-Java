package Com.module2oops;


/*Write a program which will ask the user to enter his/her marks (out of 100). Define a
method that will display grades according to the marks entered as below:
Marks Grade :
1-100 A
1-90 B
1-80 B
1-70 C
1-60 D
41-50 DD40 Fail*/

import java.util.Scanner;

class Grade{
    public void studentGrade(float a)
    {
        if((a>=90) && (a<100))
        {
            System.out.print("Your grade is : ");
            System.out.println("A");
        }
        else if((a>=80) && (a<90))
        {
            System.out.print("Your grade is : ");
            System.out.println("B");
        }
        else if((a>=70) && (a<80))
        {
            System.out.print("Your grade is : ");
            System.out.println("B");
        }
        else if((a>=60) && (a<70))
        {
            System.out.print("Your grade is : ");
            System.out.println("C");
        }
        else if((a>=50) && (a<60))
        {
            System.out.print("Your grade is : ");
            System.out.println("D");
        }
        else
        {
            System.out.print("Your grade is : ");
            System.out.println("Fail");
        }
    }
}

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 'Percentage' : ");
        int a = sc.nextInt();
        Grade g1 = new Grade();
        g1.studentGrade(a);
    }
}
