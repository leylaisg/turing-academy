package az.edu.turing.module02.tasks;

public class Movie {

    private String name;
    private double rating;

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public Movie(String name, double rating){
        this.name = name;
        this.rating = rating;
    }
}