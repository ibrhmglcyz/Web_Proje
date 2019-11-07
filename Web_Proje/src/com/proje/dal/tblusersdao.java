package com.proje.dal;

import com.proje.models.tblusers;
import com.proje.util.VeritabaniIsletimcisi;
import com.proje.dal.tbluserslogindao;
import com.proje.models.tbluserslogin;

public class tblusersdao extends VeritabaniIsletimcisi<tblusers> {

	tbluserslogindao db = new tbluserslogindao();
	public tblusers getUsers(String username, String password) {	
		tbluserslogin login = db.isPassword(username, password);
		if(login==null)
			return null;
		else {			
		int usersid = login.getUsersid();
		return bul(usersid, new tblusers());
		}
	}
	
}
