package com.example.demo.lesson;

import com.example.demo.group.Groups;
import com.example.demo.teachers.Teacher;
import jakarta.persistence.*;

@Entity
@Table
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

    public Lesson() {}

    public Lesson(Long id, Long groupId, String dayOfWeek, String objectName, int lessonNumber, Long classroomId, Long teacherId) {
        this.id = id;
        this.groupId = groupId;
        this.dayOfWeek = dayOfWeek;
        this.objectName = objectName;
        this.lessonNumber = lessonNumber;
        this.classroomId = classroomId;
        this.teacherId = teacherId;
    }

    public Lesson(Long groupId, String dayOfWeek, String objectName, int lessonNumber, Long classroomId, Long teacherId) {
        this.groupId = groupId;
        this.dayOfWeek = dayOfWeek;
        this.objectName = objectName;
        this.lessonNumber = lessonNumber;
        this.classroomId = classroomId;
        this.teacherId = teacherId;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", objectName='" + objectName + '\'' +
                ", lessonNumber=" + lessonNumber +
                ", classroomId=" + classroomId +
                ", teacherId=" + teacherId +
                '}';
    }

    @ManyToOne
    @JoinColumn(name = "id_teacher", referencedColumnName = "id", insertable = false, updatable = false)
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    @ManyToOne
    @JoinColumn(name = "id_group", referencedColumnName = "id",insertable = false, updatable = false)
    private Groups groups;

    public Groups getGroups() {
        return groups;
    }
    public void setGroups(Groups groups) {
        this.groups = groups;
    }
}
