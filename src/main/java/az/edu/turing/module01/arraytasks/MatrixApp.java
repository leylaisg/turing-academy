package az.edu.turing.module01.arraytasks;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int [][] matrix = new int[n][m];
        int start = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = start++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}