package com.portfolioweb.portfolio.Controller;

import com.portfolioweb.portfolio.Entity.Experiencia;
import com.portfolioweb.portfolio.Interface.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService conoServ;
    
    @GetMapping ("/Experiencia")
    @ResponseBody
    public List<Experiencia> getExperiencia(){
        
        return conoServ.getExperiencia();
    }

    @PostMapping ("/Crear/Experiencia")
    public void updateExperiencia(@RequestBody Experiencia cono){
        
        conoServ.updateExperiencia(cono);        
    }
    
    @DeleteMapping("/Borrar/Experiencia/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        
        conoServ.deleteExperiencia(id);
    }
}

