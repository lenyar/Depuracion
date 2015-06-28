/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author RVelasco
 */
@Entity
@Table(name = "archivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Archivo.findAll", query = "SELECT a FROM Archivo a"),
    @NamedQuery(name = "Archivo.findById", query = "SELECT a FROM Archivo a WHERE a.id = :id"),
    @NamedQuery(name = "Archivo.findByNombre", query = "SELECT a FROM Archivo a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Archivo.findByDescripcion", query = "SELECT a FROM Archivo a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Archivo.findByRevaluacion", query = "SELECT a FROM Archivo a WHERE a.revaluacion = :revaluacion"),
    @NamedQuery(name = "Archivo.findByFechaCreacion", query = "SELECT a FROM Archivo a WHERE a.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Archivo.findByValidacion", query = "SELECT a FROM Archivo a WHERE a.validacion = :validacion"),
    @NamedQuery(name = "Archivo.findByFormato", query = "SELECT a FROM Archivo a WHERE a.formato = :formato"),
    @NamedQuery(name = "Archivo.findByEstado", query = "SELECT a FROM Archivo a WHERE a.estado = :estado")})
public class Archivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "revaluacion")
    private String revaluacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    private long fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "validacion")
    private String validacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "formato")
    private String formato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArchivo")
    private Collection<Aceptado> aceptadoCollection;
    @JoinColumn(name = "id_modulo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Modulo idModulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArchivo")
    private Collection<Rechazado> rechazadoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArchivo")
    private Collection<CuentaEspecial> cuentaEspecialCollection;

    public Archivo() {
    }

    public Archivo(Integer id) {
        this.id = id;
    }

    public Archivo(Integer id, String nombre, String descripcion, String revaluacion, long fechaCreacion, String validacion, String formato, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.revaluacion = revaluacion;
        this.fechaCreacion = fechaCreacion;
        this.validacion = validacion;
        this.formato = formato;
        this.estado = estado;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRevaluacion() {
        return revaluacion;
    }

    public void setRevaluacion(String revaluacion) {
        this.revaluacion = revaluacion;
    }

    public long getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(long fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getValidacion() {
        return validacion;
    }

    public void setValidacion(String validacion) {
        this.validacion = validacion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Aceptado> getAceptadoCollection() {
        return aceptadoCollection;
    }

    public void setAceptadoCollection(Collection<Aceptado> aceptadoCollection) {
        this.aceptadoCollection = aceptadoCollection;
    }

    public Modulo getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Modulo idModulo) {
        this.idModulo = idModulo;
    }

    @XmlTransient
    public Collection<Rechazado> getRechazadoCollection() {
        return rechazadoCollection;
    }

    public void setRechazadoCollection(Collection<Rechazado> rechazadoCollection) {
        this.rechazadoCollection = rechazadoCollection;
    }

    @XmlTransient
    public Collection<CuentaEspecial> getCuentaEspecialCollection() {
        return cuentaEspecialCollection;
    }

    public void setCuentaEspecialCollection(Collection<CuentaEspecial> cuentaEspecialCollection) {
        this.cuentaEspecialCollection = cuentaEspecialCollection;
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
        if (!(object instanceof Archivo)) {
            return false;
        }
        Archivo other = (Archivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.Archivo[ id=" + id + " ]";
    }
    
}
