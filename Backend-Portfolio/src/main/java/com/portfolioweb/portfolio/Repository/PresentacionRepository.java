package com.portfolioweb.portfolio.Repository;

import com.portfolioweb.portfolio.Entity.Presentacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentacionRepository extends JpaRepository<Presentacion, Long>{
    
}
