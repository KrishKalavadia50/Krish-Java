package Com.module2;

import java.util.Scanner;

/*Write a java program to make addition, Subtraction and multiplication of two
matrix using 2-D Array*/
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] additionResult = new int[rows][cols];
        int[][] subtractionResult = new int[rows][cols];
        int[][] multiplicationResult = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                additionResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                subtractionResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        if (rows == cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    multiplicationResult[i][j] = 0;
                    for (int k = 0; k < cols; k++) {
                        multiplicationResult[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        } else {
            System.out.println("Multiplication is not possible for matrices of different dimensions");
        }

        System.out.println("Addition of matrices:");
        printMatrix(additionResult);

        System.out.println("Subtraction of matrices:");
        printMatrix(subtractionResult);

        if (rows == cols) {
            System.out.println("Multiplication of matrices:");
            printMatrix(multiplicationResult);
        }

        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
