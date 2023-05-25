package com.wileyedge.classroster.dao;

import com.wileyedge.classroster.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.List;

@Repository
@Profile("Application")
public class ClassRosterDaoDBImpl implements ClassRosterDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException {

        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {
           PreparedStatement statement = conn.prepareStatement(
                   "insert into student (firstname, lastname, cohort)" +
                   "values (?, ?, ?)",
                   Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setString(3, student.getCohort());

           return statement;

        }, keyHolder);

        student.setStudentId(keyHolder.getKey().toString());


        return student;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        List<Student> students = jdbcTemplate.query("select * from student", (resultSet, i) -> {
            String id = resultSet.getString("studentId");
            Student student = new Student(id);
            student.setFirstName(resultSet.getString("firstname"));
            student.setLastName(resultSet.getString("lastname"));
            student.setCohort(resultSet.getString("cohort"));

            return student;
        });

        return students;
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
