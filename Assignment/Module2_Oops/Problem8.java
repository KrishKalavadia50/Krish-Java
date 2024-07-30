package Com.module2oops;


/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are
subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classes.*/

abstract class Bank{
    abstract public void getBalance();
}

class BankA extends Bank{

    int bankAbalance;

    public BankA(int A){
        bankAbalance = A;
    }

    @Override
    public void getBalance() {
        System.out.println("BankA Balance is : $" + this.bankAbalance);
    }
}

class BankB extends Bank{

    int bankBbalance;

    public BankB(int B){
        bankBbalance = B;
    }

    @Override
    public void getBalance(){
        System.out.println("BankB Balance is : $" + this.bankBbalance);
    }
}

class BankC extends Bank{

    int bankCbalance;

    public BankC(int C){
        bankCbalance = C;
    }

    @Override
    public void getBalance() {
        System.out.println("BankC Balance is : $" + this.bankCbalance);
    }
}

public class Problem8 {
    public static void main(String[] args) {
        BankA b1 = new BankA(100);
        BankB b2 = new BankB(150);
        BankC b3 = new BankC(200);
        b1.getBalance();
        b2.getBalance();
        b3.getBalance();
    }
}
