package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class AlphabetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        char[] array = new char[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.next().charAt(0);
        }
        for (int i = 0; i < 3; i++) {
            if ((int) array[i] <= 90 - count) {
                System.out.println((char) (((int) array[i]) + count));
            } else {
                System.out.println((char) (((int) array[i]) + count - 26));
            }
        }
    }
}