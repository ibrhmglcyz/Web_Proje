/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proje.util;

import java.util.List;

/**
 *
 * @author vektorel
 * @param <T>
 */
public interface ICRUD<T> {
    
    public void kaydet(T t);
    public void duzenle(T t);
    public void sil(int id, T t);
    public List<T> listele(T t);
    public List<T> bul(String column,String value, T t);
    public T bul(int id, T t);
    public List<T> ara(T t);
    
}
