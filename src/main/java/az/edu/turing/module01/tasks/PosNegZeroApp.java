package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class PosNegZeroApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n > 0) {
            System.out.println("Positive");
        } else if (n == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}
