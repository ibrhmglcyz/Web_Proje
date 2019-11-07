package com.proje.bll.admin;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import com.proje.dal.tblurundao;
import com.proje.models.tblurun;

@SessionScoped
@ManagedBean
public class urunListesiBean {

	private tblurundao dao = new tblurundao();
	
	private List<tblurun> urunlistesi;

	tblurun urun = new tblurun();
	
	public urunListesiBean() {
		urun.setKategoriid(0);
	}
	
	public tblurundao getDao() {
		return dao;
	}

	public void setDao(tblurundao dao) {
		this.dao = dao;
	}

	public List<tblurun> getUrunlistesi() {
		//return urunlistesi;
		return urunlistesi = dao.ara(urun);
	}

	public void setUrunlistesi(List<tblurun> urunlistesi) {
		this.urunlistesi = urunlistesi;
	}
	
	
}
