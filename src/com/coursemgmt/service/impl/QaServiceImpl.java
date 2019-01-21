package com.coursemgmt.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coursemgmt.dao.QaDao;
import com.coursemgmt.model.Qa;
import com.coursemgmt.service.QaService;
@Service("qaServiceImpl")
public class QaServiceImpl implements QaService {
	@Resource
	private QaDao qaDao;

	@Override
	public void addQa(String sid, String tid, String ask, String answer) {
		Qa qa=new Qa();
		qa.setSid(sid);
		qa.setTid(tid);
		qa.setAsk(ask);
		qa.setAnswer(answer);
		qa.setCreatetime(new Date());
		qaDao.add(qa);
		
	}

	@Override
	public List<Qa> getAllQas() {
		String sql="select * from qa";
		return qaDao.ListBySql(sql, new Object[]{}, Qa.class, true);
	}

	@Override
	public List<Qa> getQaBySid(String sid) {
		String sql="select * from qa where sid = ?";
		return qaDao.ListBySql(sql, new Object[]{sid}, Qa.class, true);
	}

	@Override
	public List<Qa> getQaByTid(String tid) {
		String sql="select * from qa where tid = ?";
		return qaDao.ListBySql(sql, new Object[]{tid}, Qa.class, true);
	}

	@Override
	public void updateQaById(int qaid, String sid, String tid, String ask,
			String answer) {
		String sql="select * from qa where qaid = ?";
		Qa qa=(Qa) qaDao.ListBySql(sql, new Object[]{qaid}, Qa.class, true).get(0);
		qa.setSid(sid);
		qa.setTid(tid);
		qa.setAsk(ask);
		qa.setAnswer(answer);
		qaDao.update(qa);
		
	}

	@Override
	public void delQaById(int qaid) {
		String sql="select * from qa where qaid = ?";
		Qa qa=(Qa) qaDao.ListBySql(sql, new Object[]{qaid}, Qa.class, true).get(0);
		qaDao.delete(qa);
		
	}

}
