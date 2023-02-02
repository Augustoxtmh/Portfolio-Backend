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
public class Experiencia {
    
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
    
    public void Experiencia(){
        
    }
    
    public void Experiencia(Long id, String titulo,
            String fecha, String descr, String url){
        
        this.Id = id;
        this.Titulo = titulo;
        this.Fecha = fecha;
        this.Descripcion = descr;
        this.Url = url;
    }
    
}
