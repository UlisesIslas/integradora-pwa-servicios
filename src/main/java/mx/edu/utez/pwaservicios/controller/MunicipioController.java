package mx.edu.utez.pwaservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.pwaservicios.entity.Municipio;
import mx.edu.utez.pwaservicios.service.MunicipioService;

@RestController
@RequestMapping(value = "/municipio")
public class MunicipioController {

    @Autowired
    private MunicipioService municipioService;
    
    @RequestMapping(value = "/list", method = { RequestMethod.GET })
    public List<Municipio> findAll() {
        return municipioService.findAll();
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public Municipio findById(@PathVariable("id") int id) {
        return municipioService.findById(id);
    }

    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public boolean save(@RequestBody Municipio obj) {
        return municipioService.save(obj);
    }

    @RequestMapping(value = "/delete/{id}", method = { RequestMethod.GET })
    public boolean delete(@PathVariable("id") int id) {
        return municipioService.delete(id);
    }

}
