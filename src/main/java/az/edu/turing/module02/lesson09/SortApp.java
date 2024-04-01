package az.edu.turing.module02.lesson09;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        Integer[] nums = {1, -5, 3, 0, 9};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}