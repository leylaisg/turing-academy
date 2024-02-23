package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class EvenOddApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String type = n % 2 == 0 ? "EVEN" : "ODD";
        System.out.println(type);
    }
}
