package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class PreviousEvenApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n % 2 == 0) {
            System.out.println(n - 2);
        } else {
            System.out.println(n - 1);
        }
    }
}