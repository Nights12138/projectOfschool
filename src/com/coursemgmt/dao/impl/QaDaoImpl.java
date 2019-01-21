package com.coursemgmt.dao.impl;

import org.springframework.stereotype.Repository;

import com.coursemgmt.dao.QaDao;
import com.coursemgmt.model.Qa;
@Repository("qaDaoImpl")
@SuppressWarnings("unchecked")
public class QaDaoImpl extends BaseDaoImpl<Qa> implements QaDao{

}
