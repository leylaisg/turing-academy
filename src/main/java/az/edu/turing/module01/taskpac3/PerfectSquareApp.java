package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class PerfectSquareApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (Math.sqrt(n) == (int) Math.sqrt(n)){
            System.out.println((int) Math.sqrt(n));
        } else {
            System.out.println("No");
        }
    }
}