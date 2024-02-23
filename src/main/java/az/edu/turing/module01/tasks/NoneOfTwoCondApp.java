package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class NoneOfTwoCondApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if ((n % 2 == 0 && n > 0) || (n % 2 != 0 && n < 0)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}