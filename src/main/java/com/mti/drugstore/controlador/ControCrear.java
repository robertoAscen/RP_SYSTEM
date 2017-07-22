/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador;

import com.mti.drugstore.modelo.MedicamentoDAO;
import com.mti.drugstore.modelo.PresentacionDAO;
import com.mti.drugstore.modelo.SustanciaActDAO;
import com.mti.drugstore.vista.JFrameMain;
import com.mti.drugstore.vista.ViewCreate;
import com.mti.drugstore.vista.ViewSusAct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author rascencio
 */
public class ControCrear implements ActionListener
{
    ViewCreate vistaCrear = new ViewCreate();
    MedicamentoDAO medDAO = new MedicamentoDAO();
    PresentacionDAO presentacionDAO = new PresentacionDAO();
    
    public ControCrear(ViewCreate vistaCrear, MedicamentoDAO medDAO)
    {
        this.medDAO = medDAO;
        this.presentacionDAO = presentacionDAO;
        this.vistaCrear = vistaCrear;
        this.vistaCrear.jbCrear.addActionListener(this);
        this.vistaCrear.jbLimpiar.addActionListener(this);
        this.vistaCrear.jmiAbout.addActionListener(this);
        this.vistaCrear.jmiAddProduct.addActionListener(this);
        this.vistaCrear.jmiBack.addActionListener(this);
        this.vistaCrear.jmiClearFiels.addActionListener(this);
        this.vistaCrear.jmiExit.addActionListener(this);   
        this.vistaCrear.jbAgregarImagen.addActionListener(this);
        this.vistaCrear.jcbPresentacion.setModel(presentacionDAO.findInTable());
    }
    
    public void CleanFiels()
    {
        vistaCrear.jtfCodBarraMedicamento.setText("");
        vistaCrear.jtfNomMedicamento.setText("");
        vistaCrear.jtfLaboratorio.setText("");
        vistaCrear.jtfCantidad.setText("");
        vistaCrear.jcbPresentacion.setSelectedIndex(0);
        vistaCrear.jcbUnidadMedida.setSelectedIndex(0);
        vistaCrear.jlImagen.setText("Agrega imagen");
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(e.getSource() == vistaCrear.jbAgregarImagen)
        {
            String ruta =null;
            JFileChooser j = new JFileChooser();
            j.setCurrentDirectory(new File("/home/rascencio/Pictures/"));
            int ap = j.showOpenDialog(vistaCrear);
            if(ap==0)
            {
                ruta = j.getSelectedFile().getAbsolutePath();
                vistaCrear.jlImagen.setText("");
                vistaCrear.jlImagen.setIcon(new ImageIcon(ruta));
                vistaCrear.jlRutaImagen.setText(ruta);
            }
        }
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
            String barCode = vistaCrear.jtfCodBarraMedicamento.getText();
            String nameMed = vistaCrear.jtfNomMedicamento.getText();
            String nameFab = vistaCrear.jtfLaboratorio.getText();
            String cant = vistaCrear.jtfCantidad.getText();
            String umCant = (String) vistaCrear.jcbUnidadMedida.getSelectedItem();
            String rutaImag = vistaCrear.jlRutaImagen.getText();
            
            if(vistaCrear.jcbPresentacion.getSelectedItem().equals("AMPULA"))
            {
                int presentacion = 100; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("CAPSULA"))
            {
                int presentacion = 101; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("CREMA"))
            {
                int presentacion = 102; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("GEL"))
            {
                int presentacion = 103; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("GOTA"))
            {
                int presentacion = 104; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("JARABE"))
            {
                int presentacion = 105; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("SHAMPOO"))
            {
                int presentacion = 106; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("SUSPENCIÓN"))
            {
                int presentacion = 107; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("SUPOSITORIO"))
            {
                int presentacion = 108; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("TABLETA"))
            {
                int presentacion = 109; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }
            else if(vistaCrear.jcbPresentacion.getSelectedItem().equals("OVULOS"))
            {
                int presentacion = 110; 
                medDAO.insertInTable(barCode, nameMed, nameFab, cant, umCant, rutaImag, presentacion);
            }    
            
        }   
        /*if(e.getSource() == vistaCrear.jbSusActiva)
        {
            vistaCrear.dispose();
            ViewSusAct viewSusAct = new ViewSusAct(vistaCrear.jtfNomMedicamento.getText());     
            SustanciaActDAO susActDAO = new SustanciaActDAO();
            ControSusAct controSusAct = new ControSusAct(viewSusAct, susActDAO);
            
            viewSusAct.setVisible(true);
        }*/
        if(e.getSource() == vistaCrear.jmiBack)
        {
            vistaCrear.dispose();
            JFrameMain frameMain = new JFrameMain();
            ControMain controMain = new ControMain(frameMain);        
            frameMain.setVisible(true);
        }
    }
    
}
