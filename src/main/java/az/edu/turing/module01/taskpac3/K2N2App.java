package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class K2N2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        System.out.println((int)(Math.pow(2, k) + Math.pow(2, n)));
    }
}