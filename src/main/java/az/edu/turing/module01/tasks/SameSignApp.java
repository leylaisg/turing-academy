package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class SameSignApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        if ((n > 0 && m > 0) || (n < 0 && m < 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
