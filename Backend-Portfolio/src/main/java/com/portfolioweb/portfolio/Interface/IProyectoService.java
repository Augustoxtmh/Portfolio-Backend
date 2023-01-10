package com.portfolioweb.portfolio.Interface;

import com.portfolioweb.portfolio.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> getProyecto();
    
    public void updateProyecto(Proyecto proy);
    
    public void deleteProyecto(Long Id);
}
