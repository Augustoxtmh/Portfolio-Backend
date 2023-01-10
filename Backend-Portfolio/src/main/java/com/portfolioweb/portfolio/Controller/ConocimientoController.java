package com.portfolioweb.portfolio.Controller;

import com.portfolioweb.portfolio.Entity.Conocimiento;
import com.portfolioweb.portfolio.Interface.IConocimientoService;
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
public class ConocimientoController {
    
    @Autowired
    private IConocimientoService conoServ;
    
    @GetMapping ("/Conocimiento")
    @ResponseBody
    public List<Conocimiento> getConocimientos(){
        
        return conoServ.getConocimientos();
    }

    @PostMapping ("/Crear/Conocimiento")
    public void updateConocimiento(@RequestBody Conocimiento cono){
        
        conoServ.updateConocimiento(cono);        
    }
    
    @DeleteMapping("/Borrar/Conocimiento/{id}")
    public void deleteConocimiento(@PathVariable Long id){
        
        conoServ.deleteConocimiento(id);
    }
}
