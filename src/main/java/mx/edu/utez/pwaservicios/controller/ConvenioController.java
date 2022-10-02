package mx.edu.utez.pwaservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.pwaservicios.entity.Convenio;
import mx.edu.utez.pwaservicios.service.ConvenioService;

@RestController
@RequestMapping(value = "/convenio")
public class ConvenioController {

    @Autowired
    private ConvenioService convenioService;

    @RequestMapping(value = "/list", method = { RequestMethod.GET })
    public List<Convenio> findAll() {
        return convenioService.findAll();
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public Convenio findById(@PathVariable("id") int id) {
        return convenioService.findById(id);
    }

    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public boolean save(@RequestBody Convenio obj) {
        return convenioService.save(obj);
    }

    @RequestMapping(value = "/delete/{id}", method = { RequestMethod.GET })
    public boolean delete(@PathVariable("id") int id) {
        return convenioService.delete(id);
    }
    
}
