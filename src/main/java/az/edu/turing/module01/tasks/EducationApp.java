package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class EducationApp {
    public static void main(String[] args) {
        int grade = new Scanner(System.in).nextInt();
        if (grade < 4) {
            System.out.println("Initial");
        } else if (grade < 7) {
            System.out.println("Average");
        } else if (grade < 10) {
            System.out.println("Sufficient");
        } else {
            System.out.println("High");
        }
    }
}