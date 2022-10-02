package mx.edu.utez.pwaservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.pwaservicios.entity.Almacen;

public interface IAlmacenRepository extends JpaRepository<Almacen, Integer> {
    
}