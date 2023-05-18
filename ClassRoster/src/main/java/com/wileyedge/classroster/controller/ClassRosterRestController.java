package com.wileyedge.classroster.controller;

import com.wileyedge.classroster.dao.ClassRosterPersistenceException;
import com.wileyedge.classroster.dto.Student;
import com.wileyedge.classroster.service.ClassRosterDataValidationException;
import com.wileyedge.classroster.service.ClassRosterDuplicateIdException;
import com.wileyedge.classroster.service.ClassRosterServiceLayerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClassRosterRestController {

    @Autowired
    ClassRosterServiceLayerImpl service;

    @GetMapping("/hello")
    public String helloWorld() {
        return "<html><h1>Hello World</h1></html>";
    }

    @GetMapping("/view")
    public Student viewStudent() throws ClassRosterPersistenceException {
        return service.getStudent("1");
    }

    @PostMapping("/create")
    public void createStudent(Student student) throws ClassRosterDataValidationException, ClassRosterPersistenceException, ClassRosterDuplicateIdException {
        service.createStudent(student);
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "<html><h1>Later dude</h1></html>";
    }
}
