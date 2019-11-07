package com.proje.bll.admin;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import com.proje.dal.tblurundao;
import com.proje.models.tblurun;


@SessionScoped
@ManagedBean
public class urunEkleBean {
	
	private String ad;
	private String marka;
	private String model;
	private String fiyat;
	private String birim;
	private int stokadedi;
	private int kategoriid;
	
	
	private tblurundao udao = new tblurundao();
	
	
	public void kaydet() {
		tblurun urun = new tblurun();
		urun.setAd(ad);
		urun.setBirim(birim);
		urun.setFiyat(fiyat);
		urun.setKategoriid(kategoriid);
		urun.setMarka(marka);
		urun.setModel(model);
		urun.setStokadedi(stokadedi);
		udao.kaydet(urun);
		
		ad="";
		birim="";
		fiyat="";
		model="";
		marka="";
		birim="";
		stokadedi=0;
		kategoriid=0;
				
		
	}
	
	
	
	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public String getMarka() {
		return marka;
	}



	public void setMarka(String marka) {
		this.marka = marka;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getFiyat() {
		return fiyat;
	}



	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}



	public String getBirim() {
		return birim;
	}



	public void setBirim(String birim) {
		this.birim = birim;
	}



	public int getStokadedi() {
		return stokadedi;
	}



	public void setStokadedi(int stokadedi) {
		this.stokadedi = stokadedi;
	}



	public int getKategoriid() {
		return kategoriid;
	}



	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}

	public tblurundao getUdao() {
		return udao;
	}
	public void setUdao(tblurundao udao) {
		this.udao = udao;
	}
	
	
	
}
