package com.coursemgmt.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coursemgmt.model.Student;
import com.coursemgmt.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("studentAction")
@Scope("prototype")
public class StudentAction extends ActionSupport{
	@Resource
	private StudentService studentService;
	
	private Map<String,Object> dataMap;
	private JSONObject json;
	
	//接受参数
	private String id;
	private String name;
	private String passwd;
	private String classroom;
	private String tid;
	private Date createtime;
	
	//返回结果集
	private List<Student> studentList;
	
	public String addStudent(){
		studentService.addStudent(id,name,passwd,classroom,tid);
		return SUCCESS;
	}
	
	//get
	public String getAllStudents(){
		studentList=studentService.getAllStudents();
		dataMap=new HashMap<String, Object>();
		dataMap.put("studentList",studentList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getStudentById(){
		studentList=studentService.getStudentById(id);
		dataMap=new HashMap<String, Object>();
		dataMap.put("studentList",studentList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getStudentByName(){
		studentList=studentService.getStudentByName(name);
		dataMap=new HashMap<String, Object>();
		dataMap.put("studentList",studentList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getStudentByTid(){
		studentList=studentService.getStudentByTid(tid);
		dataMap=new HashMap<String, Object>();
		dataMap.put("studentList",studentList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String updateStudentById(){
		studentService.updateStudentById(id,name,passwd,classroom,tid);
		return SUCCESS;
	}
	public String delStudentById(){
		studentService.delStudentById(id);
		return SUCCESS;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
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

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	

}
