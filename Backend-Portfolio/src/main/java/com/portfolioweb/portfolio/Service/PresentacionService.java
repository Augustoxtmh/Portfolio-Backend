package com.portfolioweb.portfolio.Service;

import com.portfolioweb.portfolio.Interface.IPresentacionService;
import com.portfolioweb.portfolio.Entity.Presentacion;
import com.portfolioweb.portfolio.Repository.PresentacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresentacionService implements IPresentacionService{

    @Autowired
    PresentacionRepository preseRepo;
    
    @Override
    public Presentacion getPresentacion(Long id) {
        
        return preseRepo.findById(id).orElse(null);
    }

    @Override
    public void updatePresentacion(Long id, String nombre, 
            String apellido, String Url_img, String Url_banner) {
        
        Presentacion n_present = getPresentacion(id);
        n_present.setNombre(nombre);
        n_present.setApellido(apellido);
        n_present.setUrl_Banner(Url_banner);
        n_present.setUrl_Img(Url_img);
        preseRepo.save(n_present);
    }
}
