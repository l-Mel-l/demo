package com.example.demo.grade;

import com.example.demo.student.Student;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
public class Grade {
    @Id
    @SequenceGenerator(
            name = "grade_sequence", sequenceName = "grade_sequence", allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE, generator = "grade_sequence"
    )
    private Long id;

    private int grade;
    private String subject;
    private Date date;

    @Column(name = "id_student")
    private Long studentId;

    public Grade() {}

    public Grade(Long id, int grade, String subject, Date date, Long studentId) {
        this.id = id;
        this.grade = grade;
        this.subject = subject;
        this.date = date;
        this.studentId = studentId;
    }

    public Grade(int grade, String subject, Date date, Long studentId) {
        this.grade = grade;
        this.subject = subject;
        this.date = date;
        this.studentId = studentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", grade=" + grade +
                ", subject='" + subject + '\'' +
                ", date=" + date +
                ", studentId=" + studentId +
                '}';
    }

    @ManyToOne
    @JoinColumn(name = "id_student", referencedColumnName = "id", insertable = false, updatable = false)
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
