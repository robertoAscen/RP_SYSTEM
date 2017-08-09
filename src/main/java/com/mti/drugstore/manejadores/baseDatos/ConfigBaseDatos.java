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
    Encriptador encriptador;
    static File nombreDB = new File(new File("src/main/resources/data/servidor/data_base_name.dll").getAbsolutePath());
    static File hostDB = new File(new File("src/main/resources/data/servidor/data_base_host.dll").getAbsolutePath());
    static File puertoDB = new File(new File("src/main/resources/data/servidor/data_base_puerto.dll").getAbsolutePath());
    static File passwordDB = new File(new File("src/main/resources/data/servidor/data_base_password.dll").getAbsolutePath());
    static File usuarioDB = new File(new File("src/main/resources/data/servidor/data_base_usuario.dll").getAbsolutePath());
    private String hostDesencrypt;
    private String prtDesencrypt;    
    private String BDDesencrypt;
    private String usuDesencrypt;
    private String passDesencrypt;
    //private String hostEncrypt;
    //private String puertoEncrypt;
    //private String nombreBDEncrypt;
    //private String passEncrypt;
    //private String usuarioEncrypt;
            
            
    public ConfigBaseDatos(ManejadorArchivos mnjArchivos, Encriptador encriptador)
    {
        this.mnjArchivos = mnjArchivos;
        this.encriptador = encriptador;
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
        String hostDb = encriptador.encriptar(hostEncrypt, encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(hostDB, hostDb);
    }   
    
    public void setPuertoDB(String puertoEncrypt)
    {
        String puertoDb = encriptador.encriptar(puertoEncrypt, encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(puertoDB, puertoDb);
    }
            
    public void setNombreDB(String nombreBDEncrypt)
    {
        String nombDb = encriptador.encriptar(nombreBDEncrypt, encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(nombreDB, nombDb);
    }
            
    public void setUsuarioDB(String usuarioEncrypt)
    {
        String usuarioDb = encriptador.encriptar(usuarioEncrypt, encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(usuarioDB, usuarioDb);
    }
            
    public void setPasswordDB(String passEncrypt)
    {
        String passDb = encriptador.encriptar(passEncrypt,encriptador.ClaveEncryption());
        mnjArchivos.GuardarTexto(passwordDB, passDb);
    }
    
    public String getHostDB()
    {
        String hostDb = mnjArchivos.AbrirTexto(hostDB);
        hostDesencrypt = encriptador.desencriptar(hostDb, encriptador.ClaveEncryption());
        
        return hostDesencrypt;
    }
    
    public String getPuertoDB()
    {
        String puertoDb = mnjArchivos.AbrirTexto(puertoDB);        
        prtDesencrypt = encriptador.desencriptar(puertoDb, encriptador.ClaveEncryption());
        
        return prtDesencrypt;
    }
    
    public String getNombreDB()
    {
        String nombDb = mnjArchivos.AbrirTexto(nombreDB);
        BDDesencrypt = encriptador.desencriptar(nombDb, encriptador.ClaveEncryption());
        
        return BDDesencrypt;
    }
    
    public String getUsuarioDB()
    {
        String usuarioDb = mnjArchivos.AbrirTexto(usuarioDB);
        usuDesencrypt = encriptador.desencriptar(usuarioDb, encriptador.ClaveEncryption());
        
        return usuDesencrypt;
    }
    
    public String getPasswordDB()
    {
        String passDb = mnjArchivos.AbrirTexto(passwordDB);
        passDesencrypt = encriptador.desencriptar(passDb, encriptador.ClaveEncryption());
        
        return passDesencrypt;
    }   
}
