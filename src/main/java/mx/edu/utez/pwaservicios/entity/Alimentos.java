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
@Table(name = "alimentos")
public class Alimentos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "categoria_alimentos", nullable = false)
    private CategoriaAlimentos categoriaAlimentos;

    public Alimentos(){
        this.estatus = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaAlimentos getCategoriaAlimentos() {
        return categoriaAlimentos;
    }

    public void setCategoriaAlimentos(CategoriaAlimentos categoriaAlimentos) {
        this.categoriaAlimentos = categoriaAlimentos;
    }

}