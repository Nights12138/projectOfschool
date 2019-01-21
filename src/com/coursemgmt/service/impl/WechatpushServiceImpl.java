package com.coursemgmt.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coursemgmt.dao.WechatpushDao;
import com.coursemgmt.model.Wechatpush;
import com.coursemgmt.model.Wechatpush;
import com.coursemgmt.service.WechatpushService;
@Service("wechatpushServiceImpl")
public class WechatpushServiceImpl implements WechatpushService{
	@Resource
	private WechatpushDao wechatpushDao;

	@Override
	public void addWechatpush(String pushclass, String pushcontent,
			String pushtime) {
		Wechatpush wechatpush=new Wechatpush();
		wechatpush.setPushclass(pushclass);
		wechatpush.setPushcontent(pushcontent);
		wechatpush.setPushtime(pushtime);
		wechatpush.setCreatetime(new Date());
		wechatpushDao.add(wechatpush);
		
	}

	@Override
	public List<Wechatpush> getAllWechatpushs() {
		String sql="select * from wechatpush";
		return wechatpushDao.ListBySql(sql, new Object[]{}, Wechatpush.class, true);
	}

	@Override
	public List<Wechatpush> getWechatpushById(int pushid) {
		String sql="select * from wechatpush where pushid = ?";
		return wechatpushDao.ListBySql(sql, new Object[]{pushid}, Wechatpush.class, true);
	}

	@Override
	public List<Wechatpush> getWechatpushByClass(String pushclass) {
		String sql="select * from wechatpush where pushclass = ?";
		return wechatpushDao.ListBySql(sql, new Object[]{pushclass}, Wechatpush.class, true);
	}

	@Override
	public void updateWechatpushById(int pushid, String pushclass,
			String pushcontent, String pushtime) {
		String sql="select * from wechatpush where pushclass = ?";
		Wechatpush wechatpush=(Wechatpush) wechatpushDao.ListBySql(sql, new Object[]{pushclass}, Wechatpush.class, true).get(0);
		wechatpush.setPushclass(pushclass);
		wechatpush.setPushcontent(pushcontent);
		wechatpush.setPushtime(pushtime);
		wechatpushDao.update(wechatpush);
	}

	@Override
	public void delWechatpushById(int pushid) {
		String sql="select * from wechatpush where pushid = ?";
		Wechatpush wechatpush=(Wechatpush) wechatpushDao.ListBySql(sql, new Object[]{pushid}, Wechatpush.class, true).get(0);
		wechatpushDao.delete(wechatpush);
		
	}

}
