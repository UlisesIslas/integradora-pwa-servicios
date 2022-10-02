package mx.edu.utez.pwaservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.pwaservicios.entity.CadenaComercial;
import mx.edu.utez.pwaservicios.repository.ICadenaComercialRepository;

@Service
public class CadenaComercialService {

    @Autowired
    private ICadenaComercialRepository cadenaComercialRepository;

    public List<CadenaComercial> findAll() {
        return cadenaComercialRepository.findAll();
    }

    public CadenaComercial findById(int id) {
        return cadenaComercialRepository.findById(id).get();
    }

    public boolean save(CadenaComercial obj) {
        boolean flag = false;
        CadenaComercial tmp = cadenaComercialRepository.save(obj);
        if (tmp != null) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        CadenaComercial tmp = findById(id);
        if (tmp != null) {
            cadenaComercialRepository.delete(tmp);
            flag = true;
        }
        return flag;
    }
    
}