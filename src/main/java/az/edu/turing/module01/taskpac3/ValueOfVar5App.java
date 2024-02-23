package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueOfVar5App {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        DecimalFormat dc = new DecimalFormat("0.000; -0.000");
        if (x == 0) {
            System.out.println("Not a valid number");
        } else {
            double y = (2 * x / (Math.sqrt(x * x + 1))) - (Math.sqrt(x * x + 1) / (x * x * x));
            System.out.print(dc.format(y));
        }
    }
}