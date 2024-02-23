package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class StreetNumberApp {
    public static void main(String[] args) {
        String numbers = new Scanner(System.in).nextLine();
        int n = Integer.parseInt(numbers.split(" ")[0]);
        int m = Integer.parseInt(numbers.split(" ")[1]);
        if ((n % 2 == 0 && m % 2 == 0) || (n % 2 != 0 && m % 2 != 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
