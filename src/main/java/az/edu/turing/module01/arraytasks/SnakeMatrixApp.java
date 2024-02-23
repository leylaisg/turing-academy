package az.edu.turing.module01.arraytasks;

import java.util.Scanner;

public class SnakeMatrixApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[][] snake = new int[n][n];
        int start = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 snake[i][j] = start++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < n; j++) {
                    System.out.print(snake[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(snake[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}