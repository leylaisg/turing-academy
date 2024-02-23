package az.edu.turing.module01.arraytasks;

import java.util.Scanner;

public class Rectangle3App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] rectangle = new int[scan.nextInt()][scan.nextInt()];
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print('#' + "");
            }
            System.out.println();
        }
    }
}