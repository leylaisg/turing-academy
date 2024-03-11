package az.edu.turing.module02.miniproject;

public class MainApp {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        String[] habits = {"playing", "barking", "eating"};
        String[][] schedule = {{"Monday", "Tuesday"}, {"working", "again working"}};
        Human guldeste = new Human("Guldeste", "Gozelova", 1995, 100, schedule);

        System.out.println(guldeste.toString());
        Human human = new Human("Rahim", "Rahimov", 20);
        human.setSchedule(DayOfWeek.SUNDAY, "Go to party");
    }
}