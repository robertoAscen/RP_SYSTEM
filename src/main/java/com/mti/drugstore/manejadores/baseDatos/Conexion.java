/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.manejadores.baseDatos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rascencio
 */
public class Conexion 
{
    private Connection con;
    String strHost;
    String strPuerto;
    String strNombreDB;
    String strUsuario;
    String strPassword;
    
    public Conexion(String strHost, String strPuerto, String strNombreDB, String strUsuario, String strPassword)
    {
        this.strHost = strHost;
        this.strPuerto = strPuerto;
        this.strNombreDB = strNombreDB;
        this.strUsuario = strUsuario;
        this. strPassword = strPassword;
    }
    
    public Connection getConexion()
    {        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_farmacia", "root", "Ascencio1234"); //usuario linux mint
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_farmacia", "root", "ascencio"); //usuario windows
            //System.out.print("jdbc:mysql://" + strHost + ":" + strPuerto + "/", strNombreDB, strUsuario, strPassword);
            //String strDatosConexion = strHost + ":" + strPuerto + "/" + strNombreDB +", "+ strUsuario +", "+ strPassword;
            con = DriverManager.getConnection("jdbc:mysql://" + strHost + ":" + strPuerto + "/" + strNombreDB , strUsuario , strPassword);
            System.out.println("Conexión exitosa!!!");            
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Falla de conexión");
        }
        
        return con;
    }
    
    public void desconectar()
    {
        try 
        {
            con.close();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*public String getStrHost() {
        return strHost;
    }

    public void setStrHost(String strHost) {
        this.strHost = strHost;
    }

    public String getStrPuerto() {
        return strPuerto;
    }

    public void setStrPuerto(String strPuerto) {
        this.strPuerto = strPuerto;
    }

    public String getStrNombreDB() {
        return strNombreDB;
    }

    public void setStrNombreDB(String strNombreDB) {
        this.strNombreDB = strNombreDB;
    }

    public String getStrUsuario() {
        return strUsuario;
    }

    public void setStrUsuario(String strUsuario) {
        this.strUsuario = strUsuario;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }*/    
}
