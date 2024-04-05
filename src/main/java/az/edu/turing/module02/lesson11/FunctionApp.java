package az.edu.turing.module02.lesson11;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> strToInt1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
        Function<String, Integer> strToInt = Integer::parseInt;
        System.out.println(strToInt.apply("45"));
    }
}