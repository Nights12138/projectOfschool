package com.coursemgmt.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coursemgmt.dao.PushClickRecDao;
import com.coursemgmt.model.PushClickRec;
import com.coursemgmt.model.PushClickRec;
import com.coursemgmt.service.PushClickRecService;
@Service("pushClickRecServiceImpl")
public class PushClickRecServiceImpl implements PushClickRecService{
	@Resource
	private PushClickRecDao pushClickRecDao;

	@Override
	public void addPushClickRec(String pushid, String sid) {
		PushClickRec pushClickRec=new PushClickRec();
		pushClickRec.setPushid(pushid);
		pushClickRec.setSid(sid);
		pushClickRec.setCreatetime(new Date());
		pushClickRecDao.add(pushClickRec);
		
	}

	@Override
	public List<PushClickRec> getAllPushClickRec() {
		String sql="select * from pushclickrec";
		return pushClickRecDao.ListBySql(sql, new Object[]{}, PushClickRec.class, true);
	}

	@Override
	public List<PushClickRec> getPushClickRecById(int pcrecid) {
		String sql="select * from pushclickrec where pcrecid = ?";
		return pushClickRecDao.ListBySql(sql, new Object[]{pcrecid}, PushClickRec.class, true);
	}

	@Override
	public List<PushClickRec> getPushClickRecByPushid(String pushid) {
		String sql="select * from pushclickrec where pushid = ?";
		return pushClickRecDao.ListBySql(sql, new Object[]{pushid}, PushClickRec.class, true);
	}

	@Override
	public List<PushClickRec> getPushClickRecByPushId(String sid) {
		String sql="select * from pushclickrec where sid = ?";
		return pushClickRecDao.ListBySql(sql, new Object[]{sid}, PushClickRec.class, true);
	}

	@Override
	public void updatePushClickRecById(int pcrecid, String pushid, String sid) {
		String sql="select * from pushclickrec where pcrecid = ?";
		PushClickRec pushClickRec=(PushClickRec) pushClickRecDao.ListBySql(sql, new Object[]{pcrecid}, PushClickRec.class, true).get(0);
		pushClickRec.setPushid(pushid);
		pushClickRec.setSid(sid);
		pushClickRecDao.update(pushClickRec);
		
	}

	@Override
	public void delPushClickRecById(int pcrecid) {
		String sql="select * from pushclickrec where pcrecid = ?";
		PushClickRec pushClickRec=(PushClickRec) pushClickRecDao.ListBySql(sql, new Object[]{pcrecid}, PushClickRec.class, true).get(0);
		pushClickRecDao.delete(pushClickRec);
		
	}

}
