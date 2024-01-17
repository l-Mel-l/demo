package com.example.demo.lesson;

import com.example.demo.group.GroupRepository;
import com.example.demo.group.Groups;
import com.example.demo.teachers.Teacher;
import com.example.demo.teachers.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LessonConfig {

    @Bean
    CommandLineRunner commandLineRunnerForLesson4(
            LessonRepository lessonRepository, TeacherRepository teacherRepository, GroupRepository groupRepository) {
        return args -> {
            List<Teacher> teachers = teacherRepository.findAll();
            List<Groups> groups = groupRepository.findAll();

            if (!teachers.isEmpty() && !groups.isEmpty()) {
                Lesson lesson1 = new Lesson(
                        groups.get(0).getId(),
                        "Понедельник",
                        "Математика",
                        1,
                        215L,
                        teachers.get(0).getId()
                );
                Lesson lesson2 = new Lesson(
                        groups.get(1).getId(),
                        "Понедельник",
                        "РМП",
                        2,
                        312L,
                        teachers.get(1).getId()
                );
                lesson1.setTeacher(teachers.get(0));
                lesson2.setTeacher(teachers.get(1));

                lessonRepository.saveAll(List.of(lesson1, lesson2));
            }
        };
    }
}