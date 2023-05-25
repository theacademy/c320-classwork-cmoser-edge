package com.wileyedge.classroster.controller;

import com.wileyedge.classroster.dao.ClassRosterPersistenceException;
import com.wileyedge.classroster.dto.Student;
import com.wileyedge.classroster.service.ClassRosterDataValidationException;
import com.wileyedge.classroster.service.ClassRosterDuplicateIdException;
import com.wileyedge.classroster.service.ClassRosterServiceLayerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Request Parameters
@RestController
@RequestMapping("/api")
public class ClassRosterRestController {

    @Autowired
    ClassRosterServiceLayerImpl service;

    @GetMapping()
    public String docs() {
        return "<html><h1>Documentation</h1></html>";
    }

    @GetMapping("/view/{studentId}")
    public Student viewStudent(@PathVariable String studentId, @RequestParam String k) throws ClassRosterPersistenceException {
        return service.getStudent(studentId);
    }

    @GetMapping("/students")
    public List<Student> viewAllStudents() throws ClassRosterPersistenceException {
        return service.getAllStudents();
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) throws ClassRosterDataValidationException, ClassRosterPersistenceException, ClassRosterDuplicateIdException {
        return service.createStudent(student);
    }

}
