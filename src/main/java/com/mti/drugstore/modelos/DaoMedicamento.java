/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.modelos;

import com.mti.drugstore.baseDatos.Conexion;
import com.mti.drugstore.objetos.Medicamento;
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
public class DaoMedicamento
{
    Conexion conexion;
    
    public DaoMedicamento()
    {
        conexion = new Conexion();
    }
    
    public ArrayList<Medicamento> buscaMedicamento(String strNombreMed)
    {
        ArrayList arrayMedicamento = new ArrayList();
        Medicamento medicamento;
            
        try
        {
            Connection acceDB = conexion.getConexion();
            CallableStatement cs = acceDB.prepareCall("{call sp_buscaMedXNombre(?)}");
            cs.setString(1,strNombreMed);
            ResultSet rs = cs.executeQuery();
            
            while(rs.next())
            {
                medicamento = new Medicamento();
                medicamento.setIdMedicamento(rs.getString(1));
                medicamento.setCodBarra(rs.getString(2));
                medicamento.setNombreMed(rs.getString(3));
                medicamento.setLaboratorio(rs.getString(4));
                medicamento.setCantNeta(rs.getString(5));
                medicamento.setPresentacion(rs.getString(6));
                medicamento.setCantMed(rs.getString(7));
                medicamento.setUmCantMed(rs.getString(8));
                medicamento.setImagen(rs.getString(9));   
                arrayMedicamento.add(medicamento);
            }            
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMedicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrayMedicamento;
        
    }
    
    public ArrayList<Medicamento> listaMedicamento()
    {
        ArrayList arrayMedicamento = new ArrayList();
        Medicamento medicamento;
            
        try
        {
            Connection acceDB = conexion.getConexion();
            PreparedStatement ps = acceDB.prepareStatement("select * from MEDICAMENTO");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                medicamento = new Medicamento();
                medicamento.setIdMedicamento(rs.getString(1));
                medicamento.setCodBarra(rs.getString(2));
                medicamento.setNombreMed(rs.getString(3));
                medicamento.setLaboratorio(rs.getString(4));
                medicamento.setCantNeta(rs.getString(5));
                medicamento.setPresentacion(rs.getString(6));
                medicamento.setCantMed(rs.getString(7));
                medicamento.setUmCantMed(rs.getString(8));
                medicamento.setImagen(rs.getString(9));  
                arrayMedicamento.add(medicamento);
            }            
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMedicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrayMedicamento;
    }
    
    public String insertInTable(String idMed, String barCode, String nombreMed, String nombreLab, String cant_neta, String idPresentacion, String cantMed, String umCantMed, String imagen)
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String rptaRegistro=null;
            
        try
        {
            Connection accesoDB = conexion.getConexion();
            CallableStatement cs = accesoDB.prepareCall("{call sp_insertMed(?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, idMed);
            cs.setString(2, barCode);
            cs.setString(3, nombreMed);
            cs.setString(4, nombreLab);
            cs.setString(5, cant_neta);
            cs.setString(6, idPresentacion);
            cs.setString(7, cantMed);
            cs.setString(8, umCantMed);
            cs.setString(9, imagen);
            
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
