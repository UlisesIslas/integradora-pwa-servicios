package mx.edu.utez.pwaservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.pwaservicios.entity.Usuario;
import mx.edu.utez.pwaservicios.repository.IUsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(int id) {
        return usuarioRepository.findById(id).get();
    }

    public boolean save(Usuario obj) {
        boolean flag = false;
        Usuario tmp = usuarioRepository.save(obj);
        if (tmp != null) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        Usuario tmp = findById(id);
        if (tmp != null) {
            usuarioRepository.delete(tmp);
            flag = true;
        }
        return flag;
    }
    
}
