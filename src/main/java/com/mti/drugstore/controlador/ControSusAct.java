/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador;

import com.mti.drugstore.modelo.SustanciaActDAO;
import com.mti.drugstore.vista.ViewSusAct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author rascencio
 */
public class ControSusAct implements ActionListener
{
    String strMed;
    ViewSusAct viewSusAct = new ViewSusAct(strMed);
    SustanciaActDAO sustDAO = new SustanciaActDAO();
    
    public ControSusAct(ViewSusAct viewSusAct, SustanciaActDAO sustDAO)
    {
        this.sustDAO = sustDAO;
        this.viewSusAct = viewSusAct;
        this.viewSusAct.jbSave.addActionListener(this);
        this.viewSusAct.jmiAbout.addActionListener(this);
        this.viewSusAct.jmiBack.addActionListener(this);
        this.viewSusAct.jmiClearFiels.addActionListener(this);
        this.viewSusAct.jmiExit.addActionListener(this);
    }
    
    public void CleanFiels()
    {
        //viewSusAct.jtfCantidad_1.setText("");
        //viewSusAct.jtfCantidad_1.setText("");
        viewSusAct.jcbUnidadMedida_1.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        if(e.getSource() == viewSusAct.jbSave)
        {
            String sustAct = viewSusAct.jtfSusAct_1.getText();
            //String cant = viewSusAct.jtfCantidad_1.getText();
            
            //String rptaRegistroSus = sustDAO.insertInTable(sustAct, cant);
            
            /*if(rptaRegistroSus!=null)
            {
                JOptionPane.showMessageDialog(viewSusAct, rptaRegistroSus);
                CleanFiels();
            }*/
        }
    }
    
}
