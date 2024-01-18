package com.example.demo.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/grade")
public class GradeController {
    private final GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping
    public List<Grade> getGrades() {
        return gradeService.getGrades();
    }

    @PostMapping
    public void addGrade(@RequestBody Grade grade) {
        gradeService.addGrade(grade);
    }
    @DeleteMapping(path = "{gradeId}")
    public void deleteGrade(@PathVariable("gradeId") Long gradeId) {
        gradeService.deleteGrade(gradeId);
    }
}
