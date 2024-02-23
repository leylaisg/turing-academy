package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class MaxNumberApp {
    public static void main(String[] args) {
        String[] a = new Scanner(System.in).nextLine().split(" ");
        int max = Integer.parseInt(a[0]);
        max = max > Integer.parseInt(a[1]) ? max : Integer.parseInt(a[1]);
        max = max > Integer.parseInt(a[2]) ? max : Integer.parseInt(a[2]);
        max = max > Integer.parseInt(a[3]) ? max : Integer.parseInt(a[3]);
        System.out.println(max);
    }
}
