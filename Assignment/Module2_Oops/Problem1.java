package Com.module2oops;


/*Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side
of square.*/

class Area{

    int length, breadth;
    public int area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

        int A = this.length * this.breadth;
        return A;
    }

    public int area(int length){
        this.length = length;
        int B = this.length * length;

        return B;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Area a1 = new Area();
        System.out.println("This area of rectangle is... " + a1.area(50,22));
        System.out.println("This area of square is... " + a1.area(50));
    }
}
