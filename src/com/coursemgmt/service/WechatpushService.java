package com.coursemgmt.service;

import java.util.List;

import com.coursemgmt.model.Wechatpush;

public interface WechatpushService {

	void addWechatpush(String pushclass, String pushcontent, String pushtime);

	List<Wechatpush> getAllWechatpushs();

	List<Wechatpush> getWechatpushById(int pushid);

	List<Wechatpush> getWechatpushByClass(String pushclass);

	void updateWechatpushById(int pushid, String pushclass, String pushcontent,
			String pushtime);

	void delWechatpushById(int pushid);

}
