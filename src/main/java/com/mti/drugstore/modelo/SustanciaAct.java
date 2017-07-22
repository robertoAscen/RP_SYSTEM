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
public class SustanciaAct 
{
    private String idSustanciaActiva;
    private String descripcion;
    
    public SustanciaAct()
    {
        idSustanciaActiva="";
        descripcion="";
    }

    public String getIdSustanciaActiva() 
    {
        return idSustanciaActiva;
    }

    public void setIdSustanciaActiva(String idSustanciaActiva) 
    {
        this.idSustanciaActiva = idSustanciaActiva;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    } 
}
