package com.coursemgmt.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coursemgmt.dao.ClassesDao;
import com.coursemgmt.model.Classes;
import com.coursemgmt.service.ClassesService;

@Service("classesServiceImpl")
public class ClassesServiceImpl implements ClassesService{
	@Resource
	private ClassesDao classesDao;

	@Override
	public void addClasses(int classid, String classroom, String tid,
			String classtime, String location, String content, String homework) {
		Classes classes=new Classes();
		classes.setClassid(classid);
		classes.setClassroom(classroom);
		classes.setTid(tid);
		classes.setClasstime(classtime);
		classes.setLocation(location);
		classes.setContent(content);
		classes.setHomework(homework);
		classes.setCreatetime(new Date());
		classesDao.add(classes);
	}

	@Override
	public List<Classes> getAllClasses() {
		String sql="select * from classes";
		return classesDao.ListBySql(sql, new Object[]{}, Classes.class, true);
	}

	@Override
	public List<Classes> getClassesById(int classid) {
		String sql="select * from classes where classid = ?";
		return classesDao.ListBySql(sql, new Object[]{classid}, Classes.class, true);
	}

	@Override
	public void updateClassesById(int classid, String classroom, String tid,
			String classtime, String location, String content, String homework) {
		String sql="select * from classes where classid = ?";
		Classes classes=(Classes) classesDao.ListBySql(sql, new Object[]{classid}, Classes.class, true).get(0);
		classes.setClassroom(classroom);
		classes.setTid(tid);
		classes.setClasstime(classtime);
		classes.setLocation(location);
		classes.setContent(content);
		classes.setHomework(homework);
		classesDao.update(classes);
		
	}

	@Override
	public void delClassesById(int classid) {
		String sql="select * from classes where classid = ?";
		Classes classes=(Classes) classesDao.ListBySql(sql, new Object[]{classid}, Classes.class, true).get(0);
		classesDao.delete(classes);
	}

	

}
