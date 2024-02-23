package az.edu.turing.module02.lesson04;

public class Fruit {
    public String type;
    public int size;

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
    public Fruit(String type, int size){
        this.size = size;
        this.type = type;
    }
}