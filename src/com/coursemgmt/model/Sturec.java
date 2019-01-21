package com.coursemgmt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sturec")
public class Sturec {
	@Id
	@GeneratedValue
	private int studrecid;
	private String classid;
	private String sid;
	private Date createtime;
	
	
	public int getStudrecid() {
		return studrecid;
	}
	public void setStudrecid(int studrecid) {
		this.studrecid = studrecid;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
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
		return "Sturec [studrecid=" + studrecid + ", classid=" + classid
				+ ", sid=" + sid + ", createtime=" + createtime + "]";
	}
	
	

}
