package Com.module2oops;

/* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor.*/

class Triangle{
    int a = 50;
    int b = 22;
    int c = 50;

    int s = (a*b*c)/2;

    int cl = (s-(s-a)*(s-b)*(s-c));

    public double Square(int a){
        double Square = a/2;
        double k;
        do {
            k=Square;
            Square = (k+(a/k))/2;
        }while ((k - Square) != 0);
            return Square;
    }

    double triangleArea = this.Square(cl);

    public void area(){
        System.out.println("The traingle area is : " + this.triangleArea);
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
    }
}
