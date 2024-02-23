package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class MaxMinApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a > b) {
            System.out.println(b + " " + a);
        } else {
            System.out.println(a + " " + b);
        }
    }
}
