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


    @Override
    public String toString() {
        return "{id=%d, fullname='%s', age=%d, gender=%s, grade=%s, created_at=%s, updated_at=%s}"
                .formatted(id, fullname, age, gender, grade, created_at, updated_at);
    }
}

