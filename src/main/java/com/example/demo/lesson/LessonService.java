package com.example.demo.lesson; // Assuming you have a "lesson" package

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.teachers.Teacher;

import java.util.List;

@Service
public class LessonService {
    private final LessonRepository lessonRepository;

    @Autowired
    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public List<Lesson> getLessons() {
        List<Lesson> lessons = lessonRepository.findAll();
        for (Lesson lesson : lessons) {
            Teacher teacher = lesson.getTeacher();
        }
        return lessons;
    }

    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }
}
