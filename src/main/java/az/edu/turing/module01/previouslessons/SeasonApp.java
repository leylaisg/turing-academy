package az.edu.turing.module01.previouslessons;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
            // 1. input
            System.out.println("Enter number of month: ");
            int month = new Scanner(System.in).nextInt();

            // 2. process
            String season = month < 1 || month > 12
                    ? "Wrong input!" : (month >= 3 && month <= 5)
                    ? "Spring" : (month > 5 && month <= 8)
                    ? "Summer" : (month > 8 && month <= 11)
                    ? "Autumn" : "Winter";
            // 3. output
            System.out.println(season);
            }
    }