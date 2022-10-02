package mx.edu.utez.pwaservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.pwaservicios.entity.Recoleccion;

public interface IRecoleccionRepository extends JpaRepository<Recoleccion, Integer> {
    
}