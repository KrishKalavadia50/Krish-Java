package Com.module2;

/*Write a java program to find out the max number from given array using function*/
public class Problem1 {

    public static int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int num : array){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] number = {1,3,5,2,4,50,22,10,-1};
        int findmax = findMax(number);
        System.out.println("Max number is :- "+ findmax);
    }
}