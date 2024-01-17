package com.example.demo.group;

import com.example.demo.teachers.Teacher;
import com.example.demo.teachers.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class GroupConfig {
    @Bean
    CommandLineRunner commandLineRunner3(GroupRepository groupRepository, TeacherRepository teacherRepository) {
        return args -> {
            // Предположим, что у вас есть уже сохраненные учителя
            List<Teacher> teachers = teacherRepository.findAll();

            Group group1 = new Group(
                    teachers.get(0).getId(),
                    "Группа 1",
                    "Курс 1"
            );
            Group group2 = new Group(
                    teachers.get(1).getId(),
                    "Группа 2",
                    "Курс 2"
            );

            groupRepository.saveAll(List.of(group1, group2));
        };
    }
}
