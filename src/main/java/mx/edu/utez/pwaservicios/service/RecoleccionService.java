package mx.edu.utez.pwaservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.pwaservicios.entity.Recoleccion;
import mx.edu.utez.pwaservicios.repository.IRecoleccionRepository;

@Service
public class RecoleccionService {

    @Autowired
    private IRecoleccionRepository recoleccionRepository;

    public List<Recoleccion> findAll() {
        return recoleccionRepository.findAll();
    }

    public Recoleccion findById(int id) {
        return recoleccionRepository.findById(id).get();
    }

    public boolean save(Recoleccion obj) {
        boolean flag = false;
        Recoleccion tmp = recoleccionRepository.save(obj);
        if (tmp != null) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        Recoleccion tmp = findById(id);
        if (tmp != null) {
            recoleccionRepository.delete(tmp);
            flag = true;
        }
        return flag;
    }
    
}