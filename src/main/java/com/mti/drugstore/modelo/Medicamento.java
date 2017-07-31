/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.modelo;

/**
 *
 * @author rascencio
 */
public class Medicamento 
{
    private String idMedicamento;
    private String codBarra;
    private String nombreMed;
    private String laboratorio;
    private String cantNeta;
    private Presentacion presentacion;
    private String cantMed;
    private String umCantMed;
    private String imagen;
    
    
    public Medicamento(Presentacion presentacion)
    {
        idMedicamento="";
        codBarra="";
        nombreMed="";
        laboratorio="";
        cantNeta="";
        this.presentacion=presentacion;
        cantMed="";
        umCantMed="";
        imagen="";
    }

    public String getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(String idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getCantNeta() {
        return cantNeta;
    }

    public void setCantNeta(String cantNeta) {
        this.cantNeta = cantNeta;
    }

    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }

    public String getCantMed() {
        return cantMed;
    }

    public void setCantMed(String cantMed) {
        this.cantMed = cantMed;
    }

    public String getUmCantMed() {
        return umCantMed;
    }

    public void setUmCantMed(String umCantMed) {
        this.umCantMed = umCantMed;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }   
}
