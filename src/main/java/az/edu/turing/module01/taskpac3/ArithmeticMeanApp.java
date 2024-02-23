package az.edu.turing.module01.taskpac3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithmeticMeanApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float[] array = new float[n];
        float sum = 0;
        int counter = 0;
        DecimalFormat dc = new DecimalFormat("0.00");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextFloat();
            if (array[i] > 0) {
                sum += array[i];
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Not Found");
        } else {
            System.out.println(dc.format(sum / counter));
        }
    }
}