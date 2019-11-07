package com.proje.util;


import com.proje.dal.tblusersdao;
import com.proje.dal.tbluserslogindao;

import com.proje.models.tblusers;
import com.proje.models.tbluserslogin;
import com.proje.dal.tblurundao;
import com.proje.dal.tblurunkategoridao;
import com.proje.models.tblurun;
import com.proje.models.tblurunkategori;


public class Runner {

	public static void main(String[] args) {
		
		tblusersdao dbusers = new tblusersdao();
		tbluserslogindao dblogin = new tbluserslogindao();

		tblurundao urundao = new tblurundao();
//		tblurunkategoridao kategoridao = new tblurunkategoridao();
		
		tblurun urun;
		
		urun = new tblurun();
		urun.setAd("Siyah Cicek Desenli Elbise");
		urun.setMarka("Trendyolmilla");
		urun.setModel("Elbise");
		urun.setBirim("Small");
		urun.setFiyat("149.99");
		urun.setStokadedi(3);
		urundao.kaydet(urun);
		
		urun = new tblurun();
		urun.setAd("Yesil Ekoseli Orme Elbise");
		urun.setMarka("Armonika");
		urun.setModel("Elbise");
		urun.setBirim("Medium");
		urun.setFiyat("109.99");
		urun.setStokadedi(6);
		urundao.kaydet(urun);
		
		urun = new tblurun();
		urun.setAd("Siyah Kaskorse Kolsuz Elbise");
		urun.setMarka("Cool ve Sexy");
		urun.setModel("Elbise");
		urun.setBirim("X-Small");
		urun.setFiyat("199.99");
		urun.setStokadedi(7);
		urundao.kaydet(urun);
		
		urun = new tblurun();
		urun.setAd("Haki Islemeli Elbise");
		urun.setMarka("Trendyolmilla");
		urun.setModel("Elbise");
		urun.setBirim("Large");
		urun.setFiyat("239.99");
		urun.setStokadedi(3);
		urundao.kaydet(urun);
		
		urun = new tblurun();
		urun.setAd("Vizon Blok Renklo Kadife Elbise");
		urun.setMarka("Happiness");
		urun.setModel("Elbise");
		urun.setBirim("5 X Large");
		urun.setFiyat("999.99");
		urun.setStokadedi(1);
		urundao.kaydet(urun);
		
//		tblurunkategori ktg;
		
//		ktg = new tblurunkategori();
//		ktg.setAd("KADIN GIYIM");
//		ktg.setParentid(0);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("ERKEK GIYIM");
//		ktg.setParentid(0);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("COCUK GIYIM");
//		ktg.setParentid(0);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("Pantolon");
//		ktg.setParentid(1);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("Pantolon");
//		ktg.setParentid(2);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("Pantolon");
//  	ktg.setParentid(3);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("Elbise");
//		ktg.setParentid(1);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("Elbise");
//		ktg.setParentid(3);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("Sweatshirt");
//		ktg.setParentid(1);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("Sweatshirt");
//		ktg.setParentid(2);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("Spor Giyim");
//		ktg.setParentid(3);
//		kategoridao.kaydet(ktg);
		
//		ktg = new tblurunkategori();
//		ktg.setAd("Takim Elbise");
//		ktg.setParentid(2);
//		kategoridao.kaydet(ktg);
		
//		tbluserslogin usrlogin = new tbluserslogin();
//		usrlogin.setUsername("admin");
//		usrlogin.setPassword("123");
//		usrlogin.setUsersid(99);
//		dblogin.kaydet(usrlogin);
		
//		tblusers usr = new tblusers();
//		usr.setFname("Ibrahim");
//		usr.setLname("Gulecyuz");
//		usr.setPhonenumber("0 538 554 17 02");
//		usr.setAdress("Ankara");
//		usr.setEmail("ibrhmglcyz@hotmail.com");
//		usr.setUniqueid(99);
//		dbusers.kaydet(usr);
		
		
//		tblmesajdao msdb = new tblmesajdao();
//		tblmesaj ms; 
//		for(int i=1; i<10; i++) {
//		ms = new tblmesaj();
//		ms.setMesaj("Yeni Bir Ileti Gonderiyorum"+i);
//		ms.setGonderen("Ahmet - "+i);
//		ms.setSaat("12:00"+i);
//		msdb.kaydet(ms);
//		}
		
//		tblusers usr = new tblusers();
//		usr.setAdsoyad("Ibrahim Gulecyuz");
//		usr.setYetkiid(99);
//		dbusers.kaydet(usr);
		
//		tbluserslogin lg = new tbluserslogin();
//		lg.setKullaniciadi("admin");
//		lg.setSifre("123");
//		lg.setUsersid(1);
//		dblogin.kaydet(lg);
		
		
		
//		tblusers usr = new tblusers();
//		usr.setAdsoyad("Admin Personel");  //Buradaki deger de Admin/index.xhtml dosyasindan gelebiliyor. Ve sag ustte database ile gorulebiliyor.
//		usr.setAdres("Ankara");
//		usr.setAvatarid(1);
//		usr.setTelefon("05385541702");
//		usr.setYetkiid(99);
//		dbusers.kaydet(usr);

//		usr = new tblusers();
//		usr.setAdsoyad("Personel-1");
//		usr.setAdres("Ankara");
//		usr.setAvatarid(2);
//		usr.setTelefon("05556667788");
//		usr.setYetkiid(2);
//		dbusers.kaydet(usr);
		
	}

}
