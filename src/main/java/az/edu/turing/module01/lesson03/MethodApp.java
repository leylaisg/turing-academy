package az.edu.turing.module01.lesson03;

public class MethodApp {
    public static void main(String[] args) {
        System.out.println(DoubleMethod(3));
        System.out.println(IntegerMethod(4));
    }

    public static double DoubleMethod (double d){
        return d + 2;
    }
    public static int IntegerMethod (int i){
        return i + 2;
    }
}
