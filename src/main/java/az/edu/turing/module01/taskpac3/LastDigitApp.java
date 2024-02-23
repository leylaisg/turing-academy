package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class LastDigitApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n % 10);
    }
}