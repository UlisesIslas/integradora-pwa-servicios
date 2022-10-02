package mx.edu.utez.pwaservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.pwaservicios.entity.Alimentos;
import mx.edu.utez.pwaservicios.repository.IAlimentosRepository;

@Service
public class AlimentosService {

    @Autowired
    private IAlimentosRepository alimentosRepository;

    public List<Alimentos> findAll() {
        return alimentosRepository.findAll();
    }

    public Alimentos findById(int id) {
        return alimentosRepository.findById(id).get();
    }

    public boolean save(Alimentos obj) {
        boolean flag = false;
        Alimentos tmp = alimentosRepository.save(obj);
        if (tmp != null) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        Alimentos tmp = findById(id);
        if (tmp != null) {
            alimentosRepository.delete(tmp);
            flag = true;
        }
        return flag;
    }
    
}