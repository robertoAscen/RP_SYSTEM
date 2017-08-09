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
import com.mti.drugstore.objetos.SustanciaAct;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class DaoSustanciaAct
{
    Encriptador encript = new Encriptador();
    ManejadorArchivos mnjFiles = new ManejadorArchivos();
    ConfigBaseDatos ctlrConfigDB = new ConfigBaseDatos(mnjFiles, encript);
    Conexion conexion;
    
    public DaoSustanciaAct()
    {
        String hostDB = ctlrConfigDB.getHostDB();
        String puertoDB = ctlrConfigDB.getPuertoDB();
        String nombreDB =  ctlrConfigDB.getNombreDB();
        String usuarioDB = ctlrConfigDB.getUsuarioDB();
        String passDB = ctlrConfigDB.getPasswordDB();
        conexion = new Conexion(hostDB, puertoDB, nombreDB, usuarioDB, passDB);
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
            Logger.getLogger(DaoMedicamento.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DaoPresentacion.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DaoPresentacion.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return idPresentacion;
    }
    
    public String getDescripSustAct(String strNumSusAct)
    {
        String descripSustAct = null;
        try
        {
            Connection acceDB = conexion.getConexion();
            PreparedStatement ps = acceDB.prepareStatement("select descrip_susAct from SUSTANCIA_ACTIVA where id_sustanciaAct = ?");
            ps.setString(1, strNumSusAct);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                descripSustAct = rs.getString(1);
            }           
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoPresentacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return descripSustAct;
    }
}
