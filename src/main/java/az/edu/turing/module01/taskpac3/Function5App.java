package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class Function5App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long y = scan.nextLong();
        long z = scan.nextLong();
        System.out.println(x * y * z + x + y * y + z * z * z);
    }
}