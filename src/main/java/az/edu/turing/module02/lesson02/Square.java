package az.edu.turing.module02.lesson02;

public class Square {

    public static long countofSquares;
    private double side;
    private String color;

    public void calcLength(double side){
       double length = side * 4;
    }
    public void calcArea(double side){
        double area = side * side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (color.equals("white")){
            this.color = color;
        }
    }

    public double getSide() {
        return side;
    }
    public Square(double side, String color){
        countofSquares++;
    }
}
