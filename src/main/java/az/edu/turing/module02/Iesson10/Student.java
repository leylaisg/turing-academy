package az.edu.turing.module02.Iesson10;

import az.edu.turing.module02.lesson09.Player;

public class Student implements Comparable<Student>{
    public String name;
    public int score;
    public int age;

    public Student(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name='%s', score=%d, age=%d}".formatted(name, score, age);
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.age, that.age);
    }
}