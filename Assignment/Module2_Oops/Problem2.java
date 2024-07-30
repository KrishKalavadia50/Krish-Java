package Com.module2oops;

/* Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class */

class parent {

    public void parentSetData(){
        System.out.println("This is a parent class");
    }
}
class Child extends parent{
    public void childSetData(){
        System.out.println("This is child class");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        parent p1 = new parent();
        System.out.print(1+") ");
        p1.parentSetData();
        Child c1 = new Child();
        System.out.print(2+") ");
        c1.childSetData();
        System.out.print(3+") ");
        c1.parentSetData();
    }
}
