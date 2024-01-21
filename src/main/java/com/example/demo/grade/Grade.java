package com.example.demo.grade;

import com.example.demo.student.Student;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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

    @ManyToOne
    @JoinColumn(name = "id_student", referencedColumnName = "id", insertable = false, updatable = false)
    private Student student;
}