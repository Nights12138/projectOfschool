package com.coursemgmt.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coursemgmt.model.Wechatpush;
import com.coursemgmt.service.WechatpushService;
import com.opensymphony.xwork2.ActionSupport;
@Controller("wechatpushAction")
@Scope("prototype")
public class WechatpushAction extends ActionSupport{
	@Resource
	private WechatpushService wechatpushService;
	
	private Map<String,Object> dataMap;
	private JSONObject json;
	
	//接受参数
	private int pushid;
	private String pushclass;
	private String pushcontent;
	private String pushtime;
	private Date createtime;
	
	//返回结果集
	private List<Wechatpush> wechatpushList;
	
	public String addWechatpush(){
		wechatpushService.addWechatpush(pushclass,pushcontent,pushtime);
		return SUCCESS;
	}
	
	//get
	public String getAllWechatpushs(){
		wechatpushList=wechatpushService.getAllWechatpushs();
		dataMap=new HashMap<String, Object>();
		dataMap.put("wechatpushList",wechatpushList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getWechatpushById(){
		wechatpushList=wechatpushService.getWechatpushById(pushid);
		dataMap=new HashMap<String, Object>();
		dataMap.put("wechatpushList",wechatpushList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String getWechatpushByClass(){
		wechatpushList=wechatpushService.getWechatpushByClass(pushclass);
		dataMap=new HashMap<String, Object>();
		dataMap.put("wechatpushList",wechatpushList);
		json=JSONObject.fromObject(dataMap);
		return SUCCESS;
	}
	public String updateWechatpushById(){
		wechatpushService.updateWechatpushById(pushid,pushclass,pushcontent,pushtime);
		return SUCCESS;
	}
	public String delWechatpushById(){
		wechatpushService.delWechatpushById(pushid);
		return SUCCESS;
	}
	public WechatpushService getWechatpushService() {
		return wechatpushService;
	}
	public void setWechatpushService(WechatpushService wechatpushService) {
		this.wechatpushService = wechatpushService;
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
	public int getPushid() {
		return pushid;
	}
	public void setPushid(int pushid) {
		this.pushid = pushid;
	}
	public String getPushclass() {
		return pushclass;
	}
	public void setPushclass(String pushclass) {
		this.pushclass = pushclass;
	}
	public String getPushcontent() {
		return pushcontent;
	}
	public void setPushcontent(String pushcontent) {
		this.pushcontent = pushcontent;
	}
	public String getPushtime() {
		return pushtime;
	}
	public void setPushtime(String pushtime) {
		this.pushtime = pushtime;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public List<Wechatpush> getWechatpushList() {
		return wechatpushList;
	}
	public void setWechatpushList(List<Wechatpush> wechatpushList) {
		this.wechatpushList = wechatpushList;
	}
}
