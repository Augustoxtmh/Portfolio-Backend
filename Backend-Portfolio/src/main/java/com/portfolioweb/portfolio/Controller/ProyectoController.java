package com.portfolioweb.portfolio.Controller;

import com.portfolioweb.portfolio.Entity.Proyecto;
import com.portfolioweb.portfolio.Interface.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService conoServ;
    
    @GetMapping ("/Proyecto")
    @ResponseBody
    public List<Proyecto> getProyecto(){
        
        return conoServ.getProyecto();
    }

    @PostMapping ("/Crear/Proyecto")
    public void updateProyecto(@RequestBody Proyecto cono){
        
        conoServ.updateProyecto(cono);        
    }
    
    @DeleteMapping("/Borrar/Proyecto/{id}")
    public void deleteProyecto(@PathVariable Long id){
        
        conoServ.deleteProyecto(id);
    }
}

