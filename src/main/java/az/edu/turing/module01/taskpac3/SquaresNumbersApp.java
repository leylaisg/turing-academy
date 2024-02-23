package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class SquaresNumbersApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i < n; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)){
                System.out.print(i + " ");
            }
        }
    }
}