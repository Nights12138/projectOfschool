package com.coursemgmt.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coursemgmt.service.CourseService;
import com.coursemgmt.service.QaService;
import com.coursemgmt.service.TeacherService;
import com.coursemgmt.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class TeacherTest {
	@Resource
	private TeacherService teacherService;
	@Resource
	private CourseService courseService;
	@Resource
	private QaService qaService;

	@Test
	public void test01() throws Exception{
		System.out.println(teacherService.checkTeacher("t2", "22"));
	}
	@Test
	public void test02(){
		teacherService.addTeacher("01","t2", "22");
	}
	@Test
	public void test03(){
		 String key = "123";
		 SHA sha = new SHA();
	     try {
			System.out.println(sha.encryptSHA(key));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test04(){
		teacherService.addTeacher("01","t2", "22");
	}
	
	@Test
	public void test05(){
		courseService.getCoursesList();
	}
	@Test
	public void test06(){
		courseService.addCourse("1","2","3");
	}
	@Test
	public void test07(){
		qaService.getAllQas();
	}

}
