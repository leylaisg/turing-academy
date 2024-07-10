package az.edu.turing.springboot01.domain.repository;

import az.edu.turing.springboot01.domain.entity.StudentEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryStudentRepository implements StudentRepository {
    public static List<StudentEntity> STUDENTS;
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    @PostConstruct
    public void init() {
        STUDENTS = List.of(
                new StudentEntity(1L, "Leyla", 28, true, 93.0, LocalDateTime.now(), LocalDateTime.now()),
                new StudentEntity(2L, "Aydan", 21, true, 94.0, LocalDateTime.now(), LocalDateTime.now()),
                new StudentEntity(3L, "Nezrin", 20, true, 95.0, LocalDateTime.now(), LocalDateTime.now())
        );
    }

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        return null;
    }

    @Override
    public List<StudentEntity> findAll() {
        return STUDENTS;
    }

    @Override
    public Optional<StudentEntity> findById(Long id) {
        return STUDENTS.stream().filter(studentEntity -> studentEntity.getId().equals(id)).findFirst();
    }

    @Override
    public void deleteById(Long id) {

    }
}
