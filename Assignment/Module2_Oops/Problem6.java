package Com.module2oops;

/*Print the sum, difference and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by user. */


import javax.swing.plaf.PanelUI;
import java.util.Scanner;

class Complex{
    int FirstReal;
    int FirstImaginary;
    int SecondReal;
    int SecondImaginary;

    public Complex(int FirstReal, int FirstImaginary, int SecondReal, int SecondImaginary){
        this.FirstReal = FirstReal;
        this.FirstImaginary = FirstImaginary;
        this.SecondReal = SecondReal;
        this.SecondImaginary = SecondImaginary;
    }

    public void Addition(){
        int A = FirstReal + SecondReal;
        int B = FirstImaginary + SecondImaginary;
        System.out.println("The sum of complex number is : ");
        System.out.println(A + "+" + B + "i");
    }

    public void Subtraction(){
        int A = FirstReal - SecondReal;
        int B = FirstImaginary - SecondImaginary;
        System.out.println("The substraction of complex number is : ");
        System.out.println(A + "+" + B + "i");
    }

    public void Multiplication(){
        int A = FirstReal * SecondReal - FirstImaginary * SecondImaginary;
        int B = FirstReal * SecondImaginary + FirstImaginary * SecondReal;
        System.out.println("The multiplication of complex number is : ");
        System.out.println(A + "+" + B + "i");
    }

}

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First 'FirstReal' number :- ");
        int FirstReal = sc.nextInt();
        System.out.print("Enter the First 'FirstImaginary' number :- ");
        int FirstImaginary = sc.nextInt();
        System.out.println("You have Enter first complex number is...");
        System.out.println(FirstReal + "+" +FirstImaginary + "i");

        System.out.print("Enter the Second 'SecondReal' number :- ");
        int SecondReal = sc.nextInt();
        System.out.print("Enter the Second 'SecondImaginary' number :- ");
        int SecondImaginary = sc.nextInt();
        System.out.println("You have Enter Second complex number is...");
        System.out.println(SecondReal + "+" +SecondImaginary + "i");

        Complex c1 = new Complex(FirstReal,FirstImaginary,SecondReal,SecondImaginary);
        c1.Addition();
        c1.Subtraction();
        c1.Multiplication();
    }
}
