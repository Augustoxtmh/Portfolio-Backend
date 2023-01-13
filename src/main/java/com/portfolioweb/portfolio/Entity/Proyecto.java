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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @NotNull
    private String Titulo;
    
    @NotNull    
    private String Descripcion;
    
    @NotNull    
    private String Url;
    
    
    public void Proyecto(){
        
    }
    
    public void Proyecto(Long id, String titulo, 
            String descr, String url){
        
        this.Id = id;
        this.Titulo = titulo;
        this.Descripcion = descr;
        this.Url = url;
    }
    
}
