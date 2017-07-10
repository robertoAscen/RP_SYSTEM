/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.vista;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
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
public class ViewCreate extends JFrame
{
    private JMenuBar jMenuBar;
    private JMenu jmAdd;
    private JMenu jmHelp;
    public JMenuItem jmiAddProduct;
    public JMenuItem jmiClearFiels;
    public JMenuItem jmiBack;
    public JMenuItem jmiExit;
    public JMenuItem jmiAbout;
    
    private JPanel jpCrearProducto;
    private TitledBorder ttbCrearProducto;
    private JLabel jlCodBarraMedicamento;
    private JLabel jlNomMedicamento;
    private JLabel jlSusAct_1;
    private JLabel jlSusAct_2;
    private JLabel jlSusAct_3;
    private JLabel jlSusAct_4;
    private JLabel jlSusAct_5;
    private JLabel jlPresentacion;
    private JLabel jlUnidadMedida;
    
    public JTextField jtfCodBarraMedicamento;
    public JTextField jtfNomMedicamento;
    public JTextField jtfSusAct_1;
    public JTextField jtfSusAct_2;
    public JTextField jtfSusAct_3;
    public JTextField jtfSusAct_4;
    public JTextField jtfSusAct_5;
    public JComboBox<String> jcbPresentacion;
    private DefaultComboBoxModel<String> dcbmPresentacion;
    private String[] strPresentacion = {"Seleccione una","Tableta", "Capsula", 
                                        "Suspención","Gota", "Sobre", 
                                        "Ampula","Supositorio", "Crema", 
                                        "Ovulos","Gel", "Polvo", 
                                        "Shampoo","Pasta", "Jarabe"};
    public JTextField jtfUnidadMedida;
    public JComboBox<String> jcbUnidadMedida;
    private DefaultComboBoxModel<String> dcbmUnidadMedida;
    private String[] strUnidadMedida = {"Seleccione una","mcg","mg","g","ui","ml"};
    
    public JButton jbCrear;
    public JButton jbLimpiar;
    
    
    public ViewCreate()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        setLayout(null);
        
        jMenuBar = new JMenuBar();
        jmAdd = new JMenu();
        jmHelp = new JMenu();
        jmiAddProduct = new JMenuItem();
        jmiClearFiels = new JMenuItem();
        jmiBack = new JMenuItem();
        jmiExit = new JMenuItem();
        jmiAbout = new JMenuItem();
        
        jpCrearProducto = new JPanel();
        ttbCrearProducto = new TitledBorder("Crear Producto");
        jlCodBarraMedicamento = new JLabel();       
        jlNomMedicamento = new JLabel();
        jlSusAct_1 = new JLabel();
        jlSusAct_2 = new JLabel();
        jlSusAct_3 = new JLabel();
        jlSusAct_4 = new JLabel();
        jlSusAct_5 = new JLabel();
        jlPresentacion = new JLabel();
        jlUnidadMedida = new JLabel();

        jtfCodBarraMedicamento = new JTextField();
        jtfNomMedicamento = new JTextField();
        jtfSusAct_1 = new JTextField();
        jtfSusAct_2 = new JTextField();
        jtfSusAct_3 = new JTextField();
        jtfSusAct_4 = new JTextField();
        jtfSusAct_5 = new JTextField();
        jcbPresentacion = new JComboBox<String>();
        dcbmPresentacion = new DefaultComboBoxModel<String>(strPresentacion);
        jtfUnidadMedida = new JTextField();
        jcbUnidadMedida = new JComboBox<String>();
        dcbmUnidadMedida = new DefaultComboBoxModel<String>(strUnidadMedida);

        jbCrear = new JButton();
        jbLimpiar = new JButton();
        
        jMenuBar.setBounds(0, 0, 900, 20);       
        
        jmAdd.setText("Productos");
        jmHelp.setText("Ayuda");
        jmiAddProduct.setText("Crear Producto");
        jmiClearFiels.setText("Limpiar");
        jmiBack.setText("Regresar");
        jmiExit.setText("Salir");
        jmiAbout.setText("Acerca de");       
        
        jpCrearProducto.setLayout(null);
        jpCrearProducto.setBorder(ttbCrearProducto);
        jpCrearProducto.setBounds(10, 30, 870, 180);        
        
        jlCodBarraMedicamento.setText("Código de Barras");
        jlCodBarraMedicamento.setBounds(10, 30, 130, 20);
        jtfCodBarraMedicamento.setBounds(140, 30, 130, 20);
                
        jlNomMedicamento.setText("Nombre Comercial");
        jlNomMedicamento.setBounds(290, 30, 130, 20);
        jtfNomMedicamento.setBounds(430, 30, 130, 20);
        
        jlSusAct_1.setText("Sustancia Activa 1");
        jlSusAct_1.setBounds(580, 30, 130, 20);
        jtfSusAct_1.setBounds(720, 30, 130, 20);
        
        jlSusAct_2.setText("Sustancia Activa 2");
        jlSusAct_2.setBounds(10, 60, 130, 20);
        jtfSusAct_2.setBounds(140, 60, 130, 20);
                
        jlSusAct_3.setText("Sustancia Activa 3");
        jlSusAct_3.setBounds(290, 60, 130, 20);
        jtfSusAct_3.setBounds(430, 60, 130, 20);
        
        jlSusAct_4.setText("Sustancia Activa 4");
        jlSusAct_4.setBounds(580, 60, 130, 20);
        jtfSusAct_4.setBounds(720, 60, 130, 20);
        
        jlSusAct_5.setText("Sustancia Activa 5");
        jlSusAct_5.setBounds(10, 90, 130, 20);
        jtfSusAct_5.setBounds(140, 90, 130, 20);
        
        jlPresentacion.setText("Presentación");
        jlPresentacion.setBounds(290, 90, 130, 20);
        
        jcbPresentacion.setModel(dcbmPresentacion);
        jcbPresentacion.setBounds(430, 90, 130, 20);
        
        jlUnidadMedida.setText("Unidad Medida");
        jlUnidadMedida.setBounds(580, 90, 130, 20);
        jtfUnidadMedida.setBounds(720, 90, 65, 20);   
        
        jcbUnidadMedida.setModel(dcbmUnidadMedida);
        jcbUnidadMedida.setBounds(795, 90, 65, 20);
        
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setBounds(530, 130, 150, 30);
        
        jbCrear.setText("Crear Producto");
        jbCrear.setBounds(700, 130, 150, 30);
        
        add(jMenuBar);
        jMenuBar.add(jmAdd);
        jMenuBar.add(jmHelp);
        jmAdd.add(jmiAddProduct);
        jmAdd.add(jmiClearFiels);
        jmAdd.add(jmiBack);
        jmAdd.add(jmiExit);
        jmHelp.add(jmiAbout);
        add(jpCrearProducto);
        jpCrearProducto.add(jlCodBarraMedicamento);
        jpCrearProducto.add(jtfCodBarraMedicamento);
        jpCrearProducto.add(jlNomMedicamento);
        jpCrearProducto.add(jtfNomMedicamento);
        jpCrearProducto.add(jlSusAct_1);
        jpCrearProducto.add(jtfSusAct_1);
        jpCrearProducto.add(jlSusAct_2);
        jpCrearProducto.add(jtfSusAct_2);
        jpCrearProducto.add(jlSusAct_3);
        jpCrearProducto.add(jtfSusAct_3);
        jpCrearProducto.add(jlSusAct_4);
        jpCrearProducto.add(jtfSusAct_4);
        jpCrearProducto.add(jlSusAct_5);
        jpCrearProducto.add(jtfSusAct_5);
        jpCrearProducto.add(jlPresentacion);
        jpCrearProducto.add(jcbPresentacion);
        jpCrearProducto.add(jlUnidadMedida);
        jpCrearProducto.add(jtfUnidadMedida);
        jpCrearProducto.add(jcbUnidadMedida);
        jpCrearProducto.add(jbCrear);
        jpCrearProducto.add(jbLimpiar);
        
        setSize(900, 250);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
}
