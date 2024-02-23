package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class SeasonsApp {
    public static void main(String[] args) {
        int season = new Scanner(System.in).nextInt();
        switch (season) {
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Autumn");
        }
    }
}
