package com.nbg.messages;

import java.io.Serializable;
import java.util.Date;




public class Message implements Serializable{
	private String fname;
	private String lname;
	private String body;
	private String senderEmail;
	private Date date;
	
	public Message() {
		fname = "";
		lname = "";
		body = "";
		senderEmail = "";
		date = null;
	}
	
	public Message(String fname, String lname, String SenderEmail) {
		this.fname = fname;
		this.lname = lname;
		this.senderEmail = senderEmail;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Message [fname=" + fname + ", lname=" + lname + ", body=" + body + ", senderEmail=" + senderEmail
				+ ", date=" + date + "]";
	}
	
	
}
