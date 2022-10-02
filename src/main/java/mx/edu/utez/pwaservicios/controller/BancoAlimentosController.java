package mx.edu.utez.pwaservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.pwaservicios.entity.BancoAlimentos;
import mx.edu.utez.pwaservicios.service.BancoAlimentosService;

@RestController
@RequestMapping(value = "/banco")
public class BancoAlimentosController {

    @Autowired
    private BancoAlimentosService bancoAlimentosService;

    @RequestMapping(value = "/list", method = { RequestMethod.GET })
    public List<BancoAlimentos> findAll() {
        return bancoAlimentosService.findAll();
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public BancoAlimentos findById(@PathVariable("id") int id) {
        return bancoAlimentosService.findById(id);
    }

    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public boolean save(@RequestBody BancoAlimentos obj) {
        return bancoAlimentosService.save(obj);
    }

    @RequestMapping(value = "/delete/{id}", method = { RequestMethod.GET })
    public boolean delete(@PathVariable("id") int id) {
        return bancoAlimentosService.delete(id);
    }
    
}
