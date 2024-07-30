package Com.module2_Multithreading;

/*W.A.J.P to create 2 threads and execute that threads by providing sleep time as
2000ms and check the execution.*/
class K extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            try {
                K.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Class K is... : " + i);
        }
        System.out.println("Completed");
    }
}
class D extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            try {
                D.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Class D is... : " + i);
        }
        System.out.println("Completed");
    }
}
public class Problem3 {
    public static void main(String[] args) {
        K k1 = new K();
        D d1 = new D();
        k1.start();
        d1.start();
    }
}
