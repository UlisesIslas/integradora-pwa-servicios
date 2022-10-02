package mx.edu.utez.pwaservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.pwaservicios.entity.CategoriaAlimentos;
import mx.edu.utez.pwaservicios.repository.ICategoriaAlimentosRepository;

@Service
public class CategoriaAlimentosService {

    @Autowired
    private ICategoriaAlimentosRepository categoriaAlimentosRepository;

    public List<CategoriaAlimentos> findAll() {
        return categoriaAlimentosRepository.findAll();
    }

    public CategoriaAlimentos findById(int id) {
        return categoriaAlimentosRepository.findById(id).get();
    }

    public boolean save(CategoriaAlimentos obj) {
        boolean flag = false;
        CategoriaAlimentos tmp = categoriaAlimentosRepository.save(obj);
        if (tmp != null) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        CategoriaAlimentos tmp = findById(id);
        if (tmp != null) {
            categoriaAlimentosRepository.delete(tmp);
            flag = true;
        }
        return flag;
    }
    
}