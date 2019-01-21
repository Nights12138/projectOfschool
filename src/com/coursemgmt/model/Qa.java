package com.coursemgmt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="qa")
public class Qa {
	@Id
	@GeneratedValue
	private int qaid;
	private String sid;
	private String tid;
	private String ask;
	private String answer;
	private Date createtime;
	
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
	@Override
	public String toString() {
		return "Qa [qaid=" + qaid + ", sid=" + sid + ", tid=" + tid + ", ask="
				+ ask + ", answer=" + answer + ", createtime=" + createtime
				+ "]";
	}

}
