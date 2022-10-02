package mx.edu.utez.pwaservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.pwaservicios.entity.Almacen;
import mx.edu.utez.pwaservicios.repository.IAlmacenRepository;

@Service
public class AlmacenService {

    @Autowired
    private IAlmacenRepository almacenRepository;

    public List<Almacen> findAll() {
        return almacenRepository.findAll();
    }

    public Almacen findById(int id) {
        return almacenRepository.findById(id).get();
    }

    public boolean save(Almacen obj) {
        boolean flag = false;
        Almacen tmp = almacenRepository.save(obj);
        if (tmp != null) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        Almacen tmp = findById(id);
        if (tmp != null) {
            almacenRepository.delete(tmp);
            flag = true;
        }
        return flag;
    }
    
}