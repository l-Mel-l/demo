package com.example.demo.teachers;

import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }
    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
    public void deleteTeacher(Long teacherId) {
        teacherRepository.deleteById(teacherId);
    }
}
