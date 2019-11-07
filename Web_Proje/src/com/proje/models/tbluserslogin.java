package com.proje.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tbluserslogin {

	@Id
	@SequenceGenerator(name = "sq_tbluserslogin_id", sequenceName = "sq_tbluserslogin_id", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "sq_tbluserslogin_id")
	private int id;
	private String username;
	private String password;
	
	private int usersid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUsersid() {
		return usersid;
	}
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	
	
}
