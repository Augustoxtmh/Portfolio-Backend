package com.portfolioweb.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Presentacion {
    
    @NotNull
    @Id
    private String nombre;
    
    @NotNull    
    private String descripcion;
    
    @NotNull    
    private String Url_Img;
    
    @NotNull    
    private String Url_Banner;
    
}
