package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class OneDigitNumberApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n / 10 == 0) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}