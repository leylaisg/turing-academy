package az.edu.turing.module01.lesson03;

import java.util.Arrays;

public class Method2App {
    public static void main(String[] args) {
        PrintArrayList(new int[]{2, 3, 4});
        System.out.println(calculatePower(2,3));
        System.out.println(generateRandom());
    }
    public static void PrintArrayList(int[]array){
        System.out.println(Arrays.toString(array));
    }
    public static double calculatePower(int num, int pow){
        return Math.pow(num, pow);
    }
    public static double generateRandom(){
        return Math.random();
    }
}