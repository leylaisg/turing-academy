package az.edu.turing.module01.lesson04;

import java.util.Scanner;

public class String1App {
    public static void main(String[] args) {
        String email = new Scanner(System.in).nextLine();
        String name = getname(email);
        System.out.println(name);
        System.out.println();
    }

    public static String getname(String email) {
        int index = email.charAt('@');
        String name = email.substring(0, index);
        return name;
    }
    public static int number(String name){
        int num = name.length();
        return num;
    }
}
