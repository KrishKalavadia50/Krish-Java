package Com.module2oops;


/*Create a class named 'Shape' with a method to print "This is this is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and "This is circular shape"
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
object of 'Square' class.*/

class Shape1{
    public void shapeMethod()
    {
        System.out.println("This is this is shape 💠");
    }
}
class Rectangle1 extends Shape1{
    public void shapeRectangel()
    {
        System.out.println("This is rectangular shape");
    }
}
class Circle1 extends Shape1{
    public void shapeCircle()
    {
        System.out.println("This is circular shape");
    }
}
class Square1 extends Rectangle1{
    public void shapeSquare()
    {
        System.out.println("Square is a rectangle ▬");
    }
}
public class Problem13 {
    public static void main(String[] args) {
        Square1 s1 = new Square1();
        s1.shapeSquare();
        s1.shapeMethod();
    }
}
