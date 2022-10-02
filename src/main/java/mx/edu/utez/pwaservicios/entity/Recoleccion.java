package mx.edu.utez.pwaservicios.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recoleccion")
public class Recoleccion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "alimentos", nullable = false)
    private Alimentos alimentos;

    @ManyToOne
    @JoinColumn(name = "usuario", nullable = false)
    private Usuario usuario;

    public Recoleccion(){
        this.estatus = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Alimentos getAlimento() {
        return alimentos;
    }

    public void setAlimentos(Alimentos alimentos) {
        this.alimentos = alimentos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}