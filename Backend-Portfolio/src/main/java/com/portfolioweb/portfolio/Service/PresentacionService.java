package com.portfolioweb.portfolio.Service;

import com.portfolioweb.portfolio.Interface.IPresentacionService;
import com.portfolioweb.portfolio.Entity.Presentacion;
import com.portfolioweb.portfolio.Repository.PresentacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresentacionService implements IPresentacionService{

    @Autowired
    PresentacionRepository preseRepo;
    
    @Override
    public List<Presentacion> getPresentacion() {
        return preseRepo.findAll();
    }

    @Override
    public void updatePresentacion(String nombre, 
            String descripcion, String Url_banner) {
        
        Presentacion n_present = getPresentacion().get(0);
        n_present.setNombre(nombre);
        n_present.setDescripcion(descripcion);
        n_present.setUrl_Banner(Url_banner);

        preseRepo.save(n_present);
    }
}
