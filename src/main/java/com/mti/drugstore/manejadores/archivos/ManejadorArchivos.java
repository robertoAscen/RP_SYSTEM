/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.manejadores.archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAscencio
 */
public class ManejadorArchivos 
{
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
  
    public String AbrirTexto(File archivo)
    {
        String contenido = "";
        try 
        {            
            entrada = new FileInputStream(archivo);
            int ascci;
            try {
                while ((ascci = entrada.read()) != -1)
                {
                    //int asccci=0;
                    char caracter = (char)ascci;
                    contenido = contenido + caracter;
                }
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(ManejadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }            
        } 
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(ManejadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contenido;
  }
  
    public String GuardarTexto(File archivo, String contenido)
    {
        String respuesta = null;
        try
        {
            this.salida = new FileOutputStream(archivo);
            byte[] bytestxt = contenido.getBytes();
            this.salida.write(bytestxt);
            respuesta = "El archivo se ha guardado con exito.";
        }
        catch (Exception localException) 
        {
        }
        return respuesta;
    }
  
    public byte[] AbrirImagen(File archivo)
    {
        byte[] bytesImg = new byte[409600];
        try
        {
            this.entrada = new FileInputStream(archivo);
            this.entrada.read(bytesImg);
        }
        catch (Exception localException) 
        {
        }
        return bytesImg;
    }
  
    public String GuardarImagen(File archivo, byte[] bytesImg)
    {
        String respuesta = null;
        try
        {
            this.salida = new FileOutputStream(archivo);
            this.salida.write(bytesImg);
            respuesta = "La imagen se ha guardado con exito.";
        }
        catch (Exception localException) 
        {
        }
        return respuesta;
    }
  
    public byte[] getBytes()
    {
        return null;
    }
}
