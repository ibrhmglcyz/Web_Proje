package com.proje.bll;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import com.proje.dal.tblusersdao;
import com.proje.models.tblusers;
import com.proje.util.StaticValues;

@SuppressWarnings("deprecation")
@SessionScoped
@ManagedBean
public class loginBean {

	private String username;
	private String password;
	
	tblusersdao dbusers = new tblusersdao();
	
	
	public String Login() {		
		tblusers usr = dbusers.getUsers(username, password);
		if(usr==null)
			return "login.jsf";
		else {
			StaticValues.user = usr;
			if(usr.getUniqueid()==1)
				return "Users/index.jsf?faces-redirect=true";
			else if (usr.getUniqueid()==99)
				return "Admin/index.jsf?faces-redirect=true";
			else
				return "login.jsf";			
		}
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
	
	
	
}
