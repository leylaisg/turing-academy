package az.edu.turing.module01.previouslessons;

import java.util.Scanner;

public class NumberOfOddApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i < num; i++) {
            num /= i;
            if (num % 2 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
