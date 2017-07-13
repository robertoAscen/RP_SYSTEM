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
    private String codBarra;
    private String nombreMed;
    private String laboratorio;
    
    public Medicamento()
    {
        codBarra="";
        nombreMed="";
        laboratorio="";
    }

    public String getCodBarra() 
    {
        return codBarra;
    }

    public void setCodBarra(String codBarra) 
    {
        this.codBarra = codBarra;
    }

    public String getNombreMed() 
    {       
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) 
    {
        this.nombreMed = nombreMed;
    }

    public String getLaboratorio() 
    {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) 
    {
        this.laboratorio = laboratorio;
    }   
}
