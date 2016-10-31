package com.springapp.dao;

import com.springapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    public List<Student> getAllStudent(){
        String sql = "SELECT * FROM student";

        return jdbcTemplate.query(sql, new RowMapper<Student>(){

            @Override
            public Student mapRow(ResultSet resultSet, int row) throws SQLException {

                Student std = new Student();

                std.setId(resultSet.getInt("id"));
                std.setName(resultSet.getString("name"));
                std.setRoll(resultSet.getString("roll"));
                std.setAddress(resultSet.getString("address"));

                return  std;
            }
        });
    }
    public void delete(int id) {
        String sql = "DELETE FROM student WHERE id = "+id;

        jdbcTemplate.update(sql);
    }
}
