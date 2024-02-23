package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class DivByNumApp {
    public static void main(String[] args) {
        String numbers = new Scanner(System.in).nextLine();
        int n = Integer.parseInt(numbers.split(" ")[0]);
        int a = Integer.parseInt(numbers.split(" ")[1]);
        int b = Integer.parseInt(numbers.split(" ")[2]);
        if (n % a == 0 && n % b == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}