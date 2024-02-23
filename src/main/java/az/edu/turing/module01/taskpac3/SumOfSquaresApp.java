package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class SumOfSquaresApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((long) a * (long) a + (long) b * (long) b);
    }
}