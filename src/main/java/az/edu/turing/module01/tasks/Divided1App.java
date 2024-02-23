package az.edu.turing.module01.tasks;

import java.util.Scanner;
public class Divided1App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.print(k / n);
    }
}
