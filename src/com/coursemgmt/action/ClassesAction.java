package com.coursemgmt.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coursemgmt.model.Classes;
import com.coursemgmt.service.ClassesService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("classesAction")
@Scope("prototype")
public class ClassesAction extends ActionSupport{
	@Resource
	private ClassesService classesService;
	
	private Map<String,Object> dataMap;
	private JSONObject json;
	
	//接受参数
	private int classid;
	private String classroom;
	private String tid;
	private String classtime;
	private String location;
	private String content;
	private String homework;
	private Date createtime;
	
	//返回结果集
	private List<Classes> classesList;
	
	public String addClasses(){
		classesService.addClasses(classid,classroom,tid,classtime,location,content,homework);
		return SUCCESS;
	}
	//get
	public String getAllClasses(){
		classesList=classesService.getAllClasses();
		dataMap=new HashMap<String, Object>();
		dataMap.put("classesList",classesList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getClassesById(){
		classesList=classesService.getClassesById(classid);
		dataMap=new HashMap<String, Object>();
		dataMap.put("classesList",classesList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String updateClassesById(){
		classesService.updateClassesById(classid,classroom,tid,classtime,location,content,homework);
		return SUCCESS;
	}
	public String delClassesById(){
		classesService.delClassesById(classid);
		return SUCCESS;
	}
	
	public ClassesService getClassesService() {
		return classesService;
	}
	public void setClassesService(ClassesService classesService) {
		this.classesService = classesService;
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
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getClasstime() {
		return classtime;
	}
	public void setClasstime(String classtime) {
		this.classtime = classtime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHomework() {
		return homework;
	}
	public void setHomework(String homework) {
		this.homework = homework;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public List<Classes> getClassesList() {
		return classesList;
	}
	public void setClassesList(List<Classes> classesList) {
		this.classesList = classesList;
	}
	
	
	
}
