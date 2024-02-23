package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class SumOfDigitsApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.println(((number / 1000) + (number % 10)));
    }
}
