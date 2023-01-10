package com.portfolioweb.portfolio.Controller;

import com.portfolioweb.portfolio.Entity.Presentacion;
import com.portfolioweb.portfolio.Interface.IPresentacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresentacionController {
    
    @Autowired 
    private IPresentacionService presentServ;
    
    @GetMapping ("/Presentacion")
    public Presentacion getPresentacion(){
        
        return presentServ.getPresentacion(Long.MIN_VALUE);
    }
    
    @PutMapping ("/Actualizar/Presentacion")
    public void updatePresentacion(@RequestParam ("Id") Long id,
            @RequestParam ("Nombre") String nvo_n,
            @RequestParam ("Apellido") String nvo_a,
            @RequestParam ("Url_img") String nvaUrImg,
            @RequestParam ("Url_Banner") String nvaUrBnner){
        
        presentServ.updatePresentacion(id, 
                nvo_n, nvo_a, nvaUrImg, nvaUrBnner);
    }
}
