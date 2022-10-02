package mx.edu.utez.pwaservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.pwaservicios.entity.CategoriaAlimentos;

public interface ICategoriaAlimentosRepository extends JpaRepository<CategoriaAlimentos, Integer> {
    
}