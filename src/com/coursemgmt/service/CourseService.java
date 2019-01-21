package com.coursemgmt.service;

import java.util.List;

import com.coursemgmt.model.Course;

public interface CourseService {

	void addCourse(String coursename, String syllabus, String courseware);

	List<Course> getCoursesList();

	List<Course> getCourseByName(String coursename);

	void updateCourseByName(String coursename, String syllabus, String courseware);

	void delCourseByName(String coursename);

}
