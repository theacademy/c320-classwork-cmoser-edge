package com.wileyedge.classroster.service;

import com.wileyedge.classroster.dao.ClassRosterPersistenceException;
import com.wileyedge.classroster.dto.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.fail;

public class ClassRosterServiceLayerImplTest {

    private ClassRosterServiceLayer service; // = new ClassRosterServiceLayerImpl(new ClassRosterDaoFileStubImpl(), new ClassRosterAuditDaoStubImpl());

    public ClassRosterServiceLayerImplTest() {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.getEnvironment().setActiveProfiles("Test", "Test2");
        appContext.scan("com.wileyedge.classroster");
        appContext.refresh();

        Map<String, Object> beans = appContext.getBeansOfType(Object.class);

        service = appContext.getBean(ClassRosterServiceLayerImpl.class);

    }

    @Test
    void testCreateValidStudent() throws ClassRosterDataValidationException, ClassRosterPersistenceException, ClassRosterDuplicateIdException {

        // Do stuffs
        Student student = new Student("0002");
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
