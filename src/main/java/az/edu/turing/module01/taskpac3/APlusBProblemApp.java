package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class APlusBProblemApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(Math.abs(a) + Math.abs(b));
        }
    }
}