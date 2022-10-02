package mx.edu.utez.pwaservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.pwaservicios.entity.BancoAlimentos;

public interface IBancoAlimentosRepository extends JpaRepository<BancoAlimentos, Integer> {
    
}
