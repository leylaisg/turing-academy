package az.edu.turing.module01.arraytasks;

import java.util.Scanner;

public class Rectangle1App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] rectangle = new int[scan.nextInt()][3];
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print('#' + "");
            }
            System.out.println();
        }
    }
}