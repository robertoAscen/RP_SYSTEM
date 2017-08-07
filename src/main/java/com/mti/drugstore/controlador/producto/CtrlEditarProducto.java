/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador.producto;

import com.mti.drugstore.modelos.DaoMedicamento;
import com.mti.drugstore.modelos.DaoPresentacion;
import com.mti.drugstore.vista.producto.VistaEditarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author rascencio
 */
public class CtrlEditarProducto implements ActionListener
{
    VistaEditarProducto vistaEditar = new VistaEditarProducto();
    DaoMedicamento medDao = new DaoMedicamento();
    DaoPresentacion presentacionDao = new DaoPresentacion();
    String barCode;
    String nombreMed;
    String fabricante;
    String cantNeta;
    String present;
    String presentacion;
    String cantMed;
    String unidadMedida;
    
    public CtrlEditarProducto(VistaEditarProducto vistaEditar, String strMed)
    {
        this.vistaEditar = vistaEditar;
        barCode = medDao.getDetalleMedicamento(strMed).getCodBarra();
        nombreMed = medDao.getDetalleMedicamento(strMed).getNombreMed();
        fabricante = medDao.getDetalleMedicamento(strMed).getLaboratorio();
        cantNeta = medDao.getDetalleMedicamento(strMed).getCantNeta();
        present = medDao.getDetalleMedicamento(strMed).getPresentacion();
        presentacion = presentacionDao.getDescripPresentacion(present);
        cantMed = medDao.getDetalleMedicamento(strMed).getCantMed();
        unidadMedida = medDao.getDetalleMedicamento(strMed).getUmCantMed();
        this.vistaEditar.jtfCodigoBarrasProducto.setText(barCode);
        this.vistaEditar.jtfNombreProducto.setText(nombreMed);
        this.vistaEditar.jtfFabricanteProducto.setText(fabricante);
        this.vistaEditar.jtfCantNeta.setText(cantNeta);
        this.vistaEditar.jtfPresentacion.setText(presentacion);
        this.vistaEditar.jtfCantMed.setText(cantMed);
        this.vistaEditar.jtfUmMed.setText(unidadMedida);        
        this.vistaEditar.jlImagen.setIcon(new ImageIcon(medDao.getDetalleMedicamento(strMed).getImagen()));
        this.vistaEditar.jbEditar.addActionListener(this);
        this.vistaEditar.jbGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(e.getSource() == vistaEditar.jbEditar)
        {
            vistaEditar.habilitarTodo();
        }
        if(e.getSource() == vistaEditar.jbGuardar)
        {
            vistaEditar.desHabilitarTodo();
        }
    }
}
