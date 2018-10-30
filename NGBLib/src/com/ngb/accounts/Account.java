package com.ngb.transaction;

public abstract class Account {

	private String email;
	private String AccNum;
	
	public Account(String email, String accNum) {
		super();
		this.email = email;
		AccNum = accNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccNum() {
		return AccNum;
	}

	public void setAccNum(String accNum) {
		AccNum = accNum;
	}
	
	
	
}
