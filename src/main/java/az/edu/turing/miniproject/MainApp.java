package az.edu.turing.miniproject;

public class MainApp {
    public static void main(String[] args) {
        Human mother = new Human();
        Human father = new Human();
        String [] habits = {"playing", "barking","eating"};
        String[][]schedule = {{"Monday", "Tuesday"}, {"working", "again working"}};
        Pet pet = new Pet("dog", "Robert", 5, 70,habits);
        Human guldeste = new Human("Guldeste", "Gozelova", 1995, 100, pet, mother, father, schedule);

        System.out.println(pet.toString());
        System.out.println(guldeste.toString());
        pet.eat();
        pet.foul();
        pet.respond();
        guldeste.describePet();
        guldeste.greetPet();
    }
}