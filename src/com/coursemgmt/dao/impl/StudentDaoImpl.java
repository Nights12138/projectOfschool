package com.coursemgmt.dao.impl;

import org.springframework.stereotype.Repository;

import com.coursemgmt.dao.StudentDao;
import com.coursemgmt.model.Student;

@Repository("studentDaoImpl")
@SuppressWarnings("unchecked")
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao{

}
