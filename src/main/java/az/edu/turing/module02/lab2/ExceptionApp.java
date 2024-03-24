package az.edu.turing.module02.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(inputString());
        System.out.println(computeSequence(s));
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        try {
            File file = new File("C:\\Users\\user\\IdeaProjects\\turing-academy\\src\\main\\java\\az\\" +
                    "edu\\turing\\module02\\lab2\\Text.txt");
            String exp = new Scanner(file).nextLine();
            return exp;
        } catch (FileNotFoundException e) {
            String input = scanner.nextLine();
            return input;
        } finally {
            scanner.close();
        }
    }

    public static int computeSequence(String s) {
        try {
            int input = Integer.parseInt(s);
            int sum = 0;
            int lastdigit = input % 10;
            while (input > 0) {
                sum = sum + input % 10;
                input /= 10;
            }
            input = (sum - lastdigit) / lastdigit;
            return input;
        } catch (IllegalArgumentException | ArithmeticException e) {
            return -1;
        }
    }
}