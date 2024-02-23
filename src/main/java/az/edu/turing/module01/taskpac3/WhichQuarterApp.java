package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class WhichQuarterApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}