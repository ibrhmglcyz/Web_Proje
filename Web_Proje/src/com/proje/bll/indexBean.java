package com.proje.bll;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.proje.dal.tblurundao;
import com.proje.dal.tblurunkategoridao;
import com.proje.models.tblurun;
import com.proje.models.tblurunkategori;
import com.proje.models.tblusers;
import com.proje.util.StaticValues;

@SessionScoped
@ManagedBean(name = "indexBean")
public class indexBean {
	
	tblurundao urundao = new tblurundao();
	
	tblurunkategoridao kategoridao = new tblurunkategoridao();
	
	private tblusers loginUsers;
	
	private String redirect="";
	
	private String urladresi;

	private List<tblurun> urunList;
	
	
	private List<tblurunkategori> kategoriListParent;
	private List<tblurunkategori> kategoriListChild;
	
	
	public indexBean() {
		this.urunList = urundao.listele(new tblurun());
		
		
		this.kategoriListParent = kategoridao.parentList();
	}
	
	public void urlVer(int id) {
		urladresi = "index.xhtml";
		tblurun ara = new tblurun();
		ara.setKategoriid(id);
		this.urunList = urundao.ara(ara);
		switch (id) {
		case 1: urladresi = "Users/elbise.xhtml"; redirect= "Elbise"; break;
		
		default: urladresi = "Users/elbise.xhtml"; break;
		}
			System.out.println("Secilin id....: "+ id);
	}

	
	
	public List<tblurunkategori> getKategoriListParent() {
		return kategoriListParent;
	}

	public void setKategoriListParent(List<tblurunkategori> kategoriListParent) {
		this.kategoriListParent = kategoriListParent;
	}

	public List<tblurunkategori> getKategoriListChild(int id) {
		tblurunkategori ara= new tblurunkategori();
		ara.setParentid(id);
		return kategoridao.ara(ara);
	}

	public void setKategoriListChild(List<tblurunkategori> kategoriListChild) {
		this.kategoriListChild = kategoriListChild;
	}


	public List<tblurun> getUrunList() {
		return urunList;
	}

	public void setUrunList(List<tblurun> urunList) {
		this.urunList = urunList;
	}
	
	public tblusers getLoginUsers() {
		return loginUsers;
	}

	public void setLoginUsers(tblusers loginUsers) {
		this.loginUsers = loginUsers;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	public String getUrladresi() {
		return urladresi;
	}

	public void setUrladresi(String urladresi) {
		this.urladresi = urladresi;
	}



}
	
