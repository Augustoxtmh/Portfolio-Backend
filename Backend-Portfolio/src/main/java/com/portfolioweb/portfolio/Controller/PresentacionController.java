package com.portfolioweb.portfolio.Controller;

import com.portfolioweb.portfolio.Entity.Presentacion;
import com.portfolioweb.portfolio.Interface.IPresentacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class PresentacionController {
    
    @Autowired 
    private IPresentacionService presentServ;
    
    @GetMapping ("/Presentacion")
    public Presentacion getPresentacion(){
        
        return presentServ.getPresentacion().get(0);
    }
    
    @PutMapping ("/Presentacion/Actualizar")
    public void updatePresentacion(@RequestParam ("Nombre") String nvo_n,
            @RequestParam ("Descripcion") String nvo_a,
            @RequestParam ("Url_Img") String nva_Url_Img,
            @RequestParam ("Url_Banner") String nva_Url_Bnner){

        presentServ.updatePresentacion(nvo_n, nvo_a, 
                nva_Url_Img, nva_Url_Bnner);
    }
}
