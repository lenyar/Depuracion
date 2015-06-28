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
@Table(name = "equiv_area_administrativa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquivAreaAdministrativa.findAll", query = "SELECT e FROM EquivAreaAdministrativa e"),
    @NamedQuery(name = "EquivAreaAdministrativa.findById", query = "SELECT e FROM EquivAreaAdministrativa e WHERE e.id = :id"),
    @NamedQuery(name = "EquivAreaAdministrativa.findByCodigo", query = "SELECT e FROM EquivAreaAdministrativa e WHERE e.codigo = :codigo"),
    @NamedQuery(name = "EquivAreaAdministrativa.findByDescripcion", query = "SELECT e FROM EquivAreaAdministrativa e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "EquivAreaAdministrativa.findByFechaCreacion", query = "SELECT e FROM EquivAreaAdministrativa e WHERE e.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "EquivAreaAdministrativa.findByEstado", query = "SELECT e FROM EquivAreaAdministrativa e WHERE e.estado = :estado")})
public class EquivAreaAdministrativa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private long codigo;
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
    @JoinColumn(name = "id_area_administrativa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AreaAdministrativa idAreaAdministrativa;

    public EquivAreaAdministrativa() {
    }

    public EquivAreaAdministrativa(Integer id) {
        this.id = id;
    }

    public EquivAreaAdministrativa(Integer id, long codigo, String descripcion, int fechaCreacion, String estado) {
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

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
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

    public AreaAdministrativa getIdAreaAdministrativa() {
        return idAreaAdministrativa;
    }

    public void setIdAreaAdministrativa(AreaAdministrativa idAreaAdministrativa) {
        this.idAreaAdministrativa = idAreaAdministrativa;
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
        if (!(object instanceof EquivAreaAdministrativa)) {
            return false;
        }
        EquivAreaAdministrativa other = (EquivAreaAdministrativa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.EquivAreaAdministrativa[ id=" + id + " ]";
    }
    
}
