package Com.module2_Multithreading;

/* W.A.J. P to create one thread by extending Thread class in another Class. */
class Num extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Num : " + i);
        }
        System.out.println("Completed");
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Num n1 = new Num();
        n1.start();
    }
}
