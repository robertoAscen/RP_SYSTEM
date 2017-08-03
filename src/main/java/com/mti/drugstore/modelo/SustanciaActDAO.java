/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author rascencio
 */
public class SustanciaActDAO
{
    Conexion conexion;
    
    public SustanciaActDAO()
    {
        conexion = new Conexion();
    }
    
    public String insertInTable(String strSustancia) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String rptaRegistro=null;
            
        try
        {
            Connection accesoDB = conexion.getConexion();
            CallableStatement cs = accesoDB.prepareCall("{call sp_insertSustancia(?)}");
            cs.setString(1, strSustancia);
            
            int numFAfectadas = cs.executeUpdate();
            
            if(numFAfectadas>0)
            {
                rptaRegistro="Registro exitoso!!!";
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MedicamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rptaRegistro;
    }
    
    public DefaultComboBoxModel findInTable() 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultComboBoxModel listaPresentacion = new DefaultComboBoxModel();
        SustanciaAct susAct;
        
        try 
        {          
            Connection acceDB = conexion.getConexion();
            CallableStatement cs = acceDB.prepareCall("{call sp_buscaSustAct}");
            ResultSet rs = cs.executeQuery();
            listaPresentacion.addElement("");
            while(rs.next())
            {
                susAct = new SustanciaAct();
                susAct.setIdSustanciaActiva(rs.getString(1));
                susAct.setDescripcion(rs.getString(2));
                listaPresentacion.addElement(susAct.getDescripcion());
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(PresentacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPresentacion;
    }
    
    public String findInTablee(String strSusAct) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String idPresentacion=null;
        SustanciaAct sustanciaAct;
        try {
            Connection acceDB = conexion.getConexion();
            CallableStatement cs = acceDB.prepareCall("{call sp_buscaIdSustAct(?)}");
            cs.setString(1, strSusAct);
            ResultSet rs = cs.executeQuery();
            while(rs.next())
            {
                sustanciaAct = new SustanciaAct();
                sustanciaAct.setIdSustanciaActiva(rs.getString(1));
                //presentacion.setDescripPresentacion(rs.getString(2));
                //listaPresentacion.add(presentacion);
                idPresentacion = sustanciaAct.getIdSustanciaActiva();
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(PresentacionDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return idPresentacion;
    }
}
