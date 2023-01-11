package com.portfolioweb.portfolio.Interface;

import com.portfolioweb.portfolio.Entity.Presentacion;
import java.util.List;


public interface IPresentacionService {
    
    
    public List <Presentacion> getPresentacion();
    
    public void updatePresentacion(String nombre, String descripcion, String Url_img, String Url_banner);
}
