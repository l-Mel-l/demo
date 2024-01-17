package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Dudorov = new Student(
                    "Костя",
                    "Дудоров",
                    "85637165827",
                    "ddv@yandex.ru");
            Student Datchenko = new Student(
                    "Влад",
                    "Датченко",
                    "8563743225",
                    "ddch@yandex.ru");
            repository.saveAll(List.of(Dudorov, Datchenko));
        };
    }
}
