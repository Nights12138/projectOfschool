package com.coursemgmt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pushclickrec")
public class PushClickRec {
	@Id
	@GeneratedValue
	private int pcrecid;
	private String pushid;
	private String sid;
	private Date createtime;
	
	
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
	@Override
	public String toString() {
		return "Pushclickrec [pcrecid=" + pcrecid + ", pushid=" + pushid
				+ ", sid=" + sid + ", createtime=" + createtime + "]";
	}

}
