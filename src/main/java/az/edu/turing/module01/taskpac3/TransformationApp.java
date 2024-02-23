package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class TransformationApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int counter = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n++;
            }
            counter++;
        }
        System.out.println(counter);
    }
}