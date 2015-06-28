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
@Table(name = "rechazado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rechazado.findAll", query = "SELECT r FROM Rechazado r"),
    @NamedQuery(name = "Rechazado.findById", query = "SELECT r FROM Rechazado r WHERE r.id = :id"),
    @NamedQuery(name = "Rechazado.findByOficina", query = "SELECT r FROM Rechazado r WHERE r.oficina = :oficina"),
    @NamedQuery(name = "Rechazado.findByFecha", query = "SELECT r FROM Rechazado r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "Rechazado.findByBoletin", query = "SELECT r FROM Rechazado r WHERE r.boletin = :boletin"),
    @NamedQuery(name = "Rechazado.findBySenalAutomatica", query = "SELECT r FROM Rechazado r WHERE r.senalAutomatica = :senalAutomatica"),
    @NamedQuery(name = "Rechazado.findBySecuencia", query = "SELECT r FROM Rechazado r WHERE r.secuencia = :secuencia"),
    @NamedQuery(name = "Rechazado.findByDocumento", query = "SELECT r FROM Rechazado r WHERE r.documento = :documento"),
    @NamedQuery(name = "Rechazado.findByCuenta", query = "SELECT r FROM Rechazado r WHERE r.cuenta = :cuenta"),
    @NamedQuery(name = "Rechazado.findByTercero", query = "SELECT r FROM Rechazado r WHERE r.tercero = :tercero"),
    @NamedQuery(name = "Rechazado.findByMoneda", query = "SELECT r FROM Rechazado r WHERE r.moneda = :moneda"),
    @NamedQuery(name = "Rechazado.findByDepartamento", query = "SELECT r FROM Rechazado r WHERE r.departamento = :departamento"),
    @NamedQuery(name = "Rechazado.findByOficinaReceptora", query = "SELECT r FROM Rechazado r WHERE r.oficinaReceptora = :oficinaReceptora"),
    @NamedQuery(name = "Rechazado.findByOficinaTerminal", query = "SELECT r FROM Rechazado r WHERE r.oficinaTerminal = :oficinaTerminal"),
    @NamedQuery(name = "Rechazado.findByForma", query = "SELECT r FROM Rechazado r WHERE r.forma = :forma"),
    @NamedQuery(name = "Rechazado.findByTipoInter", query = "SELECT r FROM Rechazado r WHERE r.tipoInter = :tipoInter"),
    @NamedQuery(name = "Rechazado.findByTipoRegistro", query = "SELECT r FROM Rechazado r WHERE r.tipoRegistro = :tipoRegistro"),
    @NamedQuery(name = "Rechazado.findByTipoImputacion", query = "SELECT r FROM Rechazado r WHERE r.tipoImputacion = :tipoImputacion"),
    @NamedQuery(name = "Rechazado.findByMonto", query = "SELECT r FROM Rechazado r WHERE r.monto = :monto"),
    @NamedQuery(name = "Rechazado.findBySenalConciliacion", query = "SELECT r FROM Rechazado r WHERE r.senalConciliacion = :senalConciliacion"),
    @NamedQuery(name = "Rechazado.findBySenalComprobante", query = "SELECT r FROM Rechazado r WHERE r.senalComprobante = :senalComprobante"),
    @NamedQuery(name = "Rechazado.findBySenalInter", query = "SELECT r FROM Rechazado r WHERE r.senalInter = :senalInter"),
    @NamedQuery(name = "Rechazado.findByDetalle", query = "SELECT r FROM Rechazado r WHERE r.detalle = :detalle"),
    @NamedQuery(name = "Rechazado.findByEstado", query = "SELECT r FROM Rechazado r WHERE r.estado = :estado")})
public class Rechazado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oficina")
    private short oficina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    private int fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "boletin")
    private short boletin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "senal_automatica")
    private short senalAutomatica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "secuencia")
    private short secuencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "documento")
    private long documento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cuenta")
    private String cuenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "tercero")
    private String tercero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moneda")
    private short moneda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "departamento")
    private short departamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oficina_receptora")
    private short oficinaReceptora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oficina_terminal")
    private short oficinaTerminal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "forma")
    private String forma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "tipo_inter")
    private String tipoInter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_registro")
    private short tipoRegistro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "tipo_imputacion")
    private String tipoImputacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto")
    private BigDecimal monto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "senal_conciliacion")
    private short senalConciliacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "senal_comprobante")
    private short senalComprobante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "senal_inter")
    private short senalInter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "detalle")
    private String detalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_archivo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Archivo idArchivo;

    public Rechazado() {
    }

    public Rechazado(Integer id) {
        this.id = id;
    }

    public Rechazado(Integer id, short oficina, int fecha, short boletin, short senalAutomatica, short secuencia, long documento, String cuenta, String tercero, short moneda, short departamento, short oficinaReceptora, short oficinaTerminal, String forma, String tipoInter, short tipoRegistro, String tipoImputacion, BigDecimal monto, short senalConciliacion, short senalComprobante, short senalInter, String detalle, String estado) {
        this.id = id;
        this.oficina = oficina;
        this.fecha = fecha;
        this.boletin = boletin;
        this.senalAutomatica = senalAutomatica;
        this.secuencia = secuencia;
        this.documento = documento;
        this.cuenta = cuenta;
        this.tercero = tercero;
        this.moneda = moneda;
        this.departamento = departamento;
        this.oficinaReceptora = oficinaReceptora;
        this.oficinaTerminal = oficinaTerminal;
        this.forma = forma;
        this.tipoInter = tipoInter;
        this.tipoRegistro = tipoRegistro;
        this.tipoImputacion = tipoImputacion;
        this.monto = monto;
        this.senalConciliacion = senalConciliacion;
        this.senalComprobante = senalComprobante;
        this.senalInter = senalInter;
        this.detalle = detalle;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getOficina() {
        return oficina;
    }

    public void setOficina(short oficina) {
        this.oficina = oficina;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public short getBoletin() {
        return boletin;
    }

    public void setBoletin(short boletin) {
        this.boletin = boletin;
    }

    public short getSenalAutomatica() {
        return senalAutomatica;
    }

    public void setSenalAutomatica(short senalAutomatica) {
        this.senalAutomatica = senalAutomatica;
    }

    public short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(short secuencia) {
        this.secuencia = secuencia;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTercero() {
        return tercero;
    }

    public void setTercero(String tercero) {
        this.tercero = tercero;
    }

    public short getMoneda() {
        return moneda;
    }

    public void setMoneda(short moneda) {
        this.moneda = moneda;
    }

    public short getDepartamento() {
        return departamento;
    }

    public void setDepartamento(short departamento) {
        this.departamento = departamento;
    }

    public short getOficinaReceptora() {
        return oficinaReceptora;
    }

    public void setOficinaReceptora(short oficinaReceptora) {
        this.oficinaReceptora = oficinaReceptora;
    }

    public short getOficinaTerminal() {
        return oficinaTerminal;
    }

    public void setOficinaTerminal(short oficinaTerminal) {
        this.oficinaTerminal = oficinaTerminal;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getTipoInter() {
        return tipoInter;
    }

    public void setTipoInter(String tipoInter) {
        this.tipoInter = tipoInter;
    }

    public short getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(short tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getTipoImputacion() {
        return tipoImputacion;
    }

    public void setTipoImputacion(String tipoImputacion) {
        this.tipoImputacion = tipoImputacion;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public short getSenalConciliacion() {
        return senalConciliacion;
    }

    public void setSenalConciliacion(short senalConciliacion) {
        this.senalConciliacion = senalConciliacion;
    }

    public short getSenalComprobante() {
        return senalComprobante;
    }

    public void setSenalComprobante(short senalComprobante) {
        this.senalComprobante = senalComprobante;
    }

    public short getSenalInter() {
        return senalInter;
    }

    public void setSenalInter(short senalInter) {
        this.senalInter = senalInter;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
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
        if (!(object instanceof Rechazado)) {
            return false;
        }
        Rechazado other = (Rechazado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.Rechazado[ id=" + id + " ]";
    }
    
}
