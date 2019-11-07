package com.proje.util;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.proje.models.tblusers;

@SessionScoped
@ManagedBean
public class StaticValues {

	public static tblusers user = new tblusers();
	
	public static int user_id;
	
	public static int kategori_id;
	
	public static List<Integer> cartList;
}
