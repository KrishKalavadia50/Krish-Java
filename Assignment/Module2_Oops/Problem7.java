package Com.module2oops;

/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
having a method with the same name 'message' that prints "This is first subclass"
and "This is second subclass" respectively. Call the methods 'message' by creating
an object for each subclass.*/

abstract class Parent{
    abstract public void message();
}
class Child1 extends Parent{

    @Override
    public void message() {
        System.out.println("This is a first child subclass 👶🏻");
    }
}
class Child2 extends Parent{

    @Override
    public void message(){
        System.out.println("This is a second child subclass 👶🏻");
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.message();
        Child2 c2 = new Child2();
        c2.message();
    }
}
