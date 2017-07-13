/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador;

import com.mti.drugstore.modelo.MedicamentoDAO;
import com.mti.drugstore.vista.JFrameMain;
import com.mti.drugstore.vista.ViewCreate;
import com.mti.drugstore.vista.ViewSusAct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author rascencio
 */
public class ControCrear implements ActionListener
{
    ViewCreate vistaCrear = new ViewCreate();
    MedicamentoDAO medDAO = new MedicamentoDAO();
    
    public ControCrear(ViewCreate vistaCrear, MedicamentoDAO medDAO)
    {
        this.medDAO = medDAO;
        this.vistaCrear = vistaCrear;
        this.vistaCrear.jbCrear.addActionListener(this);
        this.vistaCrear.jbLimpiar.addActionListener(this);
        this.vistaCrear.jbSusActiva.addActionListener(this);
        this.vistaCrear.jmiAbout.addActionListener(this);
        this.vistaCrear.jmiAddProduct.addActionListener(this);
        this.vistaCrear.jmiBack.addActionListener(this);
        this.vistaCrear.jmiClearFiels.addActionListener(this);
        this.vistaCrear.jmiExit.addActionListener(this);        
    }
    
    public void CleanFiels()
    {
        vistaCrear.jtfCodBarraMedicamento.setText("");
        vistaCrear.jtfNomMedicamento.setText("");
        vistaCrear.jtfLaboratorio.setText("");
        vistaCrear.jtfCantidad.setText("");
        vistaCrear.jtfUnidadMedida.setText("");
        vistaCrear.jcbPresentacion.setSelectedIndex(0);
        vistaCrear.jcbUnidadMedida.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(e.getSource() == vistaCrear.jbLimpiar || e.getSource() == vistaCrear.jmiClearFiels)
        {
            CleanFiels();
        }
        if(e.getSource() == vistaCrear.jmiExit)
        {
            vistaCrear.dispose();
        }
        if(e.getSource() == vistaCrear.jmiAbout)
        {
            JOptionPane.showMessageDialog(vistaCrear, "Software para control de inventarios farmacéuticos\nAutor:"
                    + "Roberto Ascencio\nCompañia: Enviromentec\nwww.enviromentec.com.mx\nFecha: 09/07/2017");
        }
        if(e.getSource() == vistaCrear.jbCrear || e.getSource() == vistaCrear.jmiAddProduct)
        {           
            /*String barCode = vistaCrear.jtfCodBarraMedicamento.getText();
            String nameMed = vistaCrear.jtfNomMedicamento.getText();
            String susAct_1 = vistaCrear.jtfSusAct_1.getText();
            String susAct_2 = vistaCrear.jtfSusAct_2.getText();
            String susAct_3 = vistaCrear.jtfSusAct_3.getText();
            String susAct_4 = vistaCrear.jtfSusAct_4.getText();
            String susAct_5 = vistaCrear.jtfSusAct_5.getText();
            String presentacion = (String) vistaCrear.jcbPresentacion.getSelectedItem();
            String cantUnidadMed = vistaCrear.jtfUnidadMedida.getText();
            String unidadMed = (String) vistaCrear.jcbUnidadMedida.getSelectedItem();*/
        }   
        if(e.getSource() == vistaCrear.jbSusActiva)
        {
            vistaCrear.dispose();
            ViewSusAct viewSusAct = new ViewSusAct(vistaCrear.jtfNomMedicamento.getText());            
            viewSusAct.setVisible(true);
        }
        if(e.getSource() == vistaCrear.jmiBack)
        {
            vistaCrear.dispose();
            JFrameMain frameMain = new JFrameMain();
            ControMain controMain = new ControMain(frameMain);        
            frameMain.setVisible(true);
        }
    }
    
}
