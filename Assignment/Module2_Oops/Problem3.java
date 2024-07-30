package Com.module2oops;

/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.*/

class Member{

    int datamembers,age;
    long phonenumber,salary;

    String name,address;
    public Member(int datamembers , String name, int age, long phonenumber, String address, long salary){
        this.datamembers = datamembers;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.address = address;
        this.salary = salary;
    }
    public void display(){
        System.out.println(name + " Salary is... " + salary);
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Member m1 = new Member(1,"Mr.Abhi",20, 1234567890, "Ahmedabad Gujarat",15000000 );
        m1.display();
        Member m2 = new Member(1,"Mr.Krish",20, 1234567809, "Ahmedabad Gujarat",10000000 );
        m2.display();

    }
}
