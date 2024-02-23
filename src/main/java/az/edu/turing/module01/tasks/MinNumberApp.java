package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class MinNumberApp {
    public static void main(String[] args) {
        String numbers = new Scanner(System.in).nextLine();
        int [] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a [i] = Integer.parseInt(numbers.split(" ")[i]);
        }
        int min = a [0];
        min = min < a[1] ? min : a [1];
        min = min < a[2] ? min : a[2];
        min = min < a[3] ? min : a[3];
        System.out.println(min);
    }
}
