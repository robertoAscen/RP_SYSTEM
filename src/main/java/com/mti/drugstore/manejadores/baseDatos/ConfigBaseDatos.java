/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.manejadores.baseDatos;

import com.mti.drugstore.manejadores.archivos.ManejadorArchivos;
import com.mti.drugstore.manejadores.baseDatos.Conexion;
import com.mti.drugstore.manejadores.seguridad.Encriptador;
import java.io.File;

/**
 *
 * @author RAscencio
 */
public class ConfigBaseDatos 
{
    ManejadorArchivos mnjArchivos;
    //Encriptador encriptador;    
    private File hostDBFile = new File(new File("src/main/resources/data/DBServidor/data_base_host.dll").getAbsolutePath());
    private File puertoDBFile = new File(new File("src/main/resources/data/DBServidor/data_base_puerto.dll").getAbsolutePath());
    private File nombreDBFile = new File(new File("src/main/resources/data/DBServidor/data_base_name.dll").getAbsolutePath());
    private File usuarioDBFile = new File(new File("src/main/resources/data/DBServidor/data_base_usuario.dll").getAbsolutePath());
    private File passwordDBFile = new File(new File("src/main/resources/data/DBServidor/data_base_password.dll").getAbsolutePath());
    //private String hostDesencrypt;
    //private String prtDesencrypt;    
    //private String BDDesencrypt;
    //private String usuDesencrypt;
    //private String passDesencrypt;
    //private String hostEncrypt;
    //private String puertoEncrypt;
    //private String nombreBDEncrypt;
    //private String passEncrypt;
    //private String usuarioEncrypt;
            
            
    public ConfigBaseDatos(ManejadorArchivos mnjArchivos)
    {
        this.mnjArchivos = mnjArchivos;
        //this.encriptador = encriptador;
    }  
    
    /*public ConfigBaseDatos(ManejadorArchivos mnjArchivos, Encriptador encriptador, String hostEncrypt, String puertoEncrypt, String nombreBDEncrypt, String passEncrypt, String usuarioEncrypt)
    {
        this.mnjArchivos = mnjArchivos;
        this.encriptador = encriptador;
        this.hostEncrypt = hostEncrypt;
        this.puertoEncrypt = puertoEncrypt;
        this.nombreBDEncrypt = nombreBDEncrypt;
        this.passEncrypt = passEncrypt;
        this.usuarioEncrypt = usuarioEncrypt;
    } */
    
    public void setHostDB(String hostEncrypt)
    {
        //String hostDb = encriptador.encriptar(hostEncrypt, encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(hostDBFile, hostEncrypt);
    }   
    
    public void setPuertoDB(String puertoEncrypt)
    {
        //String puertoDb = encriptador.encriptar(puertoEncrypt, encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(puertoDBFile, puertoEncrypt);
    }
            
    public void setNombreDB(String nombreBDEncrypt)
    {
        //String nombDb = encriptador.encriptar(nombreBDEncrypt, encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(nombreDBFile, nombreBDEncrypt);
    }
            
    public void setUsuarioDB(String usuarioEncrypt)
    {
        //String usuarioDb = encriptador.encriptar(usuarioEncrypt, encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(usuarioDBFile, usuarioEncrypt);
    }
            
    public void setPasswordDB(String passEncrypt)
    {
        //String passDb = encriptador.encriptar(passEncrypt,encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(passwordDBFile, passEncrypt);
    }
    
    public String getHostDB()
    {
        String hostDb = mnjArchivos.AbrirTexto(hostDBFile);
        //hostDesencrypt = encriptador.desencriptar(hostDb, encriptador.ClaveEncryption());
        
        return hostDb;
    }
    
    public String getPuertoDB()
    {
        String puertoDb = mnjArchivos.AbrirTexto(puertoDBFile);        
        //prtDesencrypt = encriptador.desencriptar(puertoDb, encriptador.ClaveEncryption());
        
        return puertoDb;
    }
    
    public String getNombreDB()
    {
        String nombDb = mnjArchivos.AbrirTexto(nombreDBFile);
        //BDDesencrypt = encriptador.desencriptar(nombDb, encriptador.ClaveEncryption());
        
        return nombDb;
    }
    
    public String getUsuarioDB()
    {
        String usuarioDb = mnjArchivos.AbrirTexto(usuarioDBFile);
        //usuDesencrypt = encriptador.desencriptar(usuarioDb, encriptador.ClaveEncryption());
        
        return usuarioDb;
    }
    
    public String getPasswordDB()
    {
        String passDb = mnjArchivos.AbrirTexto(passwordDBFile);
        //passDesencrypt = encriptador.desencriptar(passDb, encriptador.ClaveEncryption());
        
        return passDb;
    }   
}
