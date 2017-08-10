/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador.baseDatos;

import com.mti.drugstore.manejadores.archivos.ManejadorArchivos;
import com.mti.drugstore.manejadores.baseDatos.Conexion;
import com.mti.drugstore.manejadores.baseDatos.ConfigBaseDatos;
import com.mti.drugstore.manejadores.seguridad.Encriptador;
import com.mti.drugstore.vista.baseDatos.VistaConfigDB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author RAscencio
 */
public class CtrlConfigBaseDatos implements ActionListener
{
    VistaConfigDB vistaConfigDB;
    ConfigBaseDatos configDB;
    Encriptador encript;
    ManejadorArchivos mnjArchivos;
    
    public CtrlConfigBaseDatos(VistaConfigDB vistaConfigDB)
    {
        this.vistaConfigDB = vistaConfigDB;
        this.vistaConfigDB.jbCrearDB.addActionListener(this);
        this.vistaConfigDB.jbGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        if(ae.getSource() == vistaConfigDB.jbGuardar)
        {
            //encript = new Encriptador();
            if(vistaConfigDB.jtfHost.getText().length() != 0 && vistaConfigDB.jtfPuerto.getText().length() != 0
                && vistaConfigDB.jtfNombreDB.getText().length() != 0 && vistaConfigDB.jtfUsuario.getText().length() != 0
                && vistaConfigDB.jtfPassDB.getText().length() != 0)
            {
                mnjArchivos = new ManejadorArchivos();
                configDB = new ConfigBaseDatos(mnjArchivos);

                configDB.setHostDB(vistaConfigDB.jtfHost.getText());
                configDB.setPuertoDB(vistaConfigDB.jtfPuerto.getText());
                configDB.setNombreDB(vistaConfigDB.jtfNombreDB.getText());
                configDB.setUsuarioDB(vistaConfigDB.jtfUsuario.getText());
                configDB.setPasswordDB(vistaConfigDB.jtfPassDB.getText());  

                String host = configDB.getHostDB();
                String puerto = configDB.getPuertoDB();
                String nombre = configDB.getNombreDB();
                String usuario = configDB.getUsuarioDB();
                String pass = configDB.getPasswordDB();
                
                Conexion conexion = new Conexion(host, puerto, nombre, usuario, pass);
                if(conexion.getConexion() != null)
                {
                    JOptionPane.showMessageDialog(vistaConfigDB, "Prueba de conexión exitosa!!!","Informacion", JOptionPane.INFORMATION_MESSAGE);
                    vistaConfigDB.dispose();
                }   
                else
                {
                    JOptionPane.showMessageDialog(vistaConfigDB, "Revise que sus parámetros esten bien escritos","Error", JOptionPane.ERROR);
                }
            }    
            else
            {
                JOptionPane.showMessageDialog(vistaConfigDB, "Complete todos los campos","Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }    
}
