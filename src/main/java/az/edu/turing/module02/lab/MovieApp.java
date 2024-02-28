package az.edu.turing.module02.lab;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {

        //input

        System.out.println("Press 1 - Input movies \nPress 2 - Display movies and ratings\nPress 0 - Exit");
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = new Movie[3];

        //process

        do {
            System.out.println("Choose the button = ");
            int button = scanner.nextInt();
            switch (button) {
                case 1:
                    inputMovies(scanner, movies);

                    break;
                case 2:
                    System.out.println("Movies and Ratings:");
                    for (Movie movie : movies) {
                        if (movie != null) {
                            System.out.println(movie.getName() + " - " + movie.getRating());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }

    public static Movie[] inputMovies(Scanner scanner, Movie[] movies) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name of movie " + (i + 1) + ":");
            String name = scanner.next();
            System.out.println("Enter rating of movie " + (i + 1) + ":");
            double rating = scanner.nextDouble();
            scanner.nextLine();
            movies[i] = new Movie(name, rating);
        }
        return movies;
    }
}