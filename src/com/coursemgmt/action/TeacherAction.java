package com.coursemgmt.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coursemgmt.model.Teacher;
import com.coursemgmt.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("teacherAction")
@Scope("prototype")
public class TeacherAction extends ActionSupport{
	@Resource
	private TeacherService teacherService;
	
	private Map<String,Object> dataMap;
	private JSONObject json;
	
	//接受参数
	private String id;
	private String name;
	private String passwd;
	private Date createtime;
	
	//返回结果集
	private List<Teacher> teacherList;
	
	public String teacherLogin() throws Exception{
		teacherList=teacherService.checkTeacher(name,passwd);
		dataMap=new HashMap<String, Object>();
		dataMap.put("teacherList",teacherList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String signup(){
		teacherService.addTeacher(id,name,passwd);
		return SUCCESS;
	}
	
	//get
	public String getTeachersList(){
		teacherList=teacherService.getTeacherList();
		dataMap=new HashMap<String, Object>();
		dataMap.put("teacherList",teacherList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getTeacherById(){
		teacherList=teacherService.getTeacherById(id);
		dataMap=new HashMap<String, Object>();
		dataMap.put("teacherList",teacherList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getTeacherByName(){
		teacherList=teacherService.getTeacherByName(name);
		dataMap=new HashMap<String, Object>();
		dataMap.put("teacherList",teacherList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String updateTeacherById(){
		teacherService.updateTeacherById(id,name,passwd);
		return SUCCESS;
	}
	public String delTeacherById(){
		teacherService.delTeacherById(id);
		return SUCCESS;
	}
	
	public TeacherService getTeacherService() {
		return teacherService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public List<Teacher> getTeacherList() {
		return teacherList;
	}
	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}
	
	
}
