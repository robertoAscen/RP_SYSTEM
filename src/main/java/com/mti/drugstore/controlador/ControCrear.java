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
import com.mti.drugstore.vista.JFrameMain;
import com.mti.drugstore.vista.ViewCreateProduct;
import com.mti.drugstore.vista.ViewMainMenu;
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
    ViewCreateProduct vistaCrear = new ViewCreateProduct();
    MedicamentoDAO medDAO = new MedicamentoDAO();
    PresentacionDAO presentacionDAO = new PresentacionDAO();
    SustanciaActDAO sustanciaDAO = new SustanciaActDAO();
    FormulaDAO formulaDAO = new FormulaDAO();
    
    public ControCrear(ViewCreateProduct vistaCrear, MedicamentoDAO medDAO, PresentacionDAO presentacionDAO, SustanciaActDAO sustanciaDAO, FormulaDAO formulaDAO)
    {
        this.medDAO = medDAO;
        this.presentacionDAO = presentacionDAO;
        this.sustanciaDAO = sustanciaDAO;
        this.formulaDAO = formulaDAO;
        this.vistaCrear = vistaCrear;
        this.vistaCrear.jmiAbout.addActionListener(this);
        this.vistaCrear.jbGuardar.addActionListener(this);
        this.vistaCrear.jmiBack.addActionListener(this); 
        this.vistaCrear.jbAgregarImagen.addActionListener(this);
        this.vistaCrear.jcbPresentacion.setModel(presentacionDAO.findInTable());
        this.vistaCrear.jbAgregarPresentacion.addActionListener(this);
        this.vistaCrear.jbAgregarSusAct.addActionListener(this);
        this.vistaCrear.jbAgregarFormula.addActionListener(this);
        this.vistaCrear.jmiNewProduct.addActionListener(this);
    }
    
    public void CleanFielsUP()
    {
        vistaCrear.jtfCodBarraMedicamento.setText("");
        vistaCrear.jtfNomMedicamento.setText("");
        vistaCrear.jtfLaboratorio.setText("");
        vistaCrear.jtfCantidad.setText("");
        vistaCrear.jtfCantMed.setText("");
        vistaCrear.jcbPresentacion.setSelectedIndex(0);
        vistaCrear.jcbUnidadMedida.setSelectedIndex(0);
        vistaCrear.jlImagen.setText("Agrega imagen");
        vistaCrear.jlImagen.setIcon(null);
        vistaCrear.jlRutaImagen.setText("Ruta imagen");
    }
    
    public void CleanFielsDown()
    {
        vistaCrear.jcbSusActDB.setSelectedIndex(0);
        vistaCrear.jtfCantSusAct.setText("");
        vistaCrear.jcbUmSusAct.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == vistaCrear.jbGuardar)
        {     
            if(vistaCrear.jtfCodBarraMedicamento.getText().length() !=0
                    && vistaCrear.jtfNomMedicamento.getText().length() !=0
                    && vistaCrear.jtfLaboratorio.getText().length() !=0
                    && vistaCrear.jtfCantidad.getText().length() !=0
                    && vistaCrear.jcbPresentacion.getSelectedIndex() !=0
                    && vistaCrear.jtfCantMed.getText().length() !=0
                    && vistaCrear.jcbUnidadMedida.getSelectedIndex() !=0)
            {
                String idMed = vistaCrear.jtfCodBarraMedicamento.getText();
                String barCode = vistaCrear.jtfCodBarraMedicamento.getText();
                String nameMed = vistaCrear.jtfNomMedicamento.getText();
                String nameFab = vistaCrear.jtfLaboratorio.getText();
                String present = (String)vistaCrear.jcbPresentacion.getSelectedItem();
                System.out.println(present);
                String idPresent = presentacionDAO.findInTablee(present);
                System.out.println(idPresent);
                String cantNeta = vistaCrear.jtfCantidad.getText();
                String cantMed = vistaCrear.jtfCantMed.getText();
                String umCant = (String) vistaCrear.jcbUnidadMedida.getSelectedItem();
                String rutaImag = vistaCrear.jlRutaImagen.getText();
            
                if(medDAO.insertInTable(idMed, barCode, nameMed, nameFab, cantNeta, idPresent, cantMed, umCant, rutaImag).equals("Registro exitoso!!!"))
                {
                    JOptionPane.showMessageDialog(vistaCrear, "Producto guardado exitosamente",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                    
                    vistaCrear.jtfNomMedicamento.setEnabled(false);
                    vistaCrear.jtfLaboratorio.setEnabled(false);
                    vistaCrear.jtfCodBarraMedicamento.setEnabled(false);
                    vistaCrear.jtfCantidad.setEnabled(false);
                    vistaCrear.jtfCantMed.setEnabled(false);
                    vistaCrear.jcbPresentacion.setEnabled(false);
                    vistaCrear.jcbUnidadMedida.setEnabled(false);
                    vistaCrear.jbAgregarImagen.setEnabled(false);
                    vistaCrear.jbAgregarPresentacion.setEnabled(false);
                    vistaCrear.jcbSusActDB.setEnabled(true);
                    vistaCrear.jbAgregarSusAct.setEnabled(true);
                    vistaCrear.jtfCantSusAct.setEnabled(true);
                    vistaCrear.jcbSusActDB.setModel(sustanciaDAO.findInTable());
                    vistaCrear.jcbUmSusAct.setEnabled(true);            
                    vistaCrear.jbAgregarFormula.setEnabled(true);    
                    vistaCrear.jmiNewProduct.setEnabled(true);
                }                
            }          
            else
            {
                JOptionPane.showMessageDialog(vistaCrear, "Debes llenar todos los campos para guardar el producto",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
        
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
        
        if(e.getSource() == vistaCrear.jmiAbout)
        {
            JOptionPane.showMessageDialog(vistaCrear, "Software para control de inventarios farmacéuticos\nAutor:"
                    + "Roberto Ascencio\nCompañia: Enviromentec\nwww.enviromentec.com.mx\nFecha: 09/07/2017",
                    "Información",JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(e.getSource() == vistaCrear.jbAgregarPresentacion)
        {
            String strPresentacion = JOptionPane.showInputDialog(vistaCrear, "Ingresa la presentación");
            
            if(strPresentacion.length()!=0)
            {
                presentacionDAO.insertInTable(strPresentacion);
                vistaCrear.jcbPresentacion.setModel(presentacionDAO.findInTable());
            }
            else
            {
                JOptionPane.showMessageDialog(vistaCrear, "Debe ingresar una presentación valida para poder continuar",
                        "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        if(e.getSource() == vistaCrear.jbAgregarSusAct)
        {
            String strSusAct = JOptionPane.showInputDialog(vistaCrear, "Ingresa la sustancia activa");
            
            if(strSusAct.length()!=0)
            {
                sustanciaDAO.insertInTable(strSusAct);
                vistaCrear.jcbSusActDB.setModel(sustanciaDAO.findInTable());
            }
            else
            {
                JOptionPane.showMessageDialog(vistaCrear, "Debe ingresar una Sustancia Activa valida para poder continuar",
                        "Advertencia",JOptionPane.WARNING_MESSAGE);
            }            
        }
        
        if(e.getSource() == vistaCrear.jbAgregarFormula)
        {
            if(vistaCrear.jcbSusActDB.getSelectedIndex() !=0 
                    && vistaCrear.jtfCantSusAct.getText().length() !=0
                    && vistaCrear.jcbUmSusAct.getSelectedIndex() !=0)
            {
                String idMed = vistaCrear.jtfCodBarraMedicamento.getText();
                String susAct = (String)vistaCrear.jcbSusActDB.getSelectedItem();
                System.out.println(susAct);
                String idSusAct = sustanciaDAO.findInTablee(susAct);
                System.out.println(idSusAct);
                String contenido = vistaCrear.jtfCantSusAct.getText();
                String umSusAct = (String)vistaCrear.jcbUmSusAct.getSelectedItem();

                if(formulaDAO.insertInTable(idMed, idSusAct, contenido, umSusAct).equals("Registro exitoso!!!"))
                {
                    JOptionPane.showMessageDialog(vistaCrear, "Formula guardada exitosamente",
                            "Información",JOptionPane.INFORMATION_MESSAGE);
                    CleanFielsDown();
                }
                else
                {
                    JOptionPane.showMessageDialog(vistaCrear, "El guardado de la formula fue erroneo",
                            "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(vistaCrear, "Debes de llenar todos los campos para guardar la formula",
                        "Advertencia",JOptionPane.WARNING_MESSAGE);
            }            
        }
        
        if(e.getSource() == vistaCrear.jmiNewProduct)
        {
            int rpta = JOptionPane.showConfirmDialog(vistaCrear, "Si sale de este medicamento y no capturó todos los datos correspondientes"
                    + "\nno podrá regresar a modificarlo\n¿Esta seguro que quiere salir de este medicamento e ingresar uno nuevo?");
            switch(rpta)
            {
                case 0:
                    CleanFielsDown();
                    vistaCrear.jcbSusActDB.setEnabled(false);
                    vistaCrear.jbAgregarSusAct.setEnabled(false);
                    vistaCrear.jtfCantSusAct.setEnabled(false);
                    vistaCrear.jcbUmSusAct.setEnabled(false);
                    vistaCrear.jbAgregarFormula.setEnabled(false);
                    CleanFielsUP();
                    vistaCrear.jtfCodBarraMedicamento.setEnabled(true);
                    vistaCrear.jtfNomMedicamento.setEnabled(true);
                    vistaCrear.jtfLaboratorio.setEnabled(true);
                    vistaCrear.jtfCantidad.setEnabled(true);
                    vistaCrear.jcbPresentacion.setEnabled(true);
                    vistaCrear.jbAgregarPresentacion.setEnabled(true);
                    vistaCrear.jtfCantMed.setEnabled(true);
                    vistaCrear.jcbUnidadMedida.setEnabled(true);
                    vistaCrear.jbAgregarImagen.setEnabled(true);
                    vistaCrear.jlImagen.setEnabled(true);
                    vistaCrear.jlImagen.setIcon(null);
                    vistaCrear.jlRutaImagen.setText("Ruta imagen");
                    vistaCrear.jlRutaImagen.setEnabled(true);                    
                    break;
                case 1:
                    break;
                case 2:
                    break;
            }            
        }
        
        
        if(e.getSource() == vistaCrear.jmiBack)
        {
            if(vistaCrear.jtfCodBarraMedicamento.getText().length() ==0
                    && vistaCrear.jtfNomMedicamento.getText().length() ==0
                    && vistaCrear.jtfLaboratorio.getText().length() ==0
                    && vistaCrear.jtfCantidad.getText().length() ==0
                    && vistaCrear.jcbPresentacion.getSelectedIndex() ==0
                    && vistaCrear.jtfCantMed.getText().length() ==0
                    && vistaCrear.jcbUnidadMedida.getSelectedIndex() ==0)
            {
                vistaCrear.dispose();
                ViewMainMenu mainMenu = new ViewMainMenu();
                ControMainMenu controMain = new ControMainMenu(mainMenu);        
                mainMenu.setVisible(true);
            }
            else
            {
                int rpta = JOptionPane.showConfirmDialog(vistaCrear, "Esta a punto de salir de la venta para guardar productos\n"
                        + "y aun no termina el registro del producto actual\n¿Esta seguro que desea regresar al menú principal?");
                switch(rpta)
                {
                    case 0:
                        vistaCrear.dispose();
                        ViewMainMenu mainMenu = new ViewMainMenu();
                        ControMainMenu controMain = new ControMainMenu(mainMenu);        
                        mainMenu.setVisible(true);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }
        }
    }
    
}
