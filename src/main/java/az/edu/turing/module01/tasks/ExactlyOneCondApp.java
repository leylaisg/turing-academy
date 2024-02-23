package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class ExactlyOneCondApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        boolean cond = n % 2 == 0;
        if (n % 3 == 0 && n < 0) {
            cond = !cond;
        }
        if (cond) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}