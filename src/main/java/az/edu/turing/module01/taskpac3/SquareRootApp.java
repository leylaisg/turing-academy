package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareRootApp {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        DecimalFormat dc = new DecimalFormat("0.000000");
        if (n >= 0) {
            System.out.println(dc.format(Math.sqrt(n)));
        }
    }
}