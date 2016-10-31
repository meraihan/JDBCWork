package com.springapp.dao;

import com.springapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by SayedMahmudRaihan on 10/30/2016.
 */
public class StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public  void saveStudent(Student student){
        String sql = "INSERT INTO student (name, roll, address) VALUES(?, ?, ?)";

        jdbcTemplate.update(sql, student.getName(), student.getRoll(), student.getAddress());
    }
}
