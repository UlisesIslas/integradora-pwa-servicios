package mx.edu.utez.pwaservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.pwaservicios.entity.CadenaComercial;

public interface ICadenaComercial extends JpaRepository<CadenaComercial, Integer> {
    
}
