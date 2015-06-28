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
@Table(name = "aceptado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aceptado.findAll", query = "SELECT a FROM Aceptado a"),
    @NamedQuery(name = "Aceptado.findById", query = "SELECT a FROM Aceptado a WHERE a.id = :id"),
    @NamedQuery(name = "Aceptado.findByOficina", query = "SELECT a FROM Aceptado a WHERE a.oficina = :oficina"),
    @NamedQuery(name = "Aceptado.findByFecha", query = "SELECT a FROM Aceptado a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "Aceptado.findByBoletin", query = "SELECT a FROM Aceptado a WHERE a.boletin = :boletin"),
    @NamedQuery(name = "Aceptado.findBySenalAutomatica", query = "SELECT a FROM Aceptado a WHERE a.senalAutomatica = :senalAutomatica"),
    @NamedQuery(name = "Aceptado.findBySecuencia", query = "SELECT a FROM Aceptado a WHERE a.secuencia = :secuencia"),
    @NamedQuery(name = "Aceptado.findByDocumento", query = "SELECT a FROM Aceptado a WHERE a.documento = :documento"),
    @NamedQuery(name = "Aceptado.findByCuenta", query = "SELECT a FROM Aceptado a WHERE a.cuenta = :cuenta"),
    @NamedQuery(name = "Aceptado.findByTercero", query = "SELECT a FROM Aceptado a WHERE a.tercero = :tercero"),
    @NamedQuery(name = "Aceptado.findByMoneda", query = "SELECT a FROM Aceptado a WHERE a.moneda = :moneda"),
    @NamedQuery(name = "Aceptado.findByDepartamento", query = "SELECT a FROM Aceptado a WHERE a.departamento = :departamento"),
    @NamedQuery(name = "Aceptado.findByOficinaReceptora", query = "SELECT a FROM Aceptado a WHERE a.oficinaReceptora = :oficinaReceptora"),
    @NamedQuery(name = "Aceptado.findByOficinaTerminal", query = "SELECT a FROM Aceptado a WHERE a.oficinaTerminal = :oficinaTerminal"),
    @NamedQuery(name = "Aceptado.findByForma", query = "SELECT a FROM Aceptado a WHERE a.forma = :forma"),
    @NamedQuery(name = "Aceptado.findByTipoInter", query = "SELECT a FROM Aceptado a WHERE a.tipoInter = :tipoInter"),
    @NamedQuery(name = "Aceptado.findByTipoRegistro", query = "SELECT a FROM Aceptado a WHERE a.tipoRegistro = :tipoRegistro"),
    @NamedQuery(name = "Aceptado.findByTipoImputacion", query = "SELECT a FROM Aceptado a WHERE a.tipoImputacion = :tipoImputacion"),
    @NamedQuery(name = "Aceptado.findByMonto", query = "SELECT a FROM Aceptado a WHERE a.monto = :monto"),
    @NamedQuery(name = "Aceptado.findBySenalConciliacion", query = "SELECT a FROM Aceptado a WHERE a.senalConciliacion = :senalConciliacion"),
    @NamedQuery(name = "Aceptado.findBySenalComprobante", query = "SELECT a FROM Aceptado a WHERE a.senalComprobante = :senalComprobante"),
    @NamedQuery(name = "Aceptado.findBySenalInter", query = "SELECT a FROM Aceptado a WHERE a.senalInter = :senalInter"),
    @NamedQuery(name = "Aceptado.findByDetalle", query = "SELECT a FROM Aceptado a WHERE a.detalle = :detalle"),
    @NamedQuery(name = "Aceptado.findByEstado", query = "SELECT a FROM Aceptado a WHERE a.estado = :estado")})
public class Aceptado implements Serializable {
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

    public Aceptado() {
    }

    public Aceptado(Integer id) {
        this.id = id;
    }

    public Aceptado(Integer id, short oficina, int fecha, short boletin, short senalAutomatica, short secuencia, long documento, String cuenta, String tercero, short moneda, short departamento, short oficinaReceptora, short oficinaTerminal, String forma, String tipoInter, short tipoRegistro, String tipoImputacion, BigDecimal monto, short senalConciliacion, short senalComprobante, short senalInter, String detalle, String estado) {
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
        if (!(object instanceof Aceptado)) {
            return false;
        }
        Aceptado other = (Aceptado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.Aceptado[ id=" + id + " ]";
    }
    
}
