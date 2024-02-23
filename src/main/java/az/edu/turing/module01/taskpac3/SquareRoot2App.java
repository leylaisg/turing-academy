package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareRoot2App {
    public static void main(String[] args) {
        short num = new Scanner(System.in).nextShort();
        DecimalFormat dc = new DecimalFormat("0.000");
        System.out.println(dc.format(Math.sqrt(num / 100 + ((num / 10) % 10) + (num % 10))));
    }
}