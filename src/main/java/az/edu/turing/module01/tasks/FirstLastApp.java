package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class FirstLastApp {
    public static void main(String[] args) {
        short a = new Scanner(System.in).nextShort();
        if ((a / 100) > (a % 10)) {
            System.out.println(a / 100);
        } else if ((a / 100) < (a % 10)) {
            System.out.println(a % 10);
        } else {
            System.out.println("=");
        }
    }
}
