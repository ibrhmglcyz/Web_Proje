package com.proje.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblurunkategori {
	
	@Id
	@SequenceGenerator(name = "sq_tblurunkategori_id", sequenceName = "sq_tblurunkategori_id", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "sq_tblurunkategori_id")
	private int id;
	private String ad;
	private int parentid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	
	
	
}
