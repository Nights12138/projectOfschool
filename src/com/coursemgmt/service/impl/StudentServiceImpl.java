package com.coursemgmt.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coursemgmt.dao.StudentDao;
import com.coursemgmt.model.Student;
import com.coursemgmt.service.StudentService;
import com.coursemgmt.util.SHA;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService{
	@Resource
	private StudentDao studentDao;

	@Override
	public void addStudent(String id, String name, String passwd,
			String classroom, String tid) {
		Student student=new Student();
//		String passwdSHA;
		try {
			String passwdSHA = SHA.encryptSHA(passwd);
			student.setPasswd(passwdSHA);
		} catch (Exception e) {
			e.printStackTrace();
		}
		student.setId(id);
		student.setName(name);
		student.setClassroom(classroom);
		student.setTid(tid);
		student.setCreatetime(new Date());
		studentDao.add(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
		String sql="select * from student";
		return studentDao.ListBySql(sql, new Object[]{}, Student.class, true);
	}

	@Override
	public List<Student> getStudentById(String id) {
		String sql="select * from student where id=?";
		return studentDao.ListBySql(sql, new Object[]{id}, Student.class, true);
	}

	@Override
	public List<Student> getStudentByName(String name) {
		String sql="select * from student where name=?";
		return studentDao.ListBySql(sql, new Object[]{name}, Student.class, true);
	}

	@Override
	public List<Student> getStudentByTid(String tid) {
		String sql="select * from student where tid=?";
		return studentDao.ListBySql(sql, new Object[]{tid}, Student.class, true);
	}

	@Override
	public void updateStudentById(String id, String name, String passwd,
			String classroom, String tid) {
		String sql="select * from student where id = ?";
//		String passwdSHA;
		Student student=(Student) studentDao.ListBySql(sql, new Object[]{id}, Student.class, true).get(0);
		try {
			String passwdSHA = SHA.encryptSHA(passwd);
			student.setPasswd(passwdSHA);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		student.setId(id);
		student.setName(name);
		student.setClassroom(classroom);
		student.setTid(tid);
		student.setCreatetime(new Date());
		studentDao.update(student);
		
	}

	@Override
	public void delStudentById(String id) {
		String sql="select * from student where id = ?";
		Student student=(Student) studentDao.ListBySql(sql, new Object[]{id}, Student.class, true).get(0);
		studentDao.delete(student);
		
	}

}
