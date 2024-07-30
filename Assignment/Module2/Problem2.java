package Com.module2;

/*Write a java program to find out the 2nd max number from given array using
function.*/
public class Problem2 {
    public int secondMaxNum(int[] x){
        int[] a = x;
        int max = a[0];
        int Snum = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i] > max){
                Snum = max;
                max = a[i];
            }
        }
        return Snum;
    }

    public static void main(String[] args) {
        int[] a = {10,50,30,20,80};
        Problem2 p2 = new Problem2();
        int Snum = p2.secondMaxNum(a);
        System.out.println("The Second Max Number Is..." + Snum);
    }
}
