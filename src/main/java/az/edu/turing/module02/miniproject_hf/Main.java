package az.edu.turing.module02.miniproject_hf;

import az.edu.turing.module02.miniproject.Family;

public class Main {
    public static void main(String[] args) {
        String[][] schedule = {{"Monday", "Tuesday"}, {"Reading book", "Going cinema"}};
        Pet baron = new Pet("dog", "Baron", 5, 50, new String[]{"jumping", "playing"});
        Human anna = new Human("Anna", "Karenina", 1954, 90, baron, new Human("Dafne", "Karenina", 1930),
                new Human("Michael", "Karenina", 1928), schedule);
        System.out.println(anna.toString());
        anna.describePet();
        anna.greetPet();
        baron.eat();
        baron.foul();
        baron.respond();
    }
}