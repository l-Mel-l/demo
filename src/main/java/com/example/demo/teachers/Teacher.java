package com.example.demo.teachers;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher_sequence", sequenceName = "teacher_sequence", allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE, generator = "teacher_sequence"
    )
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String number;
    private String email;

    @Column(name = "ed_qual")
    private String educationQualification;

    @Column(name = "teach_exp")
    private int teachingExperience;
}