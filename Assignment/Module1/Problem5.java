package Com.module1;


/*Write a program in Java to display the pattern like right angle triangle with a number*/
public class Problem5 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
