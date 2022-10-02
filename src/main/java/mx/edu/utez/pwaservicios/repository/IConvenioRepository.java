package mx.edu.utez.pwaservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.pwaservicios.entity.Convenio;

public interface IConvenioRepository extends JpaRepository<Convenio, Integer> {
    
}
