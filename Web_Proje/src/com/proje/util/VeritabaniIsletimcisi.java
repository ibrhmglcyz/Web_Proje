/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proje.util;

import com.proje.models.tbllog;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 * @param <U>
 */
public class VeritabaniIsletimcisi<U> implements ICRUD<U>{

    private Session ss;
    private Transaction tt;
    private tbllog log ;
    private LogIslemleri dblog = new LogIslemleri();
            
            
    private void ac(){
      try{
        ss = NewHibernateUtil.getSessionFactory().openSession();
        tt = ss.beginTransaction();
      }catch(Exception ex){
          U t = null;
          log = new tbllog();
          log.setHataicerigi(ex.toString());
          log.setMethod("kaydet");
          log.setSinif(t.getClass().toString());
          log.setTarih(new Date()+"");
          dblog.Kaydet(log);
      }
    }
    private void kapat(){
        tt.commit();
        ss.close();
    }
    
    @Override
    public void kaydet(U t) {
       try{
       ac();
       ss.save(t);
       kapat();
       }catch(Exception ex){
          tt.rollback();
          ss.close();
          log = new tbllog();
          log.setHataicerigi(ex.toString());
          log.setMethod("kaydet");
          log.setSinif(t.getClass().toString());
          log.setTarih(new Date()+"");
          dblog.Kaydet(log);
          
       }       
    }

    @Override
    public void duzenle(U t) {
       try{
       ac();
       ss.update(t);
       kapat();
       }catch(Exception ex){
           tt.rollback();
           ss.close();
            log = new tbllog();
          log.setHataicerigi(ex.toString());
          log.setMethod("düzenle");
          log.setSinif(t.getClass().toString());
          log.setTarih(new Date()+"");
          dblog.Kaydet(log);
       }    
    }

    @Override
    public void sil(int id, U t) {
       try{
       ac();
       ss.delete(t);
       kapat();
       }catch(Exception ex){
           tt.rollback();
           ss.close();
            log = new tbllog();
          log.setHataicerigi(ex.toString());
          log.setMethod("sil");
          log.setSinif(t.getClass().toString());
          log.setTarih(new Date()+"");
          dblog.Kaydet(log);
       }    
    }

    @Override
    public List<U> listele(U t) {
       try{
           ac();
           Criteria cr = ss.createCriteria(t.getClass());
           List<U> liste = cr.list();
           kapat();
           return liste;          
       }catch(HibernateException ex){
          log = new tbllog();
          log.setHataicerigi(ex.toString());
          log.setMethod("Listele");
          log.setSinif(t.getClass().toString());
          log.setTarih(new Date()+"");
          dblog.Kaydet(log);
           return null;
       }
    }

    @Override
    public List<U> bul(String column, String value, U t) {
        List<U> liste = null;
        try {
            ac();
            Criteria cr = ss.createCriteria(t.getClass());
            // % -> her karakter
            // %ah% -> ahmet.....
            // a% -> ali, arif,ayşe ....
            cr.add(Restrictions.ilike(column,"%"+value+"%"));
            liste = cr.list();
        } catch (Exception ex) {
          log = new tbllog();
          log.setHataicerigi(ex.toString());
          log.setMethod("Listele");
          log.setSinif(t.getClass().toString());
          log.setTarih(new Date()+"");
          dblog.Kaydet(log);
           return null;
        }
        
        return liste;
    }

    
    
    @Override
    public U bul(int id, U t) {
        U result  = null;
        try {
            ac();
            Criteria cr = ss.createCriteria(t.getClass());
            cr.add(Restrictions.eq("id", id));
            result = (U)cr.list().get(0);
        } catch (Exception ex) {
          log = new tbllog();
          log.setHataicerigi(ex.toString());
          log.setMethod("Listele");
          log.setSinif(t.getClass().toString());
          log.setTarih(new Date()+"");
          dblog.Kaydet(log);
           return null;
        }
        
        return result;
    }

    @Override
    public List<U> ara(U t) {
       // tblmusteri -> id, ad,soyad,.....
       // 1- column(başlık)
       // 2- value(değeri)
       // id=5, ad=vsdsdf, soyad=fsdsf, adres=null ""
       // ref-> değişken adını al == column
       // ref-> değişken değerini al = value
       // ??? eğer değeri boş yada null değil ise
       List<U> liste = null;
        try {
            Class cl = t.getClass();
            Field[] fl = cl.getDeclaredFields();
            ac();
            Criteria cr = ss.createCriteria(t.getClass());
            for(int i=0; i< fl.length;i++){
                fl[i].setAccessible(true);
             
                if(fl[i].get(t)!=null){
                                   
                    if(fl[i].getType() == int.class && !fl[i].get(t).toString().equals("0"))
                                     cr.add(Restrictions.eq(fl[i].getName(),fl[i].get(t)));
                    else if(fl[i].getType() == boolean.class)
                                     cr.add(Restrictions.eq(fl[i].getName(),fl[i].get(t)));
                    else if(fl[i].getType() == float.class)
                                     cr.add(Restrictions.eq(fl[i].getName(),fl[i].get(t)));
                    else if(fl[i].getType() == double.class)
                                     cr.add(Restrictions.eq(fl[i].getName(),fl[i].get(t)));
                    else if(fl[i].getType() == String.class)
                    cr.add(Restrictions.ilike(fl[i].getName(),"%"+fl[i].get(t).toString()+"%"));
                }
            }
            liste = cr.list();
            kapat();
        } catch (Exception e) {
            System.out.println("Hata....: "+ e.toString());
        }
       
       
       return liste;
    }
    
}
