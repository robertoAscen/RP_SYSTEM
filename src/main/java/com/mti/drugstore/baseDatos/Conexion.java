/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.baseDatos;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author rascencio
 */
public class Conexion 
{
    public Conexion()
    {
        
    }
    
    public Connection getConexion()
    {
        Connection con = null;
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_farmacia", "root", "Ascencio1234");
            System.out.println("Conexión exitosa!!!");
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Falla de conexión");
        }
        
        return con;
    }
}
