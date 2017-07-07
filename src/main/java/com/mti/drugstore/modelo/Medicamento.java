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
    private int codBarra;
    private String nombreMed;
    private String laboratorio;
    private float costo;
    
    public Medicamento()
    {
        codBarra=0;
        nombreMed="";
        laboratorio="";
        costo=0;
    }

    public int getCodBarra() 
    {
        return codBarra;
    }

    public void setCodBarra(int codBarra) 
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

    public float getCosto() 
    {
        return costo;
    }

    public void setCosto(float costo) 
    {
        this.costo = costo;
    }    
}
