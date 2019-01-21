package com.coursemgmt.dao.impl;

import org.springframework.stereotype.Repository;

import com.coursemgmt.dao.TeacherDao;
import com.coursemgmt.model.Teacher;

@Repository("teacherDaoImpl")
@SuppressWarnings("unchecked")
public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao {
	
}
