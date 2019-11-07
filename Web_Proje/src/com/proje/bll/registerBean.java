package com.proje.bll;

import com.proje.models.tblusers;
import com.proje.models.tbluserslogin;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import com.proje.dal.tblusersdao;
import com.proje.dal.tbluserslogindao;

@SuppressWarnings("deprecation")
@SessionScoped
@ManagedBean
public class registerBean {

	private tblusers usr;
	private tbluserslogin login;
	tblusersdao dbusers = new tblusersdao();
	tbluserslogindao dblogin = new tbluserslogindao();
	
	public registerBean() {
		usr = new tblusers();
		login = new tbluserslogin();
	}
	
	public void kaydet() {
		dbusers.kaydet(usr);
		List<tblusers> ls = dbusers.listele(new tblusers());
		int id = ls.get(ls.size()-1).getId();
		login.setUsersid(id);
		login.setUsername(login.getUsername());
		dblogin.kaydet(login);
	}
	
	public tblusers getUsr() {
		return usr;
	}
	public void setUsr(tblusers usr) {
		this.usr = usr;
	}
	public tbluserslogin getLogin() {
		return login;
	}
	public void setLogin(tbluserslogin login) {
		this.login = login;
	}
	
	
	
}
