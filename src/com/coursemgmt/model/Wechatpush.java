package com.coursemgmt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="wechatpush")
public class Wechatpush {
	@Id
	@GeneratedValue
	private int pushid;
	private String pushclass;
	private String pushcontent;
	private String pushtime;
	private Date createtime;
	
	
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
	@Override
	public String toString() {
		return "Wechatpush [pushid=" + pushid + ", pushclass=" + pushclass
				+ ", pushcontent=" + pushcontent + ", pushtime=" + pushtime
				+ ", createtime=" + createtime + "]";
	}
	

}
