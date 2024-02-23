package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RatioOfProductApp {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        DecimalFormat dc = new DecimalFormat("0.000");
        long prod = 1;
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            prod *= n % 10;
            n /= 10;
        }
        double ratio = (double) prod / sum;
        System.out.println(dc.format(ratio));
    }
}