package az.edu.turing.springboot01.service;

import az.edu.turing.springboot01.domain.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity save(StudentEntity studentEntity);

    List<StudentEntity> findAll();

    StudentEntity findById(Long id);

    void deleteById(Long id);
}