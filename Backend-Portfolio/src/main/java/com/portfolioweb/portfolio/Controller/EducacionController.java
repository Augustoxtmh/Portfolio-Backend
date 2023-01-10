package com.portfolioweb.portfolio.Controller;

import com.portfolioweb.portfolio.Entity.Educacion;
import com.portfolioweb.portfolio.Interface.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class EducacionController {
    
    @Autowired
    private IEducacionService conoServ;
    
    @GetMapping ("/Educacion")
    @ResponseBody
    public List<Educacion> getEducacion(){
        
        return conoServ.getEducacion();
    }

    @PostMapping ("/Crear/Educacion")
    public void updateEducacion(@RequestBody Educacion cono){
        
        conoServ.updateEducacion(cono);        
    }
    
    @DeleteMapping("/Borrar/Educacion/{id}")
    public void deleteEducacion(@PathVariable Long id){
        
        conoServ.deleteEducacion(id);
    }
}
