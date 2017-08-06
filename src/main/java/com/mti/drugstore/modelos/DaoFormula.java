/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.modelos;

import com.mti.drugstore.baseDatos.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author rascencio
 */
public class DaoFormula
{
    Conexion conexion;
    
    public DaoFormula()
    {
        conexion = new Conexion();
    }

    public String insertInTable(String idMed, String idSusAct, String cantSusAct, String umSusAct) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String rptaRegistro=null;
            
        try
        {
            Connection accesoDB = conexion.getConexion();
            CallableStatement cs = accesoDB.prepareCall("{call sp_insertFormula(?,?,?,?)}");
            cs.setString(1, idMed);
            cs.setString(2, idSusAct);
            cs.setString(3, cantSusAct);
            cs.setString(4, umSusAct);
            
            int numFAfectadas = cs.executeUpdate();
            
            if(numFAfectadas>0)
            {
                rptaRegistro="Registro exitoso!!!";
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMedicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rptaRegistro;
    }    
}
