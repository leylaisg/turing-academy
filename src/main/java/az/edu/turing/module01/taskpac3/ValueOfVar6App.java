package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueOfVar6App {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        DecimalFormat dc = new DecimalFormat("0.000; -0.000");
        double calculate = (Math.sqrt(Math.pow(x, 4) + 1) / (x * x)) - (Math.sqrt((x * x) / (x * x + 1)));
        System.out.println(dc.format(calculate));
    }
}