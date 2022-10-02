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
@Table(name = "almacen")
public class Almacen implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cadena_comercial", nullable = false)
    private CadenaComercial cadenaComercial;

    @ManyToOne
    @JoinColumn(name = "alimentos", nullable = false)
    private Alimentos alimentos;

    public Almacen(){
        this.estatus = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CadenaComercial getCadenaComercial() {
        return cadenaComercial;
    }

    public void setCadenaComercial(CadenaComercial cadenaComercial) {
        this.cadenaComercial = cadenaComercial;
    }

    public Alimentos getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(Alimentos alimentos) {
        this.alimentos = alimentos;
    }
    
}