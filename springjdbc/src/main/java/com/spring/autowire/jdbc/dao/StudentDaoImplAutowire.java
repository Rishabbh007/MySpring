package com.spring.autowire.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.spring.autowire.jdbc.dao.RowMapperImplAutowire;

import com.spring.autowire.jdbc.entities.StudentAutowire;

@Component("studentDaoAutowire")
public class StudentDaoImplAutowire implements StudentDaoAutowire {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(StudentAutowire student) {
		// insert data
		String query = "Insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public int change(StudentAutowire student) {
		// updating data
		String query = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	public int delete(int studentId) {
		// Delete data
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	public StudentAutowire getStudent(int studentId) {
		// Select data 
		String query = "select * from student where id=?";
		
		RowMapper<StudentAutowire> rowMapper = new RowMapperImplAutowire();
		StudentAutowire student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);		
		return student;
	}
	
	public List<StudentAutowire> getAllStudent() {
		// Select all data
		String query = "select * from student ";

		List<StudentAutowire> students = this.jdbcTemplate.query(query, new RowMapperImplAutowire());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
