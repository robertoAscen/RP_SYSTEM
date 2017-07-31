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
public class Formula
{
    private String idFormula;
    private String medicamento;
    private String sustanciaAct;
    private String contenido;
    private String umContenido;
    
    public Formula()
    {
        idFormula="";
        medicamento="";
        sustanciaAct="";
        contenido="";
        umContenido="";
    }

    public String getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(String idFormula) {
        this.idFormula = idFormula;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getSustanciaAct() {
        return sustanciaAct;
    }

    public void setSustanciaAct(String sustanciaAct) {
        this.sustanciaAct = sustanciaAct;
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
    
}
