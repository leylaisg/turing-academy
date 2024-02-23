package az.edu.turing.module01.arraytasks;

import java.util.Scanner;

public class UseTheFunctionApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double [] nums = new double[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = Double.parseDouble(input.split(" ")[i]);
        }
        System.out.println(Math.min(Math.min(Math.max(nums[0], nums[1]),
                Math.max(nums[1], nums[2])), (nums[0] + nums[1] + nums[2])));
    }
}