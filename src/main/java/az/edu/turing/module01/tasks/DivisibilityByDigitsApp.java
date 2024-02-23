package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class DivisibilityByDigitsApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int digit1 = num / 1000;
        int digit2 = (num % 1000) / 100;
        int digit3 = (num % 100) / 10;
        int digit4 = num % 10;
        if (digit2 == 0 || digit3 == 0 || digit4 == 0){
            System.out.println("NO");
        }else if (num % digit1 == 0 && num % digit2 == 0 && num % digit3 == 0 && num % digit4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}