package com.example.demo.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/lesson")
public class LessonController {
    private final LessonService lessonService;

    @Autowired
    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping
    public List<Lesson> getLessons() {
        return lessonService.getLessons();
    }

    @PostMapping
    public void addLesson(@RequestBody Lesson lesson) {
        lessonService.addLesson(lesson);
    }
    @DeleteMapping(path = "{lessonId}")
    public void deleteLesson(@PathVariable("lessonId") Long lessonId) {
        lessonService.deleteLesson(lessonId);
    }
}
