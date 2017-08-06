/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.objetos;

/**
 *
 * @author rascencio
 */
public class Presentacion
{
    private String idPresentacion;
    private String descripPresentacion;
    
    public Presentacion()
    {
        idPresentacion="";
        descripPresentacion="";
    }

    public String getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(String idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public String getDescripPresentacion() {
        return descripPresentacion;
    }

    public void setDescripPresentacion(String descripPresentacion) {
        this.descripPresentacion = descripPresentacion;
    }   
}
