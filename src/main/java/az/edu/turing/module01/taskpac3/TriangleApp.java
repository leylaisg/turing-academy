package az.edu.turing.module01.taskpac3;

import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sides = new int[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = scan.nextInt();
        }
        if (sides[0] == sides[1] && sides[1] == sides[2]) {
            System.out.println("1");
        } else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}