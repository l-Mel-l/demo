package com.example.demo.group;

import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.teachers.Teacher;

import java.util.List;

@Service
public class GroupService {
    private final GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<Groups> getGroups() {
        List<Groups> groups = groupRepository.findAll();
        for (Groups group : groups) {
            Teacher teacher = group.getTeacher();
        }
        return groups;
    }
    public void addGroup(Groups group) {
        groupRepository.save(group);
    }

}
