package az.edu.turing.module01.previouslessons;

import java.util.Scanner;

public class SumProdApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum = 0;
        int prod = 1;
        for (;num > 0; num /= 10) {
            sum += num % 10;
            prod *= num % 10;
        }
        System.out.println(sum);
        System.out.println(prod);
    }
}