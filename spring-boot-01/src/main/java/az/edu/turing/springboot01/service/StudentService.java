package az.edu.turing.springboot01.service;

import az.edu.turing.springboot01.domain.entity.StudentEntity;
import az.edu.turing.springboot01.model.StudentDto;

import java.util.List;

public interface StudentService {
    void save(StudentDto studentDto);

    List<StudentDto> findAll();

    StudentEntity findById(Long id);

    void deleteById(Long id);
}