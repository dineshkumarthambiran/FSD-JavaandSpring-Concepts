package com.natwest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Users {
	
	
	@Id
	@Column(name = "LoginId")
	String id;
	String name;
	String emailid;
	Long mobno;
	String password;
	String confirmpassword;
	
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String id, String name, String emailid, Long mobno, String password, String confirmpassword) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.mobno = mobno;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	
	
	
	
	

}
