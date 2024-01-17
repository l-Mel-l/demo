package com.example.demo.teachers;

import jakarta.persistence.*;

@Entity
@Table
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

    public Teacher() {}

    public Teacher(Long id, String firstName, String lastName, String number, String email, String educationQualification, int teachingExperience) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.email = email;
        this.educationQualification = educationQualification;
        this.teachingExperience = teachingExperience;
    }

    public Teacher(String firstName, String lastName, String number, String email, String educationQualification, int teachingExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.email = email;
        this.educationQualification = educationQualification;
        this.teachingExperience = teachingExperience;
    }

    // Геттеры и сеттеры (если необходимо)

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                ", email='" + email + '\'' +
                ", educationQualification='" + educationQualification + '\'' +
                ", teachingExperience=" + teachingExperience +
                '}';
    }
}
