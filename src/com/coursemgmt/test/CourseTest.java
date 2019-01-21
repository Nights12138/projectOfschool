package com.coursemgmt.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coursemgmt.service.CourseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class CourseTest {
	@Resource
	private CourseService courseService;
	
	@Test
	public void test01(){
		System.out.println(courseService.getCoursesList());
	}
	@Test
	public void test02(){
		courseService.addCourse("1","2","3");
	}
}
