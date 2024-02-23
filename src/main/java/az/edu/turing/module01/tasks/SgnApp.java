package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class SgnApp {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        if (x > 0) {
            System.out.println(1);
        } else if (x < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
