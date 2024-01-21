package com.example.demo.lesson;

import com.example.demo.group.Groups;
import com.example.demo.teachers.Teacher;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Lesson {
    @Id
    @SequenceGenerator(
            name = "lesson_sequence", sequenceName = "lesson_sequence", allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE, generator = "lesson_sequence"
    )
    private Long id;

    @Column(name = "id_group")
    private Long groupId;

    @Column(name = "day_of_week")
    private String dayOfWeek;

    @Column(name = "object_name")
    private String objectName;

    @Column(name = "lesson_number")
    private int lessonNumber;

    @Column(name = "id_classroom")
    private Long classroomId;

    @Column(name = "id_teacher")
    private Long teacherId;

    @ManyToOne
    @JoinColumn(name = "id_teacher", referencedColumnName = "id", insertable = false, updatable = false)
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "id_group", referencedColumnName = "id", insertable = false, updatable = false)
    private Groups groups;

}