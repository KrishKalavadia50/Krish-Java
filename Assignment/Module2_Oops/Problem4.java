package Com.module2oops;

/* Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perameter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square. */

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of rectangle is : " + (length * breadth));
    }

    public void perimeter() {
        System.out.println("The length of rectangle is : " + this.length);
        System.out.println("The breadth of rectangle is : " + this.breadth);
    }
}
    class Square extends Rectangle {
        int slength;


        public Square(int length, int breadth) {
            super(length, breadth);
            this.length = length;
        }

        public void sarea(){
            System.out.println("Area of Square is : " + (length * length));
        }

        public void sperimeter(){
            System.out.println("The length of Square is : " + this.length);
        }
    }

public class Problem4 {
    public static void main(String[] args) {
       Square s1 = new Square(50, 22);
       s1.area();
       s1.perimeter();
       s1.sarea();
       s1.sperimeter();


    }
}
