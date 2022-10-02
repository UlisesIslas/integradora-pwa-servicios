package mx.edu.utez.pwaservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.pwaservicios.entity.Alimentos;

public interface IAlimentosRepository extends JpaRepository<Alimentos, Integer> {
    
}