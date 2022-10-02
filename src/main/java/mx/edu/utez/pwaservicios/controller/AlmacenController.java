package mx.edu.utez.pwaservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.pwaservicios.entity.Almacen;
import mx.edu.utez.pwaservicios.service.AlmacenService;

@RestController
@RequestMapping(value = "/almacen")
public class AlmacenController {

    @Autowired
    private AlmacenService almacenService;

    @RequestMapping(value = "/list", method = { RequestMethod.GET })
    public List<Almacen> findAll() {
        return almacenService.findAll();
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public Almacen findById(@PathVariable("id") int id) {
        return almacenService.findById(id);
    }

    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public boolean save(@RequestBody Almacen obj) {
        return almacenService.save(obj);
    }

    @RequestMapping(value = "/delete/{id}", method = { RequestMethod.GET })
    public boolean delete(@PathVariable("id") int id) {
        return almacenService.delete(id);
    }
    
}