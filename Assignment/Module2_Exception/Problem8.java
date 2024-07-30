package Com.module2_Exception;


/*W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes.*/

class AgeNotWithinRangeException extends Exception
{
    public AgeNotWithinRangeException()
    {
        super("Age is not between the 15 to 21");
    }
}
class NameNotValidException extends Exception {
    public NameNotValidException() {
        super("Name contains numbers or special symbols");
    }
}

class Student
{
    int srollno;
    String sname;
    int sage;
    String scourse;

    public Student(int srollno, String sname, int sage, String scourse) throws AgeNotWithinRangeException, NameNotValidException {
        this.srollno = srollno;

        if(!sname.matches("[A-Za-z]+"))
        {
            throw new NameNotValidException();
        }
        this.sname = sname;

        if(sage<15 || sage>21)
        {
            throw new AgeNotWithinRangeException();
        }
        this.sage = sage;
        this.scourse = scourse;
    }

    public void setData()
    {
        System.out.println("Student Roll no is... : " + srollno);
        System.out.println("Student Name is... : " + sname);
        System.out.println("Student Age is... : " + sage);
        System.out.println("Student Course is... : " + scourse);
    }
}
public class Problem8 {
    public static void main(String[] args) {
        try
        {
            Student s1 = new Student(22,"Krish",21,"BE");
            s1.setData();
        }
        catch (NameNotValidException e)
        {
            e.printStackTrace();
        }
        catch(AgeNotWithinRangeException e)
        {
            e.printStackTrace();
        }
    }
}
