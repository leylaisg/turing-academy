package az.edu.turing.module02.miniproject;

public interface Foul {
    public default void foul() {
        System.out.println("I need to cover it up");
    }
}
