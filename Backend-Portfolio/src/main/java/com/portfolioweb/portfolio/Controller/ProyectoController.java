package com.portfolioweb.portfolio.Controller;

import com.portfolioweb.portfolio.Entity.Proyecto;
import com.portfolioweb.portfolio.Interface.IProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class ProyectoController {
    
    @Autowired
    private IProyectoService ProyServ;
    
    @GetMapping ("/Proyecto")
    @ResponseBody
    public List<Proyecto> getProyecto(){
        
        return ProyServ.getProyecto();
    }

    @PostMapping ("/Proyecto/Crear")
    public void createProyecto(@RequestBody Proyecto proy){
        
        ProyServ.createProyecto(proy);        
    }
    
    @PutMapping ("/Proyecto/Actualizar")
    public void updateProyecto(@RequestBody Proyecto proy){
        
        ProyServ.updateProyecto(proy);        
    }
    
    @DeleteMapping("/Proyecto/Borrar/{id}")
    public void deleteProyecto(@PathVariable Long id){
        
        ProyServ.deleteProyecto(id);
    }
}

