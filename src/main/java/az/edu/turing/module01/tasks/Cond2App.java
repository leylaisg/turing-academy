package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class Cond2App {
    public static void main(String[] args) {
        long x = new Scanner(System.in).nextInt();
        if (x >= 10) {
            System.out.println(x * x * x + 5 * x);
        } else {
            System.out.println(x * x - 2 * x + 4);
        }
    }
}
