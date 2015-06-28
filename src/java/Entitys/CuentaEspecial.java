/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RVelasco
 */
@Entity
@Table(name = "cuenta_especial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CuentaEspecial.findAll", query = "SELECT c FROM CuentaEspecial c"),
    @NamedQuery(name = "CuentaEspecial.findById", query = "SELECT c FROM CuentaEspecial c WHERE c.id = :id"),
    @NamedQuery(name = "CuentaEspecial.findByCuenta", query = "SELECT c FROM CuentaEspecial c WHERE c.cuenta = :cuenta"),
    @NamedQuery(name = "CuentaEspecial.findByDescripcion", query = "SELECT c FROM CuentaEspecial c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CuentaEspecial.findByFechaCreacion", query = "SELECT c FROM CuentaEspecial c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CuentaEspecial.findByRevaluacion", query = "SELECT c FROM CuentaEspecial c WHERE c.revaluacion = :revaluacion"),
    @NamedQuery(name = "CuentaEspecial.findByMoneda", query = "SELECT c FROM CuentaEspecial c WHERE c.moneda = :moneda"),
    @NamedQuery(name = "CuentaEspecial.findByExcluir", query = "SELECT c FROM CuentaEspecial c WHERE c.excluir = :excluir"),
    @NamedQuery(name = "CuentaEspecial.findByEstado", query = "SELECT c FROM CuentaEspecial c WHERE c.estado = :estado")})
public class CuentaEspecial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cuenta")
    private String cuenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    private int fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "revaluacion")
    private String revaluacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moneda")
    private short moneda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "excluir")
    private String excluir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_archivo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Archivo idArchivo;

    public CuentaEspecial() {
    }

    public CuentaEspecial(Integer id) {
        this.id = id;
    }

    public CuentaEspecial(Integer id, String cuenta, String descripcion, int fechaCreacion, String revaluacion, short moneda, String excluir, String estado) {
        this.id = id;
        this.cuenta = cuenta;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.revaluacion = revaluacion;
        this.moneda = moneda;
        this.excluir = excluir;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getRevaluacion() {
        return revaluacion;
    }

    public void setRevaluacion(String revaluacion) {
        this.revaluacion = revaluacion;
    }

    public short getMoneda() {
        return moneda;
    }

    public void setMoneda(short moneda) {
        this.moneda = moneda;
    }

    public String getExcluir() {
        return excluir;
    }

    public void setExcluir(String excluir) {
        this.excluir = excluir;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Archivo getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(Archivo idArchivo) {
        this.idArchivo = idArchivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentaEspecial)) {
            return false;
        }
        CuentaEspecial other = (CuentaEspecial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.CuentaEspecial[ id=" + id + " ]";
    }
    
}
