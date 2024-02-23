package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class IncreaseBy2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > 0 || array[i] == 0) {
                array[i] += 2;
            }
            System.out.print(array[i] + " ");
        }
    }
}