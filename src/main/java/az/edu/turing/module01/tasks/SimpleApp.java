package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class SimpleApp {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.print(a / 10 + " " + a % 10);
    }
}
