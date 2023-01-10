package com.portfolioweb.portfolio.Interface;

import com.portfolioweb.portfolio.Entity.Presentacion;


public interface IPresentacionService {
    
    
    public Presentacion getPresentacion(Long id);
    
    public void updatePresentacion(Long id, String nombre, String apellido, String Url_img, String Url_banner);
}
