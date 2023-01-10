package com.portfolioweb.portfolio.Interface;

import com.portfolioweb.portfolio.Entity.Conocimiento;
import java.util.List;


public interface IConocimientoService {
    
    public List<Conocimiento> getConocimientos();
    
    public void updateConocimiento(Conocimiento cono);
    
    public void deleteConocimiento(Long Id);
}
