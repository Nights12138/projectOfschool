package com.coursemgmt.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coursemgmt.model.Course;
import com.coursemgmt.model.Teacher;
import com.coursemgmt.service.CourseService;
import com.coursemgmt.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("courseAction")
@Scope("prototype")
public class CourseAction extends ActionSupport{
	@Resource
	private CourseService courseService;
	
	private Map<String,Object> dataMap;
	private JSONObject json;
	
	//接受参数
	private String coursename;
	private String syllabus;
	private String courseware;
	private Date createtime;
	
	//返回结果集
	private List<Course> courseList;
	
	
	public String addCourse(){
		courseService.addCourse(coursename,syllabus,courseware);
		return SUCCESS;
	}
	
	//get
	public String getCoursesList(){
		courseList=courseService.getCoursesList();
		dataMap=new HashMap<String, Object>();
		dataMap.put("courseList",courseList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getCourseByName(){
		courseList=courseService.getCourseByName(coursename);
		dataMap=new HashMap<String, Object>();
		dataMap.put("courseList",courseList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String updateCourseByName(){
		courseService.updateCourseByName(coursename,syllabus,courseware);
		return SUCCESS;
	}
	public String delCourseByName(){
		courseService.delCourseByName(coursename);
		return SUCCESS;
	}
	
	

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public JSONObject getJson() {
		return json;
	}

	public void setJson(JSONObject json) {
		this.json = json;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}

	public String getCourseware() {
		return courseware;
	}

	public void setCourseware(String courseware) {
		this.courseware = courseware;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
}
