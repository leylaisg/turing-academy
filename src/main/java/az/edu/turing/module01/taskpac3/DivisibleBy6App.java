package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class DivisibleBy6App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] % 6 == 0 && array[i] > 0) {
                counter++;
                sum += array[i];
            }
        }
        System.out.print(counter + " " + sum);
    }
}