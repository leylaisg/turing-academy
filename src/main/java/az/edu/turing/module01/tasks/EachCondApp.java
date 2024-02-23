package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class EachCondApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n % 3 == 0 && n % 2 == 0 && n / 10 > -10 && n / 10 < 10 && n != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}