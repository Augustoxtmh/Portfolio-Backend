package com.portfolioweb.portfolio.Service;

import com.portfolioweb.portfolio.Interface.IExperienciaService;
import com.portfolioweb.portfolio.Entity.Experiencia;
import com.portfolioweb.portfolio.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    ExperienciaRepository conoRepo;
    
    
    @Override
    public List<Experiencia> getExperiencia() {
        
        return conoRepo.findAll();
    }

    @Override
    public void createExperiencia(Experiencia exp) {
        
        conoRepo.save(exp);
    }
    
    @Override
    public void updateExperiencia(Experiencia exp) {
        
        conoRepo.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        
        conoRepo.deleteById(id);
    }
}
