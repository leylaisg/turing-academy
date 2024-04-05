package az.edu.turing.module02.lesson11;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<Integer>even = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
        };
        System.out.println(even.test(12));
        System.out.println(even.test(11));
    }

}
