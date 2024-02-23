package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class DivisibilityApp {
    public static void main(String[] args) {
        String numbers = new Scanner(System.in).nextLine();
        int a = Integer.parseInt(numbers.split(" ")[0]);
        int b = Integer.parseInt(numbers.split(" ")[1]);
        if (a % b == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println(a / b + " " + a % b);
        }
    }
}