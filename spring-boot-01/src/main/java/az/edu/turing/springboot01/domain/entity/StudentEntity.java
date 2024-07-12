package az.edu.turing.springboot01.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class StudentEntity {
    private Long id;
    private String fullname;
    private Integer age;
    private Boolean gender;
    private Double grade;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public StudentEntity(String fullname, Integer age, Boolean gender, Double grade, LocalDateTime created_at,
                         LocalDateTime updated_at) {
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}