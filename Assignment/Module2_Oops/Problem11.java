package Com.module2oops;

/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods.*/

import java.util.Scanner;

abstract class Shape{
    abstract public void rectangleArea();
    abstract public void squareArea();
    abstract public void circleArea();
}

class area1 extends Shape{

    int length;
    int breadth;
    int radius;
    int side;
    public area1(int a, int b, int c, int d)
    {
        length = a;
        breadth = b;
        radius = c;
        side = d;
    }
    @Override
    public void rectangleArea() {
        int a = length * breadth;
        System.out.println("The area of the rectangle is : " + a);
    }

    @Override
    public void squareArea() {
        int a = side*side;
        System.out.println("The area of the square is : " + a);
    }

    @Override
    public void circleArea() {
        double a = Math.PI *radius*radius;
        System.out.println("The area of the circle is : " + a);
    }

}
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int a = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int b = sc.nextInt();
        System.out.print("Enter the radius : ");
        int c = sc.nextInt();
        System.out.print("Enter the side : ");
        int d = sc.nextInt();
        area1 A1 = new area1(a,b,c,d);
        A1.rectangleArea();
        A1.squareArea();
        A1.circleArea();
    }
}
