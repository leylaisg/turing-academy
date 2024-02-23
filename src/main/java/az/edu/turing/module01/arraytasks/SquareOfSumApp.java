package az.edu.turing.module01.arraytasks;

import java.util.Scanner;

public class SquareOfSumApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n > 0 && n < 100) {
            System.out.println((n / 10 + n % 10) * (n / 10 + n % 10));
        } else {
            System.out.println("Not a valid number");
        }
    }
}