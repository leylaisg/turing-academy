package az.edu.turing.module01.tasks;

public class Exam1App {
    public static void main(String[] args) {
        int [] array = {4, 8, -15, 6, 5, -4, 6, -7};
        int temp = array[0];
        int num = array[0];
        for (int element : array) {
            if (element < temp) {
                num = temp;
                temp = element;
            } else if (element < num) {
                num = element;
            }
        }
        System.out.println(num);
    }
}
