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
    private String contenido;
    private String umContenido;
    private String imagen;
    private Presentacion presentacion;
    
    public Medicamento(Presentacion presentacion)
    {
        codBarra="";
        nombreMed="";
        laboratorio="";
        contenido="";
        umContenido="";
        imagen="";
        this.presentacion = presentacion;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUmContenido() {
        return umContenido;
    }

    public void setUmContenido(String umContenido) {
        this.umContenido = umContenido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }
    
}
