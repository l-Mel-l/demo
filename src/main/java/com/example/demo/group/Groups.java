package com.example.demo.group;

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
public class Groups {
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

    @ManyToOne
    @JoinColumn(name = "id_teacher", referencedColumnName = "id", insertable = false, updatable = false)
    private Teacher teacher;
}