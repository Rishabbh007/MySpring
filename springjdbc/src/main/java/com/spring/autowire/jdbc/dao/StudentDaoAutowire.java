package com.spring.autowire.jdbc.dao;

import java.util.List;

import com.spring.autowire.jdbc.entities.StudentAutowire;


public interface StudentDaoAutowire {

	public int insert(StudentAutowire student );
	
	public int change(StudentAutowire student);
	
	public int delete(int studentId);
	
	public StudentAutowire getStudent(int studentId);
	
	public List<StudentAutowire> getAllStudent();
	
}
