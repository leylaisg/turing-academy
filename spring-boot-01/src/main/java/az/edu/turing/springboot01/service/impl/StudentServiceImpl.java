package az.edu.turing.springboot01.service.impl;

import az.edu.turing.springboot01.domain.entity.StudentEntity;
import az.edu.turing.springboot01.domain.repository.StudentRepository;
import az.edu.turing.springboot01.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {

    }
}
