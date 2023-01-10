package com.portfolioweb.portfolio.Interface;

import com.portfolioweb.portfolio.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> getEducacion();
    
    public void updateEducacion(Educacion edu);
    
    public void deleteEducacion(Long Id);
}
