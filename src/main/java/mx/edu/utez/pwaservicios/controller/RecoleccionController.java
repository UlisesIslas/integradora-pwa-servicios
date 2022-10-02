package mx.edu.utez.pwaservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.pwaservicios.entity.Recoleccion;
import mx.edu.utez.pwaservicios.service.RecoleccionService;

@RestController
@RequestMapping(value = "/recoleccion")
public class RecoleccionController {

    @Autowired
    private RecoleccionService recoleccionService;

    @RequestMapping(value = "/list", method = { RequestMethod.GET })
    public List<Recoleccion> findAll() {
        return recoleccionService.findAll();
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public Recoleccion findById(@PathVariable("id") int id) {
        return recoleccionService.findById(id);
    }

    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public boolean save(@RequestBody Recoleccion obj) {
        return recoleccionService.save(obj);
    }

    @RequestMapping(value = "/delete/{id}", method = { RequestMethod.GET })
    public boolean delete(@PathVariable("id") int id) {
        return recoleccionService.delete(id);
    }
    
}