package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class AtLeastOneCondApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n % 2 != 0) {
            System.out.println("YES");
        } else if (n / 100 > 0 && n / 100 < 10 && n > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}