package Com.module2;


import java.util.Scanner;

/*Write a java program Find out length of string without using inbuilt function*/
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String a = sc.nextLine();
        char [] b= a.toCharArray();
//        System.out.println(b.length);

        for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
    }
}
