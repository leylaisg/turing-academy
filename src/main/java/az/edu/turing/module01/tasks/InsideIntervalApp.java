package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class InsideIntervalApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array [i] = scn.nextInt();
        }
        if (array [0] >= array[1] && array [0] <= array[2]){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
