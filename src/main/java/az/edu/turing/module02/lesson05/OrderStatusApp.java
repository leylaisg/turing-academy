package az.edu.turing.module02.lesson05;

import java.util.Scanner;

import static az.edu.turing.module02.lesson05.OrderStatusFinal.ACCEPTED;
import static az.edu.turing.module02.lesson05.OrderStatusFinal.DELIVERED;
import static az.edu.turing.module02.lesson05.OrderStatusFinal.SHIPPED;

public class OrderStatusApp {
    public static void main(String[] args) {
        String status = new Scanner(System.in).nextLine();
        sendEmail(status);
    }

    public static void sendEmail(String status) {
        if (OrderStatusFinal.ACCEPTED.equalsIgnoreCase(status)) {
            System.out.println("Your order is accepted");
        } else if (OrderStatusFinal.SHIPPED.equalsIgnoreCase(status)) {
            System.out.println("Your order is shipped");

        } else if (OrderStatusFinal.DELIVERED.equalsIgnoreCase(status)) {
            System.out.println("Your order is delivered");
        } else {
            System.out.println("Not a valid status");
        }
    }
}