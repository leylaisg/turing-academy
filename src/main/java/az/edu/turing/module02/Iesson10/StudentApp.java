package az.edu.turing.module02.Iesson10;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = getStudent();

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new StudentSortByName());
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return
                        s1.score > s2.score ? 1 : s1.score < s2.score ? -1
                                : s2.name.compareTo(s2.name);
            }
        });
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, (s1, s2) -> s1.age > s2.age ? 1 : s1.age < s2.age ? -1
                : s2.name.compareTo(s2.name));
        System.out.println(Arrays.toString(students));
    }


    private static Student[] getStudent() {
        return new Student[]{
                new Student("Leyla", 100, 29),
                new Student("Guldeste", 90, 29),
                new Student("Gulbostan", 98, 40),
                new Student("Sahib", 98, 34)
        };
    }
}