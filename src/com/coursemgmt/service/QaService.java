package com.coursemgmt.service;

import java.util.List;

import com.coursemgmt.model.Qa;

public interface QaService {

	void addQa(String sid, String tid, String ask, String answer);

	List<Qa> getAllQas();

	List<Qa> getQaBySid(String sid);

	List<Qa> getQaByTid(String tid);

	void updateQaById(int qaid, String sid, String tid, String ask,
			String answer);

	void delQaById(int qaid);

}
