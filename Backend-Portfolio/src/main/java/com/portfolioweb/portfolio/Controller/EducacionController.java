package com.portfolioweb.portfolio.Controller;

import com.portfolioweb.portfolio.Entity.Educacion;
import com.portfolioweb.portfolio.Interface.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService EduServ;
    
    @GetMapping ("/Educacion")
    @ResponseBody
    public List<Educacion> getEducacion(){
        
        return EduServ.getEducacion();
    }

    @PostMapping ("/Educacion/Crear")
    public void createEducacion(@RequestBody Educacion Edu){
        
        EduServ.createEducacion(Edu);        
    }
    
    @PutMapping ("/Educacion/Actualizar")
    public void updateEducacion(@RequestBody Educacion Edu){
        
        EduServ.updateEducacion(Edu);        
    }
    
    @DeleteMapping("/Educacion/Borrar/{id}")
    public void deleteEducacion(@PathVariable Long id){
        
        EduServ.deleteEducacion(id);
    }
}
