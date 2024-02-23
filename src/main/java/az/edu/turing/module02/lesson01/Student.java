package az.edu.turing.module02.lesson01;

public class Student {

    public static int studentCount;
    public String name;
    public double grade;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }

}