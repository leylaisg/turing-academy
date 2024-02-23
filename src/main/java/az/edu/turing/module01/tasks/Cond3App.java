package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class Cond3App {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        if (x < -4) {
            System.out.println(x + 5);
        } else if (x >= -4 && x <= 7) {
            System.out.println(x * x - 3 * x);
        } else {
            System.out.println(x * x * x + 2 * x);
        }
    }
}