package com.proje.dal;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.proje.models.tbllog;
import com.proje.models.tblurunkategori;
import com.proje.util.LogIslemleri;
import com.proje.util.NewHibernateUtil;
import com.proje.util.VeritabaniIsletimcisi;

public class tblurunkategoridao extends VeritabaniIsletimcisi<tblurunkategori>{

	private Session ss;
    private Transaction tt;
    private tbllog log ;
    private LogIslemleri dblog = new LogIslemleri();
            
            
    private void ac(){
      try{
        ss = NewHibernateUtil.getSessionFactory().openSession();
        tt = ss.beginTransaction();
      }catch(Exception ex){
          tblurunkategori t = null;
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
	
	public List<tblurunkategori> parentList(){
		
		 List<tblurunkategori> liste = null;
	        try {
	            ac();
	            Criteria cr = ss.createCriteria(tblurunkategori.class);
	            // % -> her karakter
	            // %ah% -> ahmet.....
	            // a% -> ali, arif,ayşe ....
	            cr.add(Restrictions.eq("parentid",0));
	            liste = cr.list();
	        } catch (Exception ex) {
	          log = new tbllog();
	          log.setHataicerigi(ex.toString());
	          log.setMethod("Listele");
	          log.setSinif(tblurunkategori.class.toString());
	          log.setTarih(new Date()+"");
	          dblog.Kaydet(log);
	           return null;
	        }
	        
	        return liste;
	}

}
