package com.example.demo.group;

import jakarta.persistence.*;

@Entity
@Table
public class Group {
    @Id
    @SequenceGenerator(
            name = "group_sequence", sequenceName = "group_sequence", allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE, generator = "group_sequence"
    )
    private Long id;
    @Column(name = "id_teacher")
    private Long teacherId;
    private String title;
    private String course;

    public Group() {}

    public Group(Long id, Long teacherId, String title, String course) {
        this.id = id;
        this.teacherId = teacherId;
        this.title = title;
        this.course = course;
    }

    public Group(Long teacherId, String title, String course) {
        this.teacherId = teacherId;
        this.title = title;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", teacherId=" + teacherId +
                ", title='" + title + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
