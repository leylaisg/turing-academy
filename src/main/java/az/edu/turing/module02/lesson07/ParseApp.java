package az.edu.turing.module02.lesson07;

import java.util.Scanner;

public class ParseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        System.out.println(num1 / num2);
    }
}