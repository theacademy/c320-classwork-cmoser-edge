package com.wileyedge.classroster.service;

import com.wileyedge.classroster.dao.ClassRosterPersistenceException;
import com.wileyedge.classroster.dto.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class ClassRosterServiceLayerImplTest {

    @Autowired
    private ClassRosterServiceLayer service; // = new ClassRosterServiceLayerImpl(new ClassRosterDaoFileStubImpl(), new ClassRosterAuditDaoStubImpl());

    @Test
    void testCreateValidStudent() throws ClassRosterDataValidationException, ClassRosterPersistenceException, ClassRosterDuplicateIdException {

        // Do stuffs
        Student student = new Student("2");
        student.setFirstName("Charles");
        student.setLastName("Babbage");
        student.setCohort(".NET-May-1985");
        // act
        try {
            service.createStudent(student);
        } catch (ClassRosterDuplicateIdException
                 | ClassRosterDataValidationException
                 | ClassRosterPersistenceException e) {
            // assert
            fail("Student was valid. No exception should have been thrown.");
        }
    }
}
