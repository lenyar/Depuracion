/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "cuadre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuadre.findAll", query = "SELECT c FROM Cuadre c"),
    @NamedQuery(name = "Cuadre.findById", query = "SELECT c FROM Cuadre c WHERE c.id = :id"),
    @NamedQuery(name = "Cuadre.findByMoneda", query = "SELECT c FROM Cuadre c WHERE c.moneda = :moneda"),
    @NamedQuery(name = "Cuadre.findByBalance", query = "SELECT c FROM Cuadre c WHERE c.balance = :balance"),
    @NamedQuery(name = "Cuadre.findByFecha", query = "SELECT c FROM Cuadre c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Cuadre.findByEstado", query = "SELECT c FROM Cuadre c WHERE c.estado = :estado")})
public class Cuadre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moneda")
    private short moneda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "balance")
    private BigDecimal balance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    private int fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_modulo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Modulo idModulo;

    public Cuadre() {
    }

    public Cuadre(Integer id) {
        this.id = id;
    }

    public Cuadre(Integer id, short moneda, BigDecimal balance, int fecha, String estado) {
        this.id = id;
        this.moneda = moneda;
        this.balance = balance;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getMoneda() {
        return moneda;
    }

    public void setMoneda(short moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof Cuadre)) {
            return false;
        }
        Cuadre other = (Cuadre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.Cuadre[ id=" + id + " ]";
    }
    
}
