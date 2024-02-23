package az.edu.turing.module02.lesson01;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("Leyla", 28);
        System.out.println(student1.name);
        System.out.println(student1.grade);
        System.out.println(student1.age);
        System.out.println(student1);
        System.out.println(student1.studentCount);

        student1.studentCount = 15;

        Student student2 = new Student("Sevil", 30);
        System.out.println(student2.name);
        System.out.println(student2.grade);
        System.out.println(student2.age);
        System.out.println(student2);
        System.out.println(student2.studentCount);

        System.out.println(Student.studentCount);
    }
}
