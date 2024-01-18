package com.example.demo.lesson; // Assuming you have a "lesson" package

import com.example.demo.group.Groups;
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
            Groups groups = lesson.getGroups();
        }
        return lessons;
    }

    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }
    public void deleteLesson(Long gradeId) {
        lessonRepository.deleteById(gradeId);
    }
}
