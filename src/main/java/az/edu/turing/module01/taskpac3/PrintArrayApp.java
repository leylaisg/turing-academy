package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class PrintArrayApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}