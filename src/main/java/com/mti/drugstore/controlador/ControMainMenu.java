/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador;

import com.mti.drugstore.modelo.FormulaDAO;
import com.mti.drugstore.modelo.MedicamentoDAO;
import com.mti.drugstore.modelo.PresentacionDAO;
import com.mti.drugstore.modelo.SustanciaActDAO;
import com.mti.drugstore.vista.ViewCreateProduct;
import com.mti.drugstore.vista.ViewMainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rascencio
 */
public class ControMainMenu implements ActionListener
{
    ViewMainMenu mainMenu = new ViewMainMenu();
    
    public ControMainMenu(ViewMainMenu mainMenu)
    {
        this.mainMenu = mainMenu;
        this.mainMenu.jb_1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(ae.getSource() == mainMenu.jb_1)
        {
            ViewCreateProduct viewCreateProduct = new ViewCreateProduct();
            MedicamentoDAO modeloMed= new MedicamentoDAO();
            PresentacionDAO presentacionDAO = new PresentacionDAO();
            SustanciaActDAO sustanciaDAO = new SustanciaActDAO();
            FormulaDAO formulaDAO = new FormulaDAO();
            ControCrear controlador = new ControCrear(viewCreateProduct, modeloMed, presentacionDAO, sustanciaDAO, formulaDAO);
            viewCreateProduct.setVisible(true);
            //mainMenu.dispose();
        }
    }
}
