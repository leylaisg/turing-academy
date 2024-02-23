package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        DecimalFormat dc = new DecimalFormat("0");
        System.out.println(dc.format(Math.pow(a, n)));
    }
}