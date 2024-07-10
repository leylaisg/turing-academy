package az.edu.turing.springboot01.domain.repository;

import az.edu.turing.springboot01.domain.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    StudentEntity save (StudentEntity studentEntity);
    List<StudentEntity> findAll();
    Optional<StudentEntity> findById(Long id);
    void deleteById (Long id);

}