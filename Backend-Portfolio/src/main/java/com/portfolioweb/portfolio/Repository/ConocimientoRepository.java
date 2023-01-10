package com.portfolioweb.portfolio.Repository;

import com.portfolioweb.portfolio.Entity.Conocimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConocimientoRepository extends JpaRepository<Conocimiento, Long> {
    
}
