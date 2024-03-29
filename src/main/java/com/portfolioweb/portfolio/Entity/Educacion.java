package com.portfolioweb.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @NotNull
    private String Titulo;
    
    @NotNull    
    private String Descripcion;
    
    @NotNull
    private String Fecha;
    
    @NotNull    
    private String Url;
    
    public void Educacion(){
        
    }
    
    public void Educacion(Long id, String titulo, 
            String descr, String fecha, String url){
        
        this.Id = id;
        this.Titulo = titulo;
        this.Descripcion = descr;
        this.Fecha = fecha;
        this.Url = url;
    }
    
}
