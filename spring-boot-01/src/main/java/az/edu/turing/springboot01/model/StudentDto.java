package az.edu.turing.springboot01.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class StudentDto {
    private String fullname;
    private Integer age;
    private Boolean gender;
    private Double grade;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
