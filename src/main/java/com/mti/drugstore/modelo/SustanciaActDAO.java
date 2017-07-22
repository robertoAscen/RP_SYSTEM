/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
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
public class SustanciaActDAO implements CRUD
{
    Conexion conexion;
    
    public SustanciaActDAO()
    {
        conexion = new Conexion();
    }

    @Override
    public String insertInTable(String uno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insertInTable(String descripcion, String cantidad) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        String rptaRegistro = null;
        try 
        {
                Connection accesoDB = conexion.getConexion();
                CallableStatement cs = accesoDB.prepareCall("{call sp_insertSustanciaAct(,?,?)");
                cs.setString(2, descripcion);
                cs.setString(3, cantidad);
                
                int numFAfectas = cs.executeUpdate();
                
                if(numFAfectas>0)
                {
                    rptaRegistro="Registro exitoso!!!";
                }
            }
            catch (SQLException ex)
            {
                //Logger.getLogger(SustanciaActDAO.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se pudo insertar datos");
            }
            return rptaRegistro;
    }

    @Override
    public String insertInTable(String uno, String dos, String tres) 
    {
        
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            
    }

    @Override
    public String insertInTable(String uno, String dos, String tres, String cuatro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listOfTalbe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteInTable(String uno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int editInTable(String uno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int editInTable(String uno, String dos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int editInTable(String uno, String dos, String tres) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int editInTable(String uno, String dos, String tres, String cuatro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList findInTable(String uno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultComboBoxModel findInTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insertInTable(String uno, String dos, String tres, String cuatro, String cinco, String seis, int siete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
