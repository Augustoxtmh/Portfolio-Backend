package com.portfolioweb.portfolio.Interface;

import com.portfolioweb.portfolio.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    
    public void updateExperiencia(Experiencia exp);
    
    public void deleteExperiencia(Long Id);
}
