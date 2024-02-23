package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class TwoDigitNumberApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n / 10 > 0 && n / 10 < 10 || n / 10 < 0 && n / 10 > -10) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}