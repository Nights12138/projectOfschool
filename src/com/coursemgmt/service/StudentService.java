package com.coursemgmt.service;

import java.util.List;

import com.coursemgmt.model.Student;

public interface StudentService {

	void addStudent(String id, String name, String passwd, String classroom,
			String tid);

	List<Student> getAllStudents();

	List<Student> getStudentById(String id);

	List<Student> getStudentByName(String name);

	List<Student> getStudentByTid(String tid);

	void updateStudentById(String id, String name, String passwd,
			String classroom, String tid);

	void delStudentById(String id);

}
