package mx.edu.utez.pwaservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.pwaservicios.entity.Convenio;
import mx.edu.utez.pwaservicios.repository.IConvenioRepository;

@Service
public class ConvenioService {

    @Autowired
    private IConvenioRepository convenioRepository;

    public List<Convenio> findAll() {
        return convenioRepository.findAll();
    }

    public Convenio findById(int id) {
        return convenioRepository.findById(id).get();
    }

    public boolean save(Convenio obj) {
        boolean flag = false;
        Convenio tmp = convenioRepository.save(obj);
        if (tmp != null) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        Convenio tmp = findById(id);
        if (tmp != null) {
            convenioRepository.delete(tmp);
            flag = true;
        }
        return flag;
    }
    
}
