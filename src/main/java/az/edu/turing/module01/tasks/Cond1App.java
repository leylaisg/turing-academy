package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class Cond1App {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        if (x >= 5) {
            System.out.println(x + 7);
        } else {
            System.out.println(x * x - 3 * x + 4);
        }
    }
}
