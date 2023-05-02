package com.wileyedge.classroster.dao;

import com.wileyedge.classroster.dto.Student;

import java.util.List;

public class ClassRosterDaoDBImpl implements ClassRosterDao {
    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException {
        // TODO: insert into table something
        return null;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        // TODO: select * from table
        return null;
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        // TODO: select * from table where ?
        return null;
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        // TODO: delete from table where ?
        return null;
    }
}
