package com.wileyedge.classroster.service;

import com.wileyedge.classroster.dao.ClassRosterDao;
import com.wileyedge.classroster.dao.ClassRosterPersistenceException;
import com.wileyedge.classroster.dto.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Labels as repository type component
@Profile("Test")
public class ClassRosterDaoFileStubImpl implements ClassRosterDao {

    public Student onlyStudent;

    public ClassRosterDaoFileStubImpl() {
        onlyStudent = new Student("0001");
        onlyStudent.setFirstName("Ada");
        onlyStudent.setLastName("Lovelace");
        onlyStudent.setCohort("Java-May-1845");
    }

    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException {
        return null;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        return null;
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        return null;
    }
}
