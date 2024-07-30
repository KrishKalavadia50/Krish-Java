package Com.module2oops;

/*We have to calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
other classes 'A' and 'B' each having a method with the same name which returns the
percentage of the students. The constructor of student A takes the marks in three
subjects as its parameters and the marks in foursubjects as its parameters forstudent
B. Create an object for each of the two classes and print the percentage of marks for
both the students.*/

import java.nio.file.OpenOption;
import java.util.Scanner;

abstract class Marks{
    abstract public float getPercentage();
}

class StudentA extends Marks{

    float OOP;
    float DS;
    float DBMS;

    public StudentA(float Oop, float Ds,  float Dbms){
        OOP = Oop;
        DS = Ds;
        DBMS = Dbms;
    }

    @Override
    public float getPercentage() {
        float Calculate = OOP + DS + DBMS;
        float Percentage = Calculate/3;
        return Percentage;
    }
}

class StudentB extends Marks{

    float OOP;
    float DS;
    float DBMS;

    public StudentB(float Oop, float Ds,  float Dbms){
        OOP = Oop;
        DS = Ds;
        DBMS = Dbms;
    }

    @Override
    public float getPercentage() {
        float Calculate = OOP + DS + DBMS;
        float Percentage = Calculate/3;
        return Percentage;
    }
}

public class Problem9 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student A Marks");
        System.out.print("Enter marks for S1Oop: ");
        int S1Oop = sc.nextInt();
        if (S1Oop > 100 || S1Oop < 0) {
            System.out.println("Please enter valid marks ⚠️");
            sc.close();
            return;
        }


        System.out.print("Enter marks for S1Ds: ");
        int S1Ds = sc.nextInt();
        if (S1Ds > 100 || S1Ds < 0) {
            System.out.println("Please enter valid marks ⚠️");
            sc.close();
            return;
        }

        System.out.print("Enter marks for S1Dbms: ");
        int S1Dbms = sc.nextInt();
        if (S1Dbms > 100 || S1Dbms < 0) {
            System.out.println("Please enter valid marks ⚠️");
            sc.close();
            return;
        }

        StudentA s1 = new StudentA(S1Oop,S1Ds,S1Dbms);

        System.out.println("Enter Student B Marks");
        System.out.print("Enter marks for S2Oop: ");
        int S2Oop = sc.nextInt();
        if (S2Oop > 100 || S2Oop < 0) {
            System.out.println("Please enter valid marks ⚠️");
            sc.close();
            return;
        }

        System.out.print("Enter marks for S2Ds: ");
        int S2Ds = sc.nextInt();
        if (S2Ds > 100 || S2Ds < 0) {
            System.out.println("Please enter valid marks ⚠️");
            sc.close();
            return;
        }

        System.out.print("Enter marks for S2Dbms: ");
        int S2Dbms = sc.nextInt();
        if (S2Dbms > 100 || S2Dbms < 0) {
            System.out.println("Please enter valid marks ⚠️");
            sc.close();
            return;
        }

        StudentB s2 = new StudentB(S2Oop,S2Ds,S2Dbms);

        sc.close(); */

        StudentA s1 = new StudentA(90,99,98);
        StudentB s2 = new StudentB(99,99,99);

        s1.getPercentage();
        System.out.println("The percentage of student A is... " + s1.getPercentage() +" %");
        s2.getPercentage();
        System.out.println("The percentage of student B is... " + s2.getPercentage() +" %");
    }
}
