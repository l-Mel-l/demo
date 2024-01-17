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
            // Проверяем, есть ли учителя в базе данных
            List<Teacher> teachers = teacherRepository.findAll();

            if (!teachers.isEmpty()) {

            Groups group1 = new Groups(
                    teachers.get(0).getId(),
                    "Группа 1",
                    "Курс 1"
            );
            Groups group2 = new Groups(
                    teachers.get(1).getId(),
                    "Группа 2",
                    "Курс 2"
            );
            group1.setTeacher(teachers.get(0));
            group2.setTeacher(teachers.get(1));


            groupRepository.saveAll(List.of(group1, group2));
            }
        };
    }
}
