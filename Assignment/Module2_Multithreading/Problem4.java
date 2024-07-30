package Com.module2_Multithreading;

/*W.A.J.P to start the same Thread twice by calling start () method twice. Test
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();*/

class ThreadTwice1 extends Thread
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("ThreadTwice1 is.. : " + i);
        }
    }
}
public class Problem4 {
    public static void main(String[] args) {
        ThreadTwice1 t1 = new ThreadTwice1();
        t1.start();
        t1.start();
    }
}
