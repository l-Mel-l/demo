package com.example.demo.grade; // Assuming you have a "grade" package

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class GradeConfig {

    @Bean
    CommandLineRunner commandLineRunnerForGrade5(GradeRepository gradeRepository, StudentRepository studentRepository) {
        return args -> {
            List<Student> students = studentRepository.findAll();

            Grade grade1 = new Grade(
                    null,
                    2,
                    "Математика",
                    null,
                    students.get(0).getId()
            );

            Grade grade2 = new Grade(
                    null,
                    5,
                    "РМП",
                    null,
                    students.get(1).getId()
            );

            gradeRepository.saveAll(List.of(grade1, grade2));
        };
    }
}
