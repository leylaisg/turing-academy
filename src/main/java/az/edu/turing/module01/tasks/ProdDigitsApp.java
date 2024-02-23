package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class ProdDigitsApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println((n / 100) * ((n / 10) % 10) * (n % 10));
    }
}
