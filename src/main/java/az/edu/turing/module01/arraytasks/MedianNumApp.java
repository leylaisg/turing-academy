package az.edu.turing.module01.arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class MedianNumApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers [i] = scan.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[1]);
    }
}