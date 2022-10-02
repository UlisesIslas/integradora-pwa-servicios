package mx.edu.utez.pwaservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.pwaservicios.entity.BancoAlimentos;
import mx.edu.utez.pwaservicios.repository.IBancoAlimentosRepository;

@Service
public class BancoAlimentosService {
    
    @Autowired
    private IBancoAlimentosRepository bancoAlimentosRepository;

    public List<BancoAlimentos> findAll() {
        return bancoAlimentosRepository.findAll();
    }

    public BancoAlimentos findById(int id) {
        return bancoAlimentosRepository.findById(id).get();
    }

    public boolean save(BancoAlimentos obj) {
        boolean flag = false;
        BancoAlimentos tmp = bancoAlimentosRepository.save(obj);
        if (tmp != null) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        BancoAlimentos tmp = findById(id);
        if (tmp != null) {
            bancoAlimentosRepository.delete(tmp);
            flag = true;
        }
        return flag;
    }

}
