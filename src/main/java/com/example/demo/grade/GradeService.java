package com.example.demo.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.student.Student;

import java.util.List;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;

    @Autowired
    public GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    public List<Grade> getGrades() {
        List<Grade> grades = gradeRepository.findAll();
        for (Grade grade : grades) {
            Student student = grade.getStudent();
        }
        return grades;
    }

    public void addGrade(Grade grade) {
        gradeRepository.save(grade);
    }
}
