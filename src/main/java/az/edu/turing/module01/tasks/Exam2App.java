package az.edu.turing.module01.tasks;

public class Exam2App {
    public static void main(String[] args) {
        String name = "Afandiyev";
        name = name.replace('a', 'u');
        name = name.toUpperCase();
        System.out.println(name.indexOf('V'));
        System.out.println(name.charAt(2));
    }
}
