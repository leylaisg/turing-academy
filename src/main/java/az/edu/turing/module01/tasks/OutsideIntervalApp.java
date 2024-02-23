package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class OutsideIntervalApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scn.nextInt();
        }
        if (arr[0] < arr[1] || arr[0] > arr[2]) {
            System.out.println("OUT");
        } else {
            System.out.println("IN");
        }
    }
}
