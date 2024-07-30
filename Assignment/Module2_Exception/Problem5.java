package Com.module2_Exception;

/*W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic
O/PException in thread main java. Lang. Arithmetic Exception:/ by zero*/

public class Problem5 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("Division Of Two Number Is... : " + c);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
