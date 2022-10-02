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
@Table(name = "convenio")
public class Convenio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "municipio", nullable = false)
    private Municipio municipio;

    @ManyToOne
    @JoinColumn(name = "cadena_comercial", nullable = false)
    private CadenaComercial cadenaComercial;

    @Column(name = "estatus", nullable = false)
    private boolean estatus;

    public Convenio() {
        this.estatus = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public CadenaComercial getCadenaComercial() {
        return cadenaComercial;
    }

    public void setCadenaComercial(CadenaComercial cadenaComercial) {
        this.cadenaComercial = cadenaComercial;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
    
}
