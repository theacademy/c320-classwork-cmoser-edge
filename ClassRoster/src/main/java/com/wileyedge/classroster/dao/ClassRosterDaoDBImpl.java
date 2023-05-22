package com.wileyedge.classroster.dao;

import com.wileyedge.classroster.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Profile("Application")
public class ClassRosterDaoDBImpl implements ClassRosterDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException {
        // TODO: insert into table something
        return null;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        // TODO: select * from table
        // TODO: Look into lambdas
        List<Student> students = jdbcTemplate.query("select * from student", new StudentMapper());
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

    private static final class StudentMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            String id = resultSet.getString("studentId");
            Student student = new Student(id);
            student.setFirstName(resultSet.getString("firstname"));
            student.setLastName(resultSet.getString("lastname"));
            student.setCohort(resultSet.getString("cohort"));

            return student;

        }
    }

}
