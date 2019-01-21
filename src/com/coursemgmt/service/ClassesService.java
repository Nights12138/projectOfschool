package com.coursemgmt.service;

import java.util.Date;
import java.util.List;

import com.coursemgmt.model.Classes;

public interface ClassesService {

	void addClasses(int classid, String classroom, String tid, String classtime,
			String location, String content, String homework);

	List<Classes> getAllClasses();

	List<Classes> getClassesById(int classid);

	void updateClassesById(int classid, String classroom, String tid, String classtime, String location, String content, String homework);

	void delClassesById(int classid);

}
