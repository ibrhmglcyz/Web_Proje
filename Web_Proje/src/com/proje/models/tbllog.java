/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proje.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//import org.hibernate.envers.Audited;

/**
 *
 * @author vektorel
 */
@Entity
@Table
//@Audited
public class tbllog {
    
    @Id
    @SequenceGenerator(name = "sq_tbllog_id", sequenceName = "sq_tbllog_id", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "sq_tbllog_id")
    private int id;
    private String tarih;
    private String sinif;
    private String method;
    private String hataicerigi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getHataicerigi() {
        return hataicerigi;
    }

    public void setHataicerigi(String hataicerigi) {
        this.hataicerigi = hataicerigi;
    }
    
    
}
