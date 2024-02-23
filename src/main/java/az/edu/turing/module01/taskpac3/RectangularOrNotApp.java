package az.edu.turing.module01.taskpac3;

import java.util.Arrays;
import java.util.Scanner;

public class RectangularOrNotApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short[] array = new short[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextShort();
        }
        Arrays.sort(array);
        if (Math.pow(array[2], 2) == Math.pow(array[0], 2) + Math.pow(array[1], 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}