package com.coursemgmt.dao.impl;

import org.springframework.stereotype.Repository;

import com.coursemgmt.dao.CourseDao;
import com.coursemgmt.model.Course;

@Repository("courseDaoImpl")
@SuppressWarnings("unchecked")

public class CourseDaoImpl extends BaseDaoImpl<Course> implements CourseDao{

}
