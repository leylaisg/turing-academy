package az.edu.turing.springboot01.service.impl;

import az.edu.turing.springboot01.domain.entity.StudentEntity;
import az.edu.turing.springboot01.domain.repository.StudentRepository;
import az.edu.turing.springboot01.model.StudentDto;
import az.edu.turing.springboot01.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;


    @Override
    public void save(StudentDto studentDto) {
        StudentEntity studentEntity = new StudentEntity(studentDto.getFullname(), studentDto.getAge(),
                studentDto.getGender(), studentDto.getGrade(), studentDto.getCreated_at(), studentDto.getUpdated_at());
        studentRepository.save(studentEntity);
    }

    @Override
    public List<StudentDto> findAll() {
        return studentRepository.findAll().stream()
                .map(studentEntity -> new StudentDto(studentEntity.getFullname(), studentEntity.getAge(),
                        studentEntity.getGender(), studentEntity.getGrade(), studentEntity.getCreated_at(),
                        studentEntity.getUpdated_at())).toList();
    }

    @Override
    public StudentEntity findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
