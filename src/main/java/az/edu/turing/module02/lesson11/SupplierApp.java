package az.edu.turing.module02.lesson11;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<Integer> random = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 101);
            }
        };
        System.out.println(random.get());

        Supplier<Integer> random2 = () -> (int) (new Random().nextInt());
        System.out.println(random2.get());
    }
}
