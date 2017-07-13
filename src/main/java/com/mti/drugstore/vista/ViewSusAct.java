/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.vista;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rascencio
 */
public class ViewSusAct extends JFrame
{
    private JMenuBar jMenuBar;
    private JMenu jmAdd;
    private JMenu jmHelp;
    //public JMenuItem jmiAddProduct;
    public JMenuItem jmiClearFiels;
    public JMenuItem jmiBack;
    public JMenuItem jmiExit;
    public JMenuItem jmiAbout;
    
    private JPanel jpContenedor;
    private TitledBorder ttbContenedor;
    
    private JLabel jlSusAct_1;
    private JLabel jlSusAct_2;
    private JLabel jlSusAct_3;
    private JLabel jlSusAct_4;
    private JLabel jlSusAct_5;
    private JLabel jlSusAct_6;
    private JLabel jlSusAct_7;
    private JLabel jlSusAct_8;
    private JLabel jlSusAct_9;
    private JLabel jlSusAct_10;
    
    public JTextField jtfSusAct_1;
    public JTextField jtfSusAct_2;
    public JTextField jtfSusAct_3;
    public JTextField jtfSusAct_4;
    public JTextField jtfSusAct_5;
    public JTextField jtfSusAct_6;
    public JTextField jtfSusAct_7;
    public JTextField jtfSusAct_8;
    public JTextField jtfSusAct_9;
    public JTextField jtfSusAct_10;
    
    public JTextField jtfCantidad_1;
    public JTextField jtfCantidad_2;
    public JTextField jtfCantidad_3;
    public JTextField jtfCantidad_4;
    public JTextField jtfCantidad_5;
    public JTextField jtfCantidad_6;
    public JTextField jtfCantidad_7;
    public JTextField jtfCantidad_8;
    public JTextField jtfCantidad_9;
    public JTextField jtfCantidad_10;
    
    public JComboBox<String> jcbUnidadMedida_1;
    public JComboBox<String> jcbUnidadMedida_2;
    public JComboBox<String> jcbUnidadMedida_3;
    public JComboBox<String> jcbUnidadMedida_4;
    public JComboBox<String> jcbUnidadMedida_5;
    public JComboBox<String> jcbUnidadMedida_6;
    public JComboBox<String> jcbUnidadMedida_7;
    public JComboBox<String> jcbUnidadMedida_8;
    public JComboBox<String> jcbUnidadMedida_9;
    public JComboBox<String> jcbUnidadMedida_10;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_1;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_2;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_3;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_4;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_5;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_6;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_7;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_8;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_9;
    private DefaultComboBoxModel<String> dcbmUnidadMedida_10;
    private String[] strUnidadMedida = {"","mcg","mg","g","ui","ml"};
    
    public JButton jbSave;
    
    private String strMedACrear;
    
    public ViewSusAct(String strMedACrear)
    {
        this.strMedACrear = strMedACrear;
        initComponents(strMedACrear);
    }
    
    public void initComponents(String strMed)
    {
        setLayout(null);
        
        jMenuBar = new JMenuBar();
        jmAdd = new JMenu();
        jmHelp = new JMenu();
        //jmiAddProduct = new JMenuItem();
        jmiClearFiels = new JMenuItem();
        jmiBack = new JMenuItem();
        jmiExit = new JMenuItem();
        jmiAbout = new JMenuItem();
        
        jpContenedor = new JPanel();
        ttbContenedor= new TitledBorder("Crear Producto");
        
        jlSusAct_1 = new JLabel();
        jlSusAct_2 = new JLabel();
        jlSusAct_3 = new JLabel();
        jlSusAct_4 = new JLabel();
        jlSusAct_5 = new JLabel();
        jlSusAct_6 = new JLabel();
        jlSusAct_7 = new JLabel();
        jlSusAct_8 = new JLabel();
        jlSusAct_9 = new JLabel();
        jlSusAct_10 = new JLabel();
        
        jtfSusAct_1 = new JTextField();
        jtfSusAct_2 = new JTextField();
        jtfSusAct_3 = new JTextField();
        jtfSusAct_4 = new JTextField();
        jtfSusAct_5 = new JTextField();
        jtfSusAct_6 = new JTextField();
        jtfSusAct_7 = new JTextField();
        jtfSusAct_8 = new JTextField();
        jtfSusAct_9 = new JTextField();
        jtfSusAct_10 = new JTextField();
        
        jtfCantidad_1 = new JTextField();
        jtfCantidad_2 = new JTextField();
        jtfCantidad_3 = new JTextField();
        jtfCantidad_4 = new JTextField();
        jtfCantidad_5 = new JTextField();
        jtfCantidad_6 = new JTextField();
        jtfCantidad_7 = new JTextField();
        jtfCantidad_8 = new JTextField();
        jtfCantidad_9 = new JTextField();
        jtfCantidad_10 = new JTextField();
        
        jcbUnidadMedida_1 = new JComboBox<String>();
        jcbUnidadMedida_2 = new JComboBox<String>();
        jcbUnidadMedida_3 = new JComboBox<String>();
        jcbUnidadMedida_4 = new JComboBox<String>();
        jcbUnidadMedida_5 = new JComboBox<String>();
        jcbUnidadMedida_6 = new JComboBox<String>();
        jcbUnidadMedida_7 = new JComboBox<String>();
        jcbUnidadMedida_8 = new JComboBox<String>();
        jcbUnidadMedida_9 = new JComboBox<String>();
        jcbUnidadMedida_10 = new JComboBox<String>();
        dcbmUnidadMedida_1 = new DefaultComboBoxModel<String>(strUnidadMedida);
        dcbmUnidadMedida_2 = new DefaultComboBoxModel<String>(strUnidadMedida);
        dcbmUnidadMedida_3 = new DefaultComboBoxModel<String>(strUnidadMedida);
        dcbmUnidadMedida_4 = new DefaultComboBoxModel<String>(strUnidadMedida);
        dcbmUnidadMedida_5 = new DefaultComboBoxModel<String>(strUnidadMedida);
        dcbmUnidadMedida_6 = new DefaultComboBoxModel<String>(strUnidadMedida);
        dcbmUnidadMedida_7 = new DefaultComboBoxModel<String>(strUnidadMedida);
        dcbmUnidadMedida_8 = new DefaultComboBoxModel<String>(strUnidadMedida);
        dcbmUnidadMedida_9 = new DefaultComboBoxModel<String>(strUnidadMedida);
        dcbmUnidadMedida_10 = new DefaultComboBoxModel<String>(strUnidadMedida);    
        
        jbSave = new JButton();
        
        //jMenuBar.setBounds(0, 0, 480, 20);       
        
        jmAdd.setText("Productos");
        jmHelp.setText("Ayuda");
        //jmiAddProduct.setText("Crear Producto");
        jmiClearFiels.setText("Limpiar");
        jmiClearFiels.setToolTipText("Limpiar todos los campos");
        jmiBack.setText("Regresar");
        jmiBack.setToolTipText("Regresar a la ventana anterior");
        jmiExit.setText("Salir");
        jmiExit.setToolTipText("Salir de la aplicación");
        jmiAbout.setText("Acerca de");
        jmiAbout.setToolTipText("Información del software");
        
        jpContenedor.setLayout(null);
        jpContenedor.setBorder(ttbContenedor);
        jpContenedor.setBounds(10, 10, 450, 470);        
               
        jlSusAct_1.setText("Sustancia Activa 1");
        jlSusAct_1.setBounds(10, 30, 130, 25);
        jtfSusAct_1.setBounds(150, 30, 130, 25);   
        jtfSusAct_1.setToolTipText("Ingresa la sustancia activa");
        jcbUnidadMedida_1.setModel(dcbmUnidadMedida_1);
        jtfCantidad_1.setBounds(290, 30, 65, 25);
        jtfCantidad_1.setToolTipText("Ingresa la cantidad de sustancia activa");
        jcbUnidadMedida_1.setBounds(365, 30, 65, 25);
        jcbUnidadMedida_1.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jlSusAct_2.setText("Sustancia Activa 2");
        jlSusAct_2.setBounds(10, 70, 130, 25);
        jtfSusAct_2.setBounds(150, 70, 130, 25);    
        jtfSusAct_2.setToolTipText("Ingresa la sustancia activa");
        jcbUnidadMedida_2.setModel(dcbmUnidadMedida_2);
        jtfCantidad_2.setToolTipText("Ingresa la cantidad de sustancia activa");
        jtfCantidad_2.setBounds(290, 70, 65, 25);
        jcbUnidadMedida_2.setBounds(365, 70, 65, 25);
        jcbUnidadMedida_2.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jlSusAct_3.setText("Sustancia Activa 3");
        jlSusAct_3.setBounds(10, 110, 130, 25);
        jtfSusAct_3.setBounds(150, 110, 130, 25);  
        jtfSusAct_3.setToolTipText("Ingresa la sustancia activa");
        jcbUnidadMedida_3.setModel(dcbmUnidadMedida_3);
        jtfCantidad_3.setToolTipText("Ingresa la cantidad de sustancia activa");
        jtfCantidad_3.setBounds(290, 110, 65, 25);
        jcbUnidadMedida_3.setBounds(365, 110, 65, 25);
        jcbUnidadMedida_3.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jlSusAct_4.setText("Sustancia Activa 4");
        jlSusAct_4.setBounds(10, 150, 130, 25);
        jtfSusAct_4.setBounds(150, 150, 130, 25);  
        jtfSusAct_4.setToolTipText("Ingresa la sustancia activa");
        jcbUnidadMedida_4.setModel(dcbmUnidadMedida_4);
        jtfCantidad_4.setToolTipText("Ingresa la cantidad de sustancia activa");
        jtfCantidad_4.setBounds(290, 150, 65, 25);
        jcbUnidadMedida_4.setBounds(365, 150, 65, 25);
        jcbUnidadMedida_4.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jlSusAct_5.setText("Sustancia Activa 5");
        jlSusAct_5.setBounds(10, 190, 130, 25);
        jtfSusAct_5.setBounds(150, 190, 130, 25);   
        jtfSusAct_5.setToolTipText("Ingresa la sustancia activa");
        jcbUnidadMedida_5.setModel(dcbmUnidadMedida_5);
        jtfCantidad_5.setToolTipText("Ingresa la cantidad de sustancia activa");
        jtfCantidad_5.setBounds(290, 190, 65, 25);
        jcbUnidadMedida_5.setBounds(365, 190, 65, 25);   
        jcbUnidadMedida_5.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jlSusAct_6.setText("Sustancia Activa 6");
        jlSusAct_6.setBounds(10, 230, 130, 25);
        jtfSusAct_6.setBounds(150, 230, 130, 25);  
        jtfSusAct_6.setToolTipText("Ingresa la sustancia activa");
        jcbUnidadMedida_6.setModel(dcbmUnidadMedida_6);
        jtfCantidad_6.setToolTipText("Ingresa la cantidad de sustancia activa");
        jtfCantidad_6.setBounds(290, 230, 65, 25);
        jcbUnidadMedida_6.setBounds(365, 230, 65, 25);
        jcbUnidadMedida_6.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jlSusAct_7.setText("Sustancia Activa 7");
        jlSusAct_7.setBounds(10, 270, 130, 25);
        jtfSusAct_7.setBounds(150, 270, 130, 25);
        jtfSusAct_7.setToolTipText("Ingresa la sustancia activa");               
        jcbUnidadMedida_7.setModel(dcbmUnidadMedida_7);
        jtfCantidad_7.setToolTipText("Ingresa la cantidad de sustancia activa");
        jtfCantidad_7.setBounds(290, 270, 65, 25);
        jcbUnidadMedida_7.setBounds(365, 270, 65, 25);
        jcbUnidadMedida_7.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jlSusAct_8.setText("Sustancia Activa 8");
        jlSusAct_8.setBounds(10, 310, 130, 25);
        jtfSusAct_8.setBounds(150, 310, 130, 25);
        jtfSusAct_8.setToolTipText("Ingresa la sustancia activa");
        jcbUnidadMedida_8.setModel(dcbmUnidadMedida_8);
        jtfCantidad_8.setToolTipText("Ingresa la cantidad de sustancia activa");
        jtfCantidad_8.setBounds(290, 310, 65, 25);
        jcbUnidadMedida_8.setBounds(365, 310, 65, 25);
        jcbUnidadMedida_8.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jlSusAct_9.setText("Sustancia Activa 9");
        jlSusAct_9.setBounds(10, 350, 130, 25);
        jtfSusAct_9.setBounds(150, 350, 130, 25);
        jtfSusAct_9.setToolTipText("Ingresa la sustancia activa");
        jcbUnidadMedida_9.setModel(dcbmUnidadMedida_9);
        jtfCantidad_9.setToolTipText("Ingresa la cantidad de sustancia activa");
        jtfCantidad_9.setBounds(290, 350, 65, 25);
        jcbUnidadMedida_9.setBounds(365, 350, 65, 25);
        jcbUnidadMedida_9.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jlSusAct_10.setText("Sustancia Activa 10");
        jlSusAct_10.setBounds(10, 390, 140, 25);
        jtfSusAct_10.setBounds(150, 390, 130, 25);   
        jtfSusAct_10.setToolTipText("Ingresa la sustancia activa");
        jcbUnidadMedida_10.setModel(dcbmUnidadMedida_10);
        jtfCantidad_10.setToolTipText("Ingresa la cantidad de sustancia activa");
        jtfCantidad_10.setBounds(290, 390, 65, 25);
        jcbUnidadMedida_10.setBounds(365, 390, 65, 25);
        jcbUnidadMedida_10.setToolTipText("Selecciona la unidad de medida de la sustancia activa");
        
        jbSave.setText("Guardar");
        jbSave.setToolTipText("Guardar las sustancias activas del medicamento a crear");
        jbSave.setBounds(290, 430, 140, 30);
        
        //add(jMenuBar);
        jMenuBar.add(jmAdd);
        jMenuBar.add(jmHelp);
        //jmAdd.add(jmiAddProduct);
        jmAdd.add(jmiClearFiels);
        jmAdd.add(jmiBack);
        jmAdd.add(jmiExit);
        jmHelp.add(jmiAbout);
        add(jpContenedor);
        jpContenedor.add(jlSusAct_1);
        jpContenedor.add(jtfSusAct_1);
        jpContenedor.add(jtfCantidad_1);
        jpContenedor.add(jcbUnidadMedida_1);        
        jpContenedor.add(jlSusAct_2);
        jpContenedor.add(jtfSusAct_2);
        jpContenedor.add(jtfCantidad_2);
        jpContenedor.add(jcbUnidadMedida_2);        
        jpContenedor.add(jlSusAct_3);
        jpContenedor.add(jtfSusAct_3);
        jpContenedor.add(jtfCantidad_3);
        jpContenedor.add(jcbUnidadMedida_3);        
        jpContenedor.add(jlSusAct_4);
        jpContenedor.add(jtfSusAct_4);
        jpContenedor.add(jtfCantidad_4);
        jpContenedor.add(jcbUnidadMedida_4);        
        jpContenedor.add(jlSusAct_5);
        jpContenedor.add(jtfSusAct_5);
        jpContenedor.add(jtfCantidad_5);
        jpContenedor.add(jcbUnidadMedida_5);        
        jpContenedor.add(jlSusAct_6);
        jpContenedor.add(jtfSusAct_6);
        jpContenedor.add(jtfCantidad_6);
        jpContenedor.add(jcbUnidadMedida_6);        
        jpContenedor.add(jlSusAct_7);
        jpContenedor.add(jtfSusAct_7);
        jpContenedor.add(jtfCantidad_7);
        jpContenedor.add(jcbUnidadMedida_7);        
        jpContenedor.add(jlSusAct_8);
        jpContenedor.add(jtfSusAct_8);
        jpContenedor.add(jtfCantidad_8);
        jpContenedor.add(jcbUnidadMedida_8);        
        jpContenedor.add(jlSusAct_9);
        jpContenedor.add(jtfSusAct_9);
        jpContenedor.add(jtfCantidad_9);
        jpContenedor.add(jcbUnidadMedida_9);        
        jpContenedor.add(jlSusAct_10);
        jpContenedor.add(jtfSusAct_10);
        jpContenedor.add(jtfCantidad_10);
        jpContenedor.add(jcbUnidadMedida_10);
        jpContenedor.add(jbSave);
        
        setSize(480, 540);
        setResizable(false);
        setTitle(strMed);
        setJMenuBar(jMenuBar);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }    
}
