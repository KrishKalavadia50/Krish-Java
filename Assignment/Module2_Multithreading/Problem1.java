package Com.module2_Multithreading;


/*W.A.J. P to create one thread by implementing Runnable interface in
Class.*/

class Rotate implements Runnable
{


    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Rotate : " + i);
        }
        System.out.println("Completed");
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Rotate r1 = new Rotate();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
