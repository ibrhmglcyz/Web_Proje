package com.proje.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblurun {
	
	@Id
	@SequenceGenerator(name = "sq_tblurun_id", sequenceName = "sq_tblurun_id", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "sq_tblurun_id")
	private int id;
	private String ad;
	private String marka;
	private String model;
	private String fiyat;
	private String birim;
	private int stokadedi;
    private int kdv;
    
    private int kategoriid;

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

	public int getKdv() {
		return kdv;
	}

	public void setKdv(int kdv) {
		this.kdv = kdv;
	}

	public int getKategoriid() {
		return kategoriid;
	}

	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}
    
    
	
}
