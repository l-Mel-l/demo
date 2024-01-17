package com.example.demo.group;

import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/group")
public class GroupController {
    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public List<Groups> getGroups() {
        return groupService.getGroups();
    }
    @PostMapping
    public void addStudent(@RequestBody Groups group) {
        groupService.addGroup(group);
    }
}
