package az.edu.turing.springboot01.controller;

import az.edu.turing.springboot01.domain.entity.StudentEntity;
import az.edu.turing.springboot01.model.StudentDto;
import az.edu.turing.springboot01.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all")
    public List<StudentDto> getAllStudents() {
        log.info("GET -> /api/v1/students");
        return studentService.findAll();
    }
    @GetMapping("/{id}")
    public StudentEntity getById (@PathVariable Long id){
        log.info("GET -> /api/v1/students", id);
        return studentService.findById(id);
    }
    @PostMapping
    public void createStudent (@RequestBody StudentDto studentDto){
        studentService.save(studentDto);
    }
    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable Long id){
        studentService.deleteById(id);
    }
}