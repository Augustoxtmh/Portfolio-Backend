package com.portfolioweb.portfolio.Security.Repository;

import com.portfolioweb.portfolio.Security.Entity.Rol;
import com.portfolioweb.portfolio.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
        Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
