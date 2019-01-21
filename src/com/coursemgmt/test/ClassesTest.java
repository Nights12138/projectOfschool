package com.coursemgmt.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coursemgmt.service.ClassesService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class ClassesTest {
	@Resource
	private ClassesService classesService;
	
	@Test
	public void test01(){
		System.out.println(classesService.getAllClasses());
	}

	@Test
	public void test02(){
		System.out.println(classesService.getClassesById(1));
	}

}
