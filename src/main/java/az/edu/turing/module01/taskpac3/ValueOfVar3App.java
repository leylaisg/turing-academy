package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueOfVar3App {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        DecimalFormat dc = new DecimalFormat("0.000");
        double calculate = ((x * x + 3 * x - 4) / (2 * x - 3) - (x + 2) /
                (x * x - 5 * x + 7));
        System.out.println(dc.format(calculate));
    }
}