/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador.producto;

import com.mti.drugstore.modelos.DaoFormula;
import com.mti.drugstore.modelos.DaoMedicamento;
import com.mti.drugstore.modelos.DaoPresentacion;
import com.mti.drugstore.modelos.DaoSustanciaAct;
import com.mti.drugstore.vista.producto.VistaBuscarProducto;
import com.mti.drugstore.vista.producto.VistaEditarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rascencio
 */
public class CtrlEditarProducto implements ActionListener, WindowListener
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
    DaoFormula formulaDao = new DaoFormula();
    DaoSustanciaAct sustActDao = new DaoSustanciaAct();
    
    
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
        this.vistaEditar.addWindowListener(this);
    }
    
    public void llenarTabla(JTable jTable, String barCodeMed)
    {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        jTable.setModel(modeloTabla);
        
        //modeloTabla.addColumn("MEDICAMENTO");
        modeloTabla.addColumn("SUSTANCIA ACTIVA");
        modeloTabla.addColumn("CONTENIDO");
        modeloTabla.addColumn("UNIDAD MEDIDA");      
        
        Object[] columna = new Object[4];
        
        int numRegistros = formulaDao.listaFormula(barCodeMed).size();
        
        for(int i=0; i<numRegistros; i++)
        {
            //columna[0] = formulaDao.listaFormula(barCodeMed).get(i).getMedicamento();
            columna[0] = sustActDao.getDescripSustAct(formulaDao.listaFormula(barCodeMed).get(i).getSustanciaAct());
            columna[1] = formulaDao.listaFormula(barCodeMed).get(i).getContenido();
            columna[2] = formulaDao.listaFormula(barCodeMed).get(i).getUmContenido();            
            modeloTabla.addRow(columna);
        }
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

    @Override
    public void windowOpened(WindowEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        llenarTabla(vistaEditar.jtFormula, barCode);
    }

    @Override
    public void windowClosing(WindowEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void windowClosed(WindowEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
