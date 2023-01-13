package com.portfolioweb.portfolio.Service;

import com.portfolioweb.portfolio.Interface.IEducacionService;
import com.portfolioweb.portfolio.Entity.Educacion;
import com.portfolioweb.portfolio.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    EducacionRepository conoRepo;
    
    
    @Override
    public List<Educacion> getEducacion() {
        
        return conoRepo.findAll();
    }

    @Override
    public void createEducacion(Educacion edu) {
        
        conoRepo.save(edu);
    }
        
    @Override
    public void updateEducacion(Educacion edu) {
        
        conoRepo.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        
        conoRepo.deleteById(id);
    }
}
