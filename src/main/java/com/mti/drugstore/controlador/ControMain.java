/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador;

import com.mti.drugstore.modelo.MedicamentoDAO;
import com.mti.drugstore.vista.JFrameMain;
import com.mti.drugstore.vista.ViewCreate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rascencio
 */
public class ControMain implements ActionListener
{
    JFrameMain jFrameMain = new JFrameMain();
    
    public ControMain(JFrameMain jFrameMain)
    {
        this.jFrameMain = jFrameMain;
        this.jFrameMain.jbCrearNP.addActionListener(this);
        this.jFrameMain.jbViewProduct.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(ae.getSource() == jFrameMain.jbCrearNP)
        {
            ViewCreate viewCreateProduct = new ViewCreate();
            MedicamentoDAO modeloMed= new MedicamentoDAO();
            ControCrear controlador = new ControCrear(viewCreateProduct, modeloMed);
            viewCreateProduct.setVisible(true);
            jFrameMain.dispose();
        }
        /*if(ae.getSource() == jFrameMain.jbViewProduct)
        {
            JFrameViewProduct jFrameViewProduct = new JFrameViewProduct();
            ProductoDAO modeloProducto  = new ProductoDAO();
            ControCrear controlator = new ControCrear(jFrameViewProduct, modeloProducto);
            jFrameViewProduct.setVisible(true);
            jFrameViewProduct.setTitle("www.eneri.com.mx");
            jFrameViewProduct.setLocationRelativeTo(null);
            jFrameMain.dispose();
        }*/
    }    

   /* @Override
    public void actionPerformed(ActionEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
