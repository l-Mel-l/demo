package com.example.demo.teachers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TeacherConfig {
    @Bean
    CommandLineRunner commandLineRunner(TeacherRepository repository) {
        return args -> {
            Teacher teacher1 = new Teacher(
                    "Иван",
                    "Петров",
                    "123456789",
                    "ivan@teacher.com",
                    "bakalavr",
                    5);
            Teacher teacher2 = new Teacher(
                    "Марина",
                    "Сидорова",
                    "987654321",
                    "marina@teacher.com",
                    "magistr",
                    7);
            repository.saveAll(List.of(teacher1, teacher2));
        };
    }
}
