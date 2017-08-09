/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador.baseDatos;

import com.mti.drugstore.manejadores.archivos.ManejadorArchivos;
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
            encript = new Encriptador();
            mnjArchivos = new ManejadorArchivos();
            configDB = new ConfigBaseDatos(mnjArchivos, encript);
            
            configDB.setHostDB(vistaConfigDB.jtfHost.getText());
            configDB.setPuertoDB(vistaConfigDB.jtfPuerto.getText());
            configDB.setNombreDB(vistaConfigDB.jtfNombreDB.getText());
            configDB.setUsuarioDB(vistaConfigDB.jtfUsuario.getText());
            configDB.setPasswordDB(vistaConfigDB.jtfPassDB.getText());  
            
            JOptionPane.showMessageDialog(vistaConfigDB, "Configuración guardada exitosamente!!!","Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
