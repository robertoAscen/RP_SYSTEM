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
import com.mti.drugstore.objetos.Presentacion;
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
public class DaoPresentacion
{
    //Encriptador encript = new Encriptador();
    ManejadorArchivos mnjFiles = new ManejadorArchivos();
    ConfigBaseDatos ctlrConfigDB = new ConfigBaseDatos(mnjFiles);
    Conexion conexion;
    
    public DaoPresentacion()
    {
        String hostDB = ctlrConfigDB.getHostDB();
        String puertoDB = ctlrConfigDB.getPuertoDB();
        String nombreDB =  ctlrConfigDB.getNombreDB();
        String usuarioDB = ctlrConfigDB.getUsuarioDB();
        String passDB = ctlrConfigDB.getPasswordDB();
        conexion = new Conexion(hostDB, puertoDB, nombreDB, usuarioDB, passDB);       
    }
    
    public String getDescripPresentacion(String strNumPresentacion)
    {
        String descripPresentacion = null;
        try
        {
            Connection acceDB = conexion.getConexion();
            PreparedStatement ps = acceDB.prepareStatement("select descrip_presentacion from PRESENTACION where id_presentacion = ?");
            ps.setString(1, strNumPresentacion);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                descripPresentacion = rs.getString(1);
            }           
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoPresentacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return descripPresentacion;
    }
    
    public String insertInTable(String presentacion)
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String rptaRegistro=null;
            
        try
        {
            Connection accesoDB = conexion.getConexion();
            CallableStatement cs = accesoDB.prepareCall("{call sp_insertPresentacion(?)}");
            cs.setString(1, presentacion);
            
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

    public String findInTablee(String strPresentacion) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
        
        //ArrayList listaPresentacion = new ArrayList();
        String idPresentacion=null;
        Presentacion presentacion;
        try {
            Connection acceDB = conexion.getConexion();
            CallableStatement cs = acceDB.prepareCall("{call sp_buscaIdPresentacion(?)}");
            cs.setString(1, strPresentacion);
            ResultSet rs = cs.executeQuery();
            while(rs.next())
            {
                presentacion = new Presentacion();
                presentacion.setIdPresentacion(rs.getString(1));
                //presentacion.setDescripPresentacion(rs.getString(2));
                //listaPresentacion.add(presentacion);
                idPresentacion = presentacion.getIdPresentacion();
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoPresentacion.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return idPresentacion;
    }

   
    public DefaultComboBoxModel findInTable() 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultComboBoxModel listaPresentacion = new DefaultComboBoxModel();
        Presentacion presentacion;
        
        try 
        {          
            Connection acceDB = conexion.getConexion();
            CallableStatement cs = acceDB.prepareCall("{call sp_buscaPresentacion}");
            ResultSet rs = cs.executeQuery();
            listaPresentacion.addElement("");
            while(rs.next())
            {
                presentacion = new Presentacion();
                presentacion.setIdPresentacion(rs.getString(1));
                presentacion.setDescripPresentacion(rs.getString(2));
                listaPresentacion.addElement(presentacion.getDescripPresentacion());
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoPresentacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPresentacion;
    }
}
