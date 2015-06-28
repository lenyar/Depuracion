/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

/**
 *
 * @author RVelasco
 */
public class FormatoArchivo {
    
private String Oficina;
private String Fecha;
private String Boletín;
private String SeñalAutomatización;
private String numeroSecuencia;
private String numeroReferencia;
private String Cuenta;
private String Tercero;
private String Moneda;
private String Departamento;
private String oficinaReceptora;
private String oficinaTerminal;
private String tipoForma;
private String tipoInter;
private String tipoRegistro;
private String tipoimputación;
private String Monto;
private String señalConciliación;
private String señalComprobante;
private String señalInter;
private String detalle;
private String tasa;
private String linea;

//nota: manejar el error out of range
    public FormatoArchivo(String linea) {
        this.linea = linea;
        this.Oficina = linea.substring(0,3); // longitud: 3
        this.Fecha = linea.substring(3,11);  // longitud: 8
        this.Boletín = linea.substring(11,15); // longitud: 4
        this.SeñalAutomatización = linea.substring(15,16); // longitud: 1
        this.numeroSecuencia = linea.substring(16,20);  // longitud: 4
        this.numeroReferencia = linea.substring(20,32); // longitud: 12
        this.Cuenta = linea.substring(32,52); // longitud: 20
        this.Tercero = linea.substring(52,64); // longitud: 12
        this.Moneda = linea.substring(64,66); // longitud: 2
        this.Departamento = linea.substring(66,69); // longitud: 3
        this.oficinaReceptora = linea.substring(69,72); // longitud: 3
        this.oficinaTerminal = linea.substring(72,75); // longitud: 3
        this.tipoForma = linea.substring(75,76); // longitud: 1
        this.tipoInter = linea.substring(76,77); // longitud: 1
        this.tipoRegistro = linea.substring(77,78); // longitud: 1
        this.tipoimputación = linea.substring(78,79); // longitud: 1
        this.Monto = linea.substring(79,95); // longitud: 16
        this.señalConciliación = linea.substring(95,96); // longitud: 1
        this.señalComprobante = linea.substring(96,97); // longitud: 1
        this.señalInter = linea.substring(97,98); // longitud: 1
        this.detalle = linea.substring(98,138); // longitud: 40
        this.tasa = linea.substring(138,141); // longitud: 3
    }




    /**
     * @return the Oficina
     */
    public String getOficina() {
        return Oficina;
    }

    /**
     * @param Oficina the Oficina to set
     */
    public void setOficina(String Oficina) {
        this.Oficina = Oficina;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Boletín
     */
    public String getBoletín() {
        return Boletín;
    }

    /**
     * @param Boletín the Boletín to set
     */
    public void setBoletín(String Boletín) {
        this.Boletín = Boletín;
    }

    /**
     * @return the SeñalAutomatización
     */
    public String getSeñalAutomatización() {
        return SeñalAutomatización;
    }

    /**
     * @param SeñalAutomatización the SeñalAutomatización to set
     */
    public void setSeñalAutomatización(String SeñalAutomatización) {
        this.SeñalAutomatización = SeñalAutomatización;
    }

    /**
     * @return the numeroSecuencia
     */
    public String getNumeroSecuencia() {
        return numeroSecuencia;
    }

    /**
     * @param numeroSecuencia the numeroSecuencia to set
     */
    public void setNumeroSecuencia(String numeroSecuencia) {
        this.numeroSecuencia = numeroSecuencia;
    }

    /**
     * @return the numeroReferencia
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    /**
     * @param numeroReferencia the numeroReferencia to set
     */
    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    /**
     * @return the Cuenta
     */
    public String getCuenta() {
        return Cuenta;
    }

    /**
     * @param Cuenta the Cuenta to set
     */
    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    /**
     * @return the Tercero
     */
    public String getTercero() {
        return Tercero;
    }

    /**
     * @param Tercero the Tercero to set
     */
    public void setTercero(String Tercero) {
        this.Tercero = Tercero;
    }

    /**
     * @return the Moneda
     */
    public String getMoneda() {
        return Moneda;
    }

    /**
     * @param Moneda the Moneda to set
     */
    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    /**
     * @return the Departamento
     */
    public String getDepartamento() {
        return Departamento;
    }

    /**
     * @param Departamento the Departamento to set
     */
    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    /**
     * @return the oficinaReceptora
     */
    public String getOficinaReceptora() {
        return oficinaReceptora;
    }

    /**
     * @param oficinaReceptora the oficinaReceptora to set
     */
    public void setOficinaReceptora(String oficinaReceptora) {
        this.oficinaReceptora = oficinaReceptora;
    }

    /**
     * @return the oficinaTerminal
     */
    public String getOficinaTerminal() {
        return oficinaTerminal;
    }

    /**
     * @param oficinaTerminal the oficinaTerminal to set
     */
    public void setOficinaTerminal(String oficinaTerminal) {
        this.oficinaTerminal = oficinaTerminal;
    }

    /**
     * @return the tipoForma
     */
    public String getTipoForma() {
        return tipoForma;
    }

    /**
     * @param tipoForma the tipoForma to set
     */
    public void setTipoForma(String tipoForma) {
        this.tipoForma = tipoForma;
    }

    /**
     * @return the tipoInter
     */
    public String getTipoInter() {
        return tipoInter;
    }

    /**
     * @param tipoInter the tipoInter to set
     */
    public void setTipoInter(String tipoInter) {
        this.tipoInter = tipoInter;
    }

    /**
     * @return the tipoRegistro
     */
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    /**
     * @param tipoRegistro the tipoRegistro to set
     */
    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    /**
     * @return the tipoimputación
     */
    public String getTipoimputación() {
        return tipoimputación;
    }

    /**
     * @param tipoimputación the tipoimputación to set
     */
    public void setTipoimputación(String tipoimputación) {
        this.tipoimputación = tipoimputación;
    }

    /**
     * @return the Monto
     */
    public String getMonto() {
        return Monto;
    }

    /**
     * @param Monto the Monto to set
     */
    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    /**
     * @return the señalConciliación
     */
    public String getSeñalConciliación() {
        return señalConciliación;
    }

    /**
     * @param señalConciliación the señalConciliación to set
     */
    public void setSeñalConciliación(String señalConciliación) {
        this.señalConciliación = señalConciliación;
    }

    /**
     * @return the señalComprobante
     */
    public String getSeñalComprobante() {
        return señalComprobante;
    }

    /**
     * @param señalComprobante the señalComprobante to set
     */
    public void setSeñalComprobante(String señalComprobante) {
        this.señalComprobante = señalComprobante;
    }

    /**
     * @return the señalInter
     */
    public String getSeñalInter() {
        return señalInter;
    }

    /**
     * @param señalInter the señalInter to set
     */
    public void setSeñalInter(String señalInter) {
        this.señalInter = señalInter;
    }

    /**
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /**
     * @return the tasa
     */
    public String getTasa() {
        return tasa;
    }

    /**
     * @param tasa the tasa to set
     */
    public void setTasa(String tasa) {
        this.tasa = tasa;
    }

    /**
     * @return the linea
     */
    public String getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }






}
