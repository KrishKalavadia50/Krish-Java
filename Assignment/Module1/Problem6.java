package Com.module1;


/* Write a program in Java to make such a pattern like right angle triangle with number
increased by 1 The pattern like:*/
public class Problem6 {
    public static void main(String[] args) {
        int num = 1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
