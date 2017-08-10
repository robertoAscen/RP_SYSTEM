/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.modelos;

import com.mti.drugstore.manejadores.archivos.ManejadorArchivos;
import com.mti.drugstore.manejadores.baseDatos.Conexion;
import com.mti.drugstore.manejadores.baseDatos.ConfigBaseDatos;
import com.mti.drugstore.manejadores.seguridad.Encriptador;
import com.mti.drugstore.objetos.Formula;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    //Encriptador encript = new Encriptador();
    ManejadorArchivos mnjFiles = new ManejadorArchivos();
    ConfigBaseDatos ctlrConfigDB = new ConfigBaseDatos(mnjFiles);
    Conexion conexion;
    
    public DaoFormula()
    {
        String hostDB = ctlrConfigDB.getHostDB();
        String puertoDB = ctlrConfigDB.getPuertoDB();
        String nombreDB =  ctlrConfigDB.getNombreDB();
        String usuarioDB = ctlrConfigDB.getUsuarioDB();
        String passDB = ctlrConfigDB.getPasswordDB();
        conexion = new Conexion(hostDB, puertoDB, nombreDB, usuarioDB, passDB);
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
    
    public ArrayList<Formula> listaFormula(String barCodeMedicamento)
    {
        ArrayList arrayFormula = new ArrayList();
        Formula formula;
            
        try
        {
            Connection acceDB = conexion.getConexion();
            PreparedStatement ps = acceDB.prepareStatement("select * from FORMULA_MED where medicamento = ?");
            ps.setString(1, barCodeMedicamento);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                formula = new Formula();
                formula.setIdFormula(rs.getString(1));
                formula.setMedicamento(rs.getString(2));
                formula.setSustanciaAct(rs.getString(3));
                formula.setContenido(rs.getString(4));
                formula.setUmContenido(rs.getString(5));
                arrayFormula.add(formula);
                
            }            
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMedicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrayFormula;
    }
}
