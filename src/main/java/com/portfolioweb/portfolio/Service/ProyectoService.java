package com.portfolioweb.portfolio.Service;

import com.portfolioweb.portfolio.Interface.IProyectoService;
import com.portfolioweb.portfolio.Entity.Proyecto;
import com.portfolioweb.portfolio.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    ProyectoRepository conoRepo;
    
    
    @Override
    public List<Proyecto> getProyecto() {
        
        return conoRepo.findAll();
    }

    @Override
    public void createProyecto(Proyecto proy) {
        
        conoRepo.save(proy);
    }
    
    @Override
    public void updateProyecto(Proyecto proy) {
        
        conoRepo.save(proy);
    }

    @Override
    public void deleteProyecto(Long id) {
        
        conoRepo.deleteById(id);
    }
}
