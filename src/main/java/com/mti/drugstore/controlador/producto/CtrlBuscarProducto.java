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
import com.mti.drugstore.vista.producto.VistaAgregarProducto;
import com.mti.drugstore.vista.producto.VistaBuscarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rascencio
 */
public class CtrlBuscarProducto implements ActionListener, KeyListener
{
    VistaBuscarProducto viewFindProduct = new VistaBuscarProducto();
    DaoMedicamento medDAO = new DaoMedicamento();
    DaoPresentacion presentacionDAO = new DaoPresentacion();
    
    public CtrlBuscarProducto(VistaBuscarProducto viewFindProduct, DaoMedicamento medDAO, DaoPresentacion presentacionDAO)
    {       
        this.viewFindProduct = viewFindProduct;
        this.viewFindProduct.jb_1.addActionListener(this);
        this.viewFindProduct.jb_2.addActionListener(this);
        this.viewFindProduct.jb_3.addActionListener(this);
        this.viewFindProduct.jtfFindObj.addKeyListener(this);
        this.medDAO = medDAO;
        this.presentacionDAO = presentacionDAO;
    }    
    
    public void llenarTabla(JTable jjTable)
    {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        jjTable.setModel(modeloTabla);
        
        //modeloTabla.addColumn("idMed");
        modeloTabla.addColumn("CÓDIGO BARRAS");
        modeloTabla.addColumn("NOMBRE");
        modeloTabla.addColumn("FABRICANTE");
        //modeloTabla.addColumn("neto");
        modeloTabla.addColumn("PRESENTACION");
        //modeloTabla.addColumn("cant med");
        //modeloTabla.addColumn("um");
        //modeloTabla.addColumn("IMAGEN");        
        
        Object[] columna = new Object[4];
        
        int numRegistros = medDAO.listaMedicamento().size();
        
        for(int i=0; i<numRegistros; i++)
        {
            //columna[0] = medDAO.listaMedicamento().get(i).getIdMedicamento();
            columna[0] = medDAO.listaMedicamento().get(i).getCodBarra();
            columna[1] = medDAO.listaMedicamento().get(i).getNombreMed();
            columna[2] = medDAO.listaMedicamento().get(i).getLaboratorio();
            //columna[4] = medDAO.listaMedicamento().get(i).getCantNeta();
            columna[3] = presentacionDAO.getDescripPresentacion(medDAO.listaMedicamento().get(i).getPresentacion());
            //columna[6] = medDAO.listaMedicamento().get(i).getCantMed();
            //columna[7] = medDAO.listaMedicamento().get(i).getUmCantMed();
            //columna[8] = medDAO.listaMedicamento().get(i).getImagen();
            modeloTabla.addRow(columna);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(e.getSource() == viewFindProduct.jb_1)
        {
            VistaAgregarProducto createProduct = new VistaAgregarProducto();
            DaoMedicamento med_DAO = new DaoMedicamento();
            DaoPresentacion presentDAO = new DaoPresentacion();
            DaoSustanciaAct susDAO = new DaoSustanciaAct();
            DaoFormula formDAO = new DaoFormula();
            CtrlAgregarProducto ctrlCreateProduct = new CtrlAgregarProducto(createProduct, med_DAO, presentDAO, susDAO, formDAO);
            createProduct.setVisible(true);   
        }
        if(e.getSource() == viewFindProduct.jb_2)
        {
            llenarTabla(viewFindProduct.jTable);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        if(e.getSource() == viewFindProduct.jtfFindObj)
        {
            char c = e.getKeyChar();
            if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_SPACE))
            {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        /*if(e.getSource() == viewFindProduct.jtfFindObj)
        {
            char c = e.getKeyChar();
            if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_SPACE))
            {
                e.consume();
            }
        }*/
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        String strNombreMed = viewFindProduct.jtfFindObj.getText();
            
            DefaultTableModel modeloT = new DefaultTableModel();
            viewFindProduct.jTable.setModel(modeloT);
            
            modeloT.addColumn("CÓDIGO BARRAS");
            modeloT.addColumn("NOMBRE");
            modeloT.addColumn("FABRICANTE");
            modeloT.addColumn("PRESENTACIÓN");
            //modeloT.addColumn("CONTENIDO NETO");
            //modeloT.addColumn("IMAGEN");
            //modeloT.addColumn("SUSTANCIA ACTIVA");
            
            Object[] columna = new Object[4];
            
            int numRegistros = medDAO.buscaMedicamento(strNombreMed).size();
            
            for(int i=0; i<numRegistros; i++)
            {
                columna[0] = medDAO.listaMedicamento().get(i).getCodBarra();
                columna[1] = medDAO.listaMedicamento().get(i).getNombreMed();
                columna[2] = medDAO.listaMedicamento().get(i).getLaboratorio();
                columna[3] = presentacionDAO.getDescripPresentacion(medDAO.listaMedicamento().get(i).getPresentacion());
                //columna[4] = medDAO.listaMedicamento().get(i).getCantNeta();
                //columna[5] = medDAO.listaMedicamento().get(i).getCodBarra();
                //columna[6] = medDAO.listaMedicamento().get(i).getCodBarra();//cambiar por sustancia activa
                modeloT.addRow(columna);
            }
    }
}
