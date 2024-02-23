package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SumOfElementsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;
        DecimalFormat dc = new DecimalFormat("0.0");
        float[] array = new float[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextFloat();
            sum += array[i];
        }
        System.out.println(sum);
    }
}