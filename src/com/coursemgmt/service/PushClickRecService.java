package com.coursemgmt.service;

import java.util.List;

import com.coursemgmt.model.PushClickRec;

public interface PushClickRecService {

	void addPushClickRec(String pushid, String sid);

	List<PushClickRec> getAllPushClickRec();

	List<PushClickRec> getPushClickRecById(int pcrecid);

	List<PushClickRec> getPushClickRecByPushid(String pushid);

	List<PushClickRec> getPushClickRecByPushId(String sid);

	void updatePushClickRecById(int pcrecid, String pushid, String sid);

	void delPushClickRecById(int pcrecid);

}
