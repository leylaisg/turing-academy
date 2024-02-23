package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FirstIsNotGreaterApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] array = new double[n];
        boolean greater = false;
        DecimalFormat dc = new DecimalFormat("0.00");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] <= 2.5) {
                System.out.print(i + 1 + " " + dc.format(array[i]));
                greater = true;
                break;
            }
        }
        if (!greater){
            System.out.println("Not Found");
        }
    }
}