package com.portfolioweb.portfolio.Controller;

import com.portfolioweb.portfolio.Entity.Experiencia;
import com.portfolioweb.portfolio.Interface.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@CrossOrigin (origins = {"https://portfolio-b4d4b.web.app"})
public class ExperienciaController { 
    @Autowired
    private IExperienciaService expServ;
    
    @GetMapping ("/Experiencia")
    @ResponseBody
    public List<Experiencia> getExperiencia(){
        
        return expServ.getExperiencia();
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/Experiencia/Crear")
    public void createExperiencia(@RequestBody Experiencia exp){
        
        expServ.createExperiencia(exp);        
    }
 
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/Experiencia/Actualizar")
    public void updateExperiencia(@RequestBody Experiencia exp){
        
        expServ.updateExperiencia(exp);        
    }

    @PreAuthorize("hasRole('ADMIN')")    
    @DeleteMapping("/Experiencia/Borrar/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        
        expServ.deleteExperiencia(id);
    }
}

