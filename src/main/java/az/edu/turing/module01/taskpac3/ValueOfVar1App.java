package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueOfVar1App {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        DecimalFormat dc = new DecimalFormat("0.000");
        if (x == 0){
            System.out.println("Not valid number");
        }else {
            System.out.println(dc.format(Math.pow(x, 3) - (5 * Math.pow(x, 2)) / 7 + (9 * x) - (3 / x) + 1));
        }
    }
}