package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class Rectangle2App {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[][] rectangle = new int[4][n];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("#" + "");
            }
            System.out.println();
        }
    }
}