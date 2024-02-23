package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MaxOfAbsValueApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float[] array = new float[n];
        DecimalFormat dc = new DecimalFormat("0.00");
        for (int i = 0; i < n; i++) {
            array[i] = Math.abs(scan.nextFloat());
        }
        Arrays.sort(array);
        System.out.println(dc.format(array[n - 1]));
    }
}