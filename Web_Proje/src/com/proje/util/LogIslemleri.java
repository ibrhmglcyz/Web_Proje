/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proje.util;

import com.proje.models.tbllog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vektorel
 */
public class LogIslemleri {
    Session ss;
    Transaction tt ;
    
    public void ac(){
    ss = NewHibernateUtil.getSessionFactory().openSession();
    tt = ss.beginTransaction();
    }
    public void Kaydet(tbllog item){
        try{
          ac();
          ss.save(item);
          tt.commit();
          ss.close();
        }catch(Exception ex){
            filesave(item);
        }
    
    }   
    
    public void filesave(tbllog item){
        try{
        File fl = new File("src//main//java//com//vektorel//util//log.txt");
        BufferedWriter bf = new BufferedWriter(new FileWriter(fl, true));
        bf.append(" Tarih....: "+item.getTarih()+
                " - Sınıf....: "+item.getSinif()+
                " - Method...: "+item.getMethod()+
                " - Hata.....: "+ item.getHataicerigi());
        bf.newLine();
        bf.flush();
        bf.close();        
        }catch(IOException ex){
            
        }
                
    }
}
