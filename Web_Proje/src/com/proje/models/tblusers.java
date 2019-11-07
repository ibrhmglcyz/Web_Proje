package com.proje.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblusers {

	@Id
	@SequenceGenerator(name = "sq_tblusers_id", sequenceName = "sq_tblusers_id", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "sq_tblusers_id")
	private int id;
	private String fname;
	private String lname;
	private String phonenumber;
	private String adress;
	private String email;

	private int uniqueid; // 1 ise kullanicilar, 99 ise admin
	
	
	public int getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(int uniqueid) {
		this.uniqueid = uniqueid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}		
	
}
