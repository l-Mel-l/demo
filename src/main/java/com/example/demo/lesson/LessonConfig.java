package com.example.demo.lesson;

import com.example.demo.teachers.Teacher;
import com.example.demo.teachers.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LessonConfig {

    @Bean
    CommandLineRunner commandLineRunnerForLesson(LessonRepository lessonRepository, TeacherRepository teacherRepository) {
        return args -> {
            List<Teacher> teachers = teacherRepository.findAll();

            Lesson lesson1 = new Lesson(
                    null, // id (будет присвоен автоматически)
                    teachers.get(0).getId(), // groupId
                    "Понедельник", // dayOfWeek
                    "Математика", // objectName
                    1, // lessonNumber
                    214L, // classroomId (тип Long)
                    214125L // teacherId (тип Long)
            );
            Lesson lesson2 = new Lesson(
                    null, // id (будет присвоен автоматически)
                    teachers.get(1).getId(), // groupId
                    "Понедельник", // dayOfWeek
                    "РМП", // objectName
                    2, // lessonNumber
                    312L, // classroomId (тип Long)
                    657826L // teacherId (тип Long)
            );
            lesson1.setTeacher(teachers.get(0));
            lesson2.setTeacher(teachers.get(1));

            lessonRepository.saveAll(List.of(lesson1, lesson2));
        };
    }
}
