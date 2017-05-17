package org.com.examples.springmvc.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.com.examples.springmvc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
/**
 * sql语句
 * 
 * */
@Repository
public class studentManager {
	    @Autowired
	    private JdbcTemplate jdbcTemplate;

	    public List<Student> getList(){
	        String sql = "SELECT id,name,sumScore,avgScore,age  FROM STUDENT";
	        return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>(){

	            @Override
	            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {            	
	                Student stu = new Student();
	               // BeanUtils.copyProperties(rs, stu);
	                stu.setId(rs.getInt("id"));
	                stu.setAge(rs.getInt("age"));
	                stu.setName(rs.getString("name"));
	                stu.setSumScore(rs.getString("sumScore"));
	                stu.setAvgScore(rs.getString("avgScore"));
	                return stu;
	            }

	        });
	    }
}
