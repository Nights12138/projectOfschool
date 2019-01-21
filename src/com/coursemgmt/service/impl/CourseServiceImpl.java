package com.coursemgmt.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coursemgmt.dao.CourseDao;
import com.coursemgmt.model.Course;
import com.coursemgmt.model.Teacher;
import com.coursemgmt.service.CourseService;
@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService{
	@Resource
	private CourseDao courseDao;

	@Override
	public void addCourse(String coursename, String syllabus, String courseware) {
		Course course=new Course();
		course.setCoursename(coursename);
		course.setSyllabus(syllabus);
		course.setCourseware(courseware);
		course.setCreatetime(new Date());
		courseDao.add(course);
		
	}

	@Override
	public List<Course> getCoursesList() {
		String sql="select * from course";
		return courseDao.ListBySql(sql, new Object[]{}, Course.class, true);
	}

	@Override
	public List<Course> getCourseByName(String coursename) {
		String sql="select * from course where coursename = ?";
		return courseDao.ListBySql(sql, new Object[]{coursename}, Course.class, true);
	}

	@Override
	public void updateCourseByName(String coursename, String syllabus, String courseware) {
		String sql="select * from course where coursename = ?";
		Course course=(Course) courseDao.ListBySql(sql, new Object[]{coursename}, Course.class, true).get(0);
		course.setCoursename(coursename);
		course.setSyllabus(syllabus);
		course.setCourseware(courseware);
		courseDao.update(course);
		
	}

	@Override
	public void delCourseByName(String coursename) {
		String sql="select * from course where coursename = ?";
		Course course=(Course) courseDao.ListBySql(sql, new Object[]{coursename}, Course.class, true).get(0);
		courseDao.delete(course);
		
	}

}
