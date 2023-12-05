package com.spring.autowire.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.autowire.jdbc.entities.StudentAutowire;
import com.spring.jdbc.entities.Student;

public class RowMapperImplAutowire implements RowMapper<StudentAutowire> {

	public StudentAutowire mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		StudentAutowire student = new StudentAutowire(); 
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
