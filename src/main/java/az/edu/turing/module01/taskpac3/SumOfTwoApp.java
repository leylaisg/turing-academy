package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class SumOfTwoApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
                System.out.println(array[i][0] + array[i][1]);
        }
    }
}