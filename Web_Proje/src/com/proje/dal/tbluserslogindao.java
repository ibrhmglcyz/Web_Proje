package com.proje.dal;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.proje.models.tbluserslogin;
import com.proje.util.VeritabaniIsletimcisi;
import com.proje.util.NewHibernateUtil;

public class tbluserslogindao extends VeritabaniIsletimcisi<tbluserslogin>{

	public tbluserslogin isPassword(String username, String password) {
		Session ss = NewHibernateUtil.getSessionFactory().openSession();
		Criteria cr = ss.createCriteria(tbluserslogin.class);
		cr.add(Restrictions.eq("username", username));
		cr.add(Restrictions.eq("password", password));
		if(cr.list().size()>0) 
			return (tbluserslogin)cr.list().get(0);
		else
			return null;
		
	}
	
}
