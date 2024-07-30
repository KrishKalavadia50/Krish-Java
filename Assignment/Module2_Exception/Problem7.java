package Com.module2_Exception;

/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
2500 Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.*/

import java.util.Scanner;

class AccountException extends Exception{
    double amount;

    public AccountException(double amount){
        this.amount = amount;
    }

}
class ATM{
    double balance;
    public void diposite(double amount){
        balance = balance + amount;
    }
    public void withdrawal(double amount) throws Com.module2_Exception.AccountException {
        if(amount <= balance){
            balance = balance-amount;
            System.out.println(amount + "Rs. Withdrawal Successfully");
        }else{
            double needs = amount - balance;
            throw new Com.module2_Exception.AccountException(needs);
        }
    }
}
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Com.module2_Exception.ATM a1 = new Com.module2_Exception.ATM();
        System.out.print("Enter Amount of diposite...");
        double amount = sc.nextDouble();
        a1.diposite(amount);

        System.out.print("Enter Amount if Withdrawal...");
        amount = sc.nextDouble();

        try{
            a1.withdrawal(amount);
        }catch(Com.module2_Exception.AccountException e){
            System.out.println("If You Enter "+e.amount+" Rs. Enter into Your Account Than You Can Withdrawal " + amount + " Rs.");
            e.printStackTrace();
        }
    }
}
