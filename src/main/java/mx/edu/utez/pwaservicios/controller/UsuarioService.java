package mx.edu.utez.pwaservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.pwaservicios.entity.Usuario;


@RestController
@RequestMapping(value = "/usuario")
public class UsuarioService {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/list", method = { RequestMethod.GET })
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public Usuario findById(@PathVariable("id") int id) {
        return usuarioService.findById(id);
    }

    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public boolean save(@RequestBody Usuario obj) {
        return usuarioService.save(obj);
    }

    @RequestMapping(value="/delete/{id}", method = { RequestMethod.GET })
    public boolean delete(@PathVariable("id") int id) {
        return usuarioService.delete(id);
    }
    
    
}
