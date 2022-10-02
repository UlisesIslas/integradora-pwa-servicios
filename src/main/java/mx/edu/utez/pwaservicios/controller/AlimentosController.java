package mx.edu.utez.pwaservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.pwaservicios.entity.Alimentos;
import mx.edu.utez.pwaservicios.service.AlimentosService;

@RestController
@RequestMapping(value = "/alimentos")
public class AlimentosController {

    @Autowired
    private AlimentosService alimentosServise;

    @RequestMapping(value = "/list", method = { RequestMethod.GET })
    public List<Alimentos> findAll() {
        return alimentosServise.findAll();
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public Alimentos findById(@PathVariable("id") int id) {
        return alimentosServise.findById(id);
    }

    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public boolean save(@RequestBody Alimentos obj) {
        return alimentosServise.save(obj);
    }

    @RequestMapping(value = "/delete/{id}", method = { RequestMethod.GET })
    public boolean delete(@PathVariable("id") int id) {
        return alimentosServise.delete(id);
    }
    
}