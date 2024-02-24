package az.edu.turing.module02.lesson04;

public class Fruit {
    private String type;
    private int size;

    private String color;
    public Fruit(String type, int size){
        this.size = size;
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

}