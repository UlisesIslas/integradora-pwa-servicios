package mx.edu.utez.pwaservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.pwaservicios.entity.CadenaComercial;
import mx.edu.utez.pwaservicios.service.CadenaComercialService;

@RestController
@RequestMapping(value = "/CadenaComercial")
public class CadenaComercialController {

    @Autowired
    private CadenaComercialService CadenaComercialService;

    @RequestMapping(value = "/list", method = { RequestMethod.GET })
    public List<CadenaComercial> findAll() {
        return CadenaComercialService.findAll();
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public CadenaComercial findById(@PathVariable("id") int id) {
        return CadenaComercialService.findById(id);
    }

    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public boolean save(@RequestBody CadenaComercial obj) {
        return CadenaComercialService.save(obj);
    }

    @RequestMapping(value = "/delete/{id}", method = { RequestMethod.GET })
    public boolean delete(@PathVariable("id") int id) {
        return CadenaComercialService.delete(id);
    }
    
}