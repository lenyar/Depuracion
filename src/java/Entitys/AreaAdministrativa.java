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
@Table(name = "area_administrativa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AreaAdministrativa.findAll", query = "SELECT a FROM AreaAdministrativa a"),
    @NamedQuery(name = "AreaAdministrativa.findById", query = "SELECT a FROM AreaAdministrativa a WHERE a.id = :id"),
    @NamedQuery(name = "AreaAdministrativa.findByCodigo", query = "SELECT a FROM AreaAdministrativa a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "AreaAdministrativa.findByDescripcion", query = "SELECT a FROM AreaAdministrativa a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "AreaAdministrativa.findByFechaCreacion", query = "SELECT a FROM AreaAdministrativa a WHERE a.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "AreaAdministrativa.findByEstado", query = "SELECT a FROM AreaAdministrativa a WHERE a.estado = :estado")})
public class AreaAdministrativa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private int codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    private int fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAreaAdministrativa")
    private Collection<EquivAreaAdministrativa> equivAreaAdministrativaCollection;

    public AreaAdministrativa() {
    }

    public AreaAdministrativa(Integer id) {
        this.id = id;
    }

    public AreaAdministrativa(Integer id, int codigo, String descripcion, int fechaCreacion, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<EquivAreaAdministrativa> getEquivAreaAdministrativaCollection() {
        return equivAreaAdministrativaCollection;
    }

    public void setEquivAreaAdministrativaCollection(Collection<EquivAreaAdministrativa> equivAreaAdministrativaCollection) {
        this.equivAreaAdministrativaCollection = equivAreaAdministrativaCollection;
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
        if (!(object instanceof AreaAdministrativa)) {
            return false;
        }
        AreaAdministrativa other = (AreaAdministrativa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.AreaAdministrativa[ id=" + id + " ]";
    }
    
}
