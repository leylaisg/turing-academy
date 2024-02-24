package az.edu.turing.module02.lesson04;

public class FruitApp {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("alma", 5);
        System.out.println(fruit1.getType() + " " + fruit1.getSize());
        fruit1.setColor("red");
        System.out.println(fruit1.getColor());
    }
}
