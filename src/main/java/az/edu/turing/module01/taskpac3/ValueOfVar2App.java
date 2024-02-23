package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueOfVar2App {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        DecimalFormat dc = new DecimalFormat("0.000");
        System.out.println(dc.format(x - ((x * x + 4) / 2) + Math.pow(x, 3) - (3 / (x + 7))));
    }
}