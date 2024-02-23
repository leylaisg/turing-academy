package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NegativeElementsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        double sum = 0;
        DecimalFormat dc = new DecimalFormat("0.00");
        for (int i = 0; i < n; i++) {
            double nums = scan.nextDouble();
            if (nums < 0) {
                counter++;
                sum += nums;
            }
        }
        System.out.print(counter + " " + dc.format(sum));
    }
}