package com.coursemgmt.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coursemgmt.model.Qa;
import com.coursemgmt.service.QaService;
import com.opensymphony.xwork2.ActionSupport;
@Controller("qaAction")
@Scope("prototype")
public class QaAction extends ActionSupport{
	@Resource
	private QaService qaService;
	
	private Map<String,Object> dataMap;
	private JSONObject json;
	
	//接受参数
	private int qaid;
	private String sid;
	private String tid;
	private String ask;
	private String answer;
	private Date createtime;
	
	//返回结果集
	private List<Qa> qaList;
	
	public String addQa(){
		qaService.addQa(sid,tid,ask,answer);
		return SUCCESS;
	}
	
	//get
	public String getAllQas(){
		qaList=qaService.getAllQas();
		dataMap=new HashMap<String, Object>();
		dataMap.put("qaList",qaList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getQaBySid(){
		qaList=qaService.getQaBySid(sid);
		dataMap=new HashMap<String, Object>();
		dataMap.put("qaList",qaList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getQaByTid(){
		qaList=qaService.getQaByTid(tid);
		dataMap=new HashMap<String, Object>();
		dataMap.put("qaList",qaList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	
	public String updateQaById(){
		qaService.updateQaById(qaid,sid,tid,ask,answer);
		return SUCCESS;
	}
	public String delQaById(){
		qaService.delQaById(qaid);
		return SUCCESS;
	}

	
	
	public QaService getQaService() {
		return qaService;
	}

	public void setQaService(QaService qaService) {
		this.qaService = qaService;
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

	public int getQaid() {
		return qaid;
	}

	public void setQaid(int qaid) {
		this.qaid = qaid;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getAsk() {
		return ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public List<Qa> getQaList() {
		return qaList;
	}

	public void setQaList(List<Qa> qaList) {
		this.qaList = qaList;
	}
	
	
}
