package az.edu.turing.module02.Iesson10;

import java.util.Comparator;

public class StudentSortByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
