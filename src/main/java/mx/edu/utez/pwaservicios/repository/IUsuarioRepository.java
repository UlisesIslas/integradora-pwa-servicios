package mx.edu.utez.pwaservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.pwaservicios.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
