package com.example.demo.student;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence", sequenceName = "student_sequence",allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,generator = "student_sequence"
    )
    private Long id;
    private String first_name;
    private String last_name;
    private String number;
    private String email;

    public Student() {}

    public Student(Long id, String first_name, String last_name, String number, String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.number = number;
        this.email = email;
    }

    public Student(String first_name, String last_name, String number, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.number = number;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", number=" + number +
                ", email='" + email + '\'' +
                '}';
    }
}
