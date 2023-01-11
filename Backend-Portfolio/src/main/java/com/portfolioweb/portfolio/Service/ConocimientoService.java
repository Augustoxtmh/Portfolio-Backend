package com.portfolioweb.portfolio.Service;

import com.portfolioweb.portfolio.Interface.IConocimientoService;
import com.portfolioweb.portfolio.Entity.Conocimiento;
import com.portfolioweb.portfolio.Repository.ConocimientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConocimientoService implements IConocimientoService {

    @Autowired
    ConocimientoRepository conoRepo;
    
    
    @Override
    public List<Conocimiento> getConocimientos() {
        
        return conoRepo.findAll();
    }

    @Override
    public void updateConocimiento(Conocimiento cono) {
        
        conoRepo.save(cono);
    }

    @Override
    public void createConocimiento(Conocimiento cono) {
        
        conoRepo.save(cono);
    }

    @Override
    public void deleteConocimiento(Long id) {
        
        conoRepo.deleteById(id);
    }
}
