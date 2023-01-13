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
public class Conocimiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @NotNull
    private String conocimiento;
    
    @NotNull
    private int porcentaje;

    public void Conocimiento(){
        
    }
    
    public void Conocimiento(Long id, String conocimiento, 
            int porcentaje){
        
        this.Id = id;
        this.conocimiento = conocimiento;
        this.porcentaje = porcentaje;
    }
}