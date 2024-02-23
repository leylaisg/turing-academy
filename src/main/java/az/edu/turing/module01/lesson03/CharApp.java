package az.edu.turing.module01.lesson03;

public class CharApp {
    public static void main(String[] args) {
        char [] chars = {'a', 'b', 'c'};
        printChar(chars);
    }

    public static void printChar(char [] chars){
        for (int i = 0; i < 3; i++) {
            System.out.print(chars [i]);
        }
    }
}