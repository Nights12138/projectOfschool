package com.coursemgmt.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coursemgmt.model.PushClickRec;
import com.coursemgmt.model.Student;
import com.coursemgmt.service.PushClickRecService;
import com.coursemgmt.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
@Controller("pushClickRecAction")
@Scope("prototype")
public class PushClickRecAction  extends ActionSupport{
	@Resource
	private PushClickRecService pushClickRecService;
	
	private Map<String,Object> dataMap;
	private JSONObject json;
	
	//接受参数
	private int pcrecid;
	private String pushid;
	private String sid;
	private Date createtime;
	
	//返回结果集
	private List<PushClickRec> pushClickRecList;
	//add
	public String addPushClickRec(){
		pushClickRecService.addPushClickRec(pushid,sid);
		return SUCCESS;
	}
	//get
	public String getAllPushClickRec(){
		pushClickRecList=pushClickRecService.getAllPushClickRec();
		dataMap=new HashMap<String, Object>();
		dataMap.put("pushClickRecList",pushClickRecList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getPushClickRecById(){
		pushClickRecList=pushClickRecService.getPushClickRecById(pcrecid);
		dataMap=new HashMap<String, Object>();
		dataMap.put("pushClickRecList",pushClickRecList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getPushClickRecByPushid(){
		pushClickRecList=pushClickRecService.getPushClickRecByPushid(pushid);
		dataMap=new HashMap<String, Object>();
		dataMap.put("pushClickRecList",pushClickRecList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getPushClickRecBySid(){
		pushClickRecList=pushClickRecService.getPushClickRecByPushId(sid);
		dataMap=new HashMap<String, Object>();
		dataMap.put("pushClickRecList",pushClickRecList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	//update
	public String updatePushClickRecById(){
		pushClickRecService.updatePushClickRecById(pcrecid,pushid,sid);
		return SUCCESS;
	}
	//del
	public String delPushClickRecById(){
		pushClickRecService.delPushClickRecById(pcrecid);
		return SUCCESS;
	}
	//get set
	public PushClickRecService getPushClickRecService() {
		return pushClickRecService;
	}
	public void setPushClickRecService(PushClickRecService pushClickRecService) {
		this.pushClickRecService = pushClickRecService;
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
	public int getPcrecid() {
		return pcrecid;
	}
	public void setPcrecid(int pcrecid) {
		this.pcrecid = pcrecid;
	}
	public String getPushid() {
		return pushid;
	}
	public void setPushid(String pushid) {
		this.pushid = pushid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public List<PushClickRec> getPushClickRecList() {
		return pushClickRecList;
	}
	public void setPushClickRecList(List<PushClickRec> pushClickRecList) {
		this.pushClickRecList = pushClickRecList;
	}
	
}
