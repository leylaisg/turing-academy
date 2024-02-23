package az.edu.turing.module01.tasks;

public class Task11App {
    public static void main(String[] args) {
        int age = 6;
        int money = 20;
        while (age<13){
            money += 20;
            age ++;
        }
        System.out.println(money);
    }
}
