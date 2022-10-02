package mx.edu.utez.pwaservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.pwaservicios.entity.Municipio;

public interface IMunicipioRepository extends JpaRepository<Municipio, Integer> {
    
}
