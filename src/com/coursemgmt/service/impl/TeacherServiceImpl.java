package com.coursemgmt.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coursemgmt.dao.TeacherDao;
import com.coursemgmt.model.Teacher;
import com.coursemgmt.service.TeacherService;
import com.coursemgmt.util.SHA;
@Service("teacherServiceImpl")
public class TeacherServiceImpl implements TeacherService{
	@Resource
	private TeacherDao teacherDao;

	@Override
	public List<Teacher> checkTeacher(String name, String passwd) throws Exception {
		String passwdSHA = SHA.encryptSHA(passwd);
		String sql="select * from teacher where name = ? and passwd= ?";
		/*System.out.println(teacherDao.ListBySql(sql, new Object[]{name,passwdSHA}, Teacher.class, true));*/
		return teacherDao.ListBySql(sql, new Object[]{name,passwdSHA}, Teacher.class, true);
	}

	@Override
	public void addTeacher(String id, String name, String passwd) {
		Teacher teacher=new Teacher();
		String passwdSHA;
		teacher.setId(id);
		try {
			passwdSHA = SHA.encryptSHA(passwd);
			teacher.setPasswd(passwdSHA);
		} catch (Exception e) {
			e.printStackTrace();
		}
		teacher.setName(name);
		teacher.setCreatetime(new Date());
		teacherDao.add(teacher);
	}

	@Override
	public List<Teacher> getTeacherList() {
		String sql="select * from teacher";
		return teacherDao.ListBySql(sql, new Object[]{}, Teacher.class, true);
	}

	@Override
	public List<Teacher> getTeacherById(String id) {
		String sql="select * from teacher where id=?";
		return teacherDao.ListBySql(sql, new Object[]{id}, Teacher.class, true);
	}

	@Override
	public List<Teacher> getTeacherByName(String name) {
		String sql="select * from teacher where name=?";
		return teacherDao.ListBySql(sql, new Object[]{name}, Teacher.class, true);
	}

	@Override
	public void updateTeacherById(String id,String name, String passwd) {
		String sql="select * from teacher where id = ?";
		String passwdSHA;
		Teacher teacher=(Teacher) teacherDao.ListBySql(sql, new Object[]{id}, Teacher.class, true).get(0);
		try {
			passwdSHA = SHA.encryptSHA(passwd);
			teacher.setPasswd(passwdSHA);
		} catch (Exception e) {
			e.printStackTrace();
		}
		teacher.setName(name);
		/*teacher.setPasswd(passwd);*/
		teacherDao.update(teacher);
	}

	@Override
	public void delTeacherById(String id) {
		String sql="select * from teacher where id = ?";
		Teacher teacher=(Teacher) teacherDao.ListBySql(sql, new Object[]{id}, Teacher.class, true).get(0);
		teacherDao.delete(teacher);
		
	}

}
