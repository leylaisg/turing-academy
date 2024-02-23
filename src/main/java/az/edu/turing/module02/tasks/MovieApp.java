package az.edu.turing.module02.tasks;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {

        //input

        System.out.println("Press 1 - Input movies \nPress 2 - Display movies and ratings\nPress 0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();
        String name = scanner.nextLine();
        double rating = scanner.nextDouble();
        Movie movie1 = new Movie (name, rating);
        int[] list = new int[3];

        //process

        for (int i = 0; i < list.length; i++) {
            switch (button){
                case 1 : list[i] = scanner.nextInt();
                case 2 :
                    System.out.println(list[i]);
                case 0 :
                    System.out.println("Exit");
            }
        }

    }
}