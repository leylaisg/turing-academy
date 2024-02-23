package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class NumberInReverseOrderApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        while (n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }
    }
}