package com.coursemgmt.dao.impl;

import org.springframework.stereotype.Repository;

import com.coursemgmt.dao.ClassesDao;
import com.coursemgmt.model.Classes;

@Repository("classesDaoImpl")
@SuppressWarnings("unchecked")

public class ClassesDaoImpl extends BaseDaoImpl<Classes> implements ClassesDao{

}
