package mx.edu.utez.pwaservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.pwaservicios.entity.CategoriaAlimentos;
import mx.edu.utez.pwaservicios.service.CategoriaAlimentosService;

@RestController
@RequestMapping(value = "/categoriaAlimentos")
public class CategoriaAlimentosController {

    @Autowired
    private CategoriaAlimentosService categoriaAlimentosService;

    @RequestMapping(value = "/list", method = { RequestMethod.GET })
    public List<CategoriaAlimentos> findAll() {
        return categoriaAlimentosService.findAll();
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public CategoriaAlimentos findById(@PathVariable("id") int id) {
        return categoriaAlimentosService.findById(id);
    }

    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public boolean save(@RequestBody CategoriaAlimentos obj) {
        return categoriaAlimentosService.save(obj);
    }

    @RequestMapping(value = "/delete/{id}", method = { RequestMethod.GET })
    public boolean delete(@PathVariable("id") int id) {
        return categoriaAlimentosService.delete(id);
    }
    
}