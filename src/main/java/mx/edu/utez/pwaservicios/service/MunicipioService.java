package mx.edu.utez.pwaservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.pwaservicios.entity.Municipio;
import mx.edu.utez.pwaservicios.repository.IMunicipioRepository;

@Service
public class MunicipioService {
    
    @Autowired
    private IMunicipioRepository municipioRepository;

    public List<Municipio> findAll() {
        return municipioRepository.findAll();
    }

    public Municipio findById(int id) {
        return municipioRepository.findById(id).get();
    }

    public boolean save(Municipio obj) {
        boolean flag = false;
        Municipio tmp = municipioRepository.save(obj);
        if (tmp != null) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        Municipio tmp = findById(id);
        if (tmp != null) {
            municipioRepository.delete(tmp);
            flag = true;
        }
        return flag;
    }

}
