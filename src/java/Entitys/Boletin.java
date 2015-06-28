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
@Table(name = "boletin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boletin.findAll", query = "SELECT b FROM Boletin b"),
    @NamedQuery(name = "Boletin.findById", query = "SELECT b FROM Boletin b WHERE b.id = :id"),
    @NamedQuery(name = "Boletin.findByCodigo", query = "SELECT b FROM Boletin b WHERE b.codigo = :codigo"),
    @NamedQuery(name = "Boletin.findByDescripcion", query = "SELECT b FROM Boletin b WHERE b.descripcion = :descripcion"),
    @NamedQuery(name = "Boletin.findByFechaCreacion", query = "SELECT b FROM Boletin b WHERE b.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Boletin.findByEstado", query = "SELECT b FROM Boletin b WHERE b.estado = :estado")})
public class Boletin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private short codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
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
    @JoinColumn(name = "id_modulo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Modulo idModulo;

    public Boletin() {
    }

    public Boletin(Integer id) {
        this.id = id;
    }

    public Boletin(Integer id, short codigo, String descripcion, int fechaCreacion, String estado) {
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

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
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

    public Modulo getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Modulo idModulo) {
        this.idModulo = idModulo;
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
        if (!(object instanceof Boletin)) {
            return false;
        }
        Boletin other = (Boletin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.Boletin[ id=" + id + " ]";
    }
    
}
