package az.edu.turing.module01.previouslessons;

import java.util.Random;
import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = new Random().nextInt(100);
        boolean won = false;
        while (!won){
            int guldeste = scan.nextInt();
            if (guldeste > random){
                System.out.println("Your number is big");
            } else if (guldeste < random) {
                System.out.println("Your number is small");
            } else{
                System.out.println("You won");
                won = true;
            }
        }
    }
}
