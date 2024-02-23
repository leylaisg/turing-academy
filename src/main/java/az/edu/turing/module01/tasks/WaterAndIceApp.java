package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class WaterAndIceApp {
    public static void main(String[] args) {
        int t = new Scanner(System.in).nextInt();
        if (t > 0) {
            System.out.println("Water");
        } else {
            System.out.println("Ice");
        }
    }
}