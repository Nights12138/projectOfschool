package com.coursemgmt.service;

import java.util.List;

import com.coursemgmt.model.Teacher;

public interface TeacherService {
	List<Teacher> checkTeacher(String name, String passwd) throws Exception;
	List<Teacher> getTeacherList();
	List<Teacher> getTeacherById(String id);
	List<Teacher> getTeacherByName(String name);
	
	void addTeacher (String id,String name,String passwd);
	
	void updateTeacherById(String id, String name, String passwd);
	
	void delTeacherById(String id);

}
