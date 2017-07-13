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
    private JLabel jlLaboratorio;
    private JLabel jlCantidad;
    private JLabel jlPresentacion;
    private JLabel jlUnidadMedida;
    
    public JTextField jtfCodBarraMedicamento;
    public JTextField jtfNomMedicamento;
    public JTextField jtfLaboratorio;
    public JTextField jtfCantidad;
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
    
    public JButton jbSusActiva;
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
        jlLaboratorio = new JLabel();
        jlCantidad = new JLabel();
        jlPresentacion = new JLabel();
        jlUnidadMedida = new JLabel();

        jtfCodBarraMedicamento = new JTextField();
        jtfNomMedicamento = new JTextField();
        jtfLaboratorio = new JTextField();
        jtfCantidad = new JTextField();
        jcbPresentacion = new JComboBox<String>();
        dcbmPresentacion = new DefaultComboBoxModel<String>(strPresentacion);
        jtfUnidadMedida = new JTextField();
        jcbUnidadMedida = new JComboBox<String>();
        dcbmUnidadMedida = new DefaultComboBoxModel<String>(strUnidadMedida);

        jbSusActiva = new JButton();
        jbCrear = new JButton();
        jbLimpiar = new JButton();
        
        jMenuBar.setBounds(0, 0, 640, 20);       
        
        jmAdd.setText("Productos");
        jmHelp.setText("Ayuda");
        jmiAddProduct.setText("Crear Producto");
        jmiAddProduct.setToolTipText("Agregar medicamento a la base de datos");
        jmiClearFiels.setText("Limpiar");
        jmiClearFiels.setToolTipText("Limpiar todos los campos");
        jmiBack.setText("Regresar");
        jmiBack.setToolTipText("Regresar a menú principal");
        jmiExit.setText("Salir");
        jmiExit.setToolTipText("Salir de la aplicación");
        jmiAbout.setText("Acerca de");  
        jmiAbout.setToolTipText("Información del software");
        
        jpCrearProducto.setLayout(null);
        jpCrearProducto.setBorder(ttbCrearProducto);
        jpCrearProducto.setBounds(10, 30, 610, 220);        
        
        jlCodBarraMedicamento.setText("Código de Barras");
        jlCodBarraMedicamento.setBounds(10, 30, 130, 25);
        jtfCodBarraMedicamento.setBounds(140, 30, 130, 25);
        jtfCodBarraMedicamento.setToolTipText("Escanea el código de barras del medicamento");
                
        jlNomMedicamento.setText("Nombre Comercial");
        jlNomMedicamento.setBounds(290, 30, 130, 25);
        jtfNomMedicamento.setBounds(430, 30, 170, 25);
        jtfNomMedicamento.setToolTipText("Ingresa el nombre comercial del medicamento");
        
        jlLaboratorio.setText("Nombre Lab.");
        jlLaboratorio.setBounds(10, 70, 130, 25);
        jtfLaboratorio.setBounds(140, 70, 130, 25);
        jtfLaboratorio.setToolTipText("Ingresa el nombre del laboratorio fabricante del medicamento");
        
        jlPresentacion.setText("Presentación");
        jlPresentacion.setBounds(290, 70, 130, 25);
        
        jcbPresentacion.setModel(dcbmPresentacion);
        jcbPresentacion.setBounds(430, 70, 170, 25);
        jcbPresentacion.setToolTipText("Elige una opción");
        
        jlCantidad.setText("Cantidad");
        jlCantidad.setBounds(10, 110, 130, 25);        
        jtfCantidad.setBounds(140, 110, 130, 25);
        jtfCantidad.setToolTipText("Ingresa de cantidad neta de producto que contiene el empaque");
        
        jlUnidadMedida.setText("Unidad Medida");
        jlUnidadMedida.setBounds(290, 110, 130, 25);
        jtfUnidadMedida.setBounds(430, 110, 65, 25); 
        jtfUnidadMedida.setToolTipText("Ingresa la cantidad según la presentación");
        
        jcbUnidadMedida.setModel(dcbmUnidadMedida);
        jcbUnidadMedida.setBounds(505, 110, 95, 25);
        jcbUnidadMedida.setToolTipText("Elige una opción");
        
        jbSusActiva.setText("Sustancia Activa");
        jbSusActiva.setToolTipText("Ingresa las sustancias activas que componen el medicamento");
        jbSusActiva.setBounds(10, 170, 150, 30);
        
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setToolTipText("Limpia todos los campos");
        jbLimpiar.setBounds(280, 170, 150, 30);
        
        jbCrear.setText("Crear Producto");
        jbCrear.setToolTipText("Guarda todos los datos en la base de datos del medicamento");
        jbCrear.setBounds(450, 170, 150, 30);
        
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
        jpCrearProducto.add(jlCantidad);
        jpCrearProducto.add(jtfCantidad);
        jpCrearProducto.add(jlPresentacion);
        jpCrearProducto.add(jcbPresentacion);
        jpCrearProducto.add(jlUnidadMedida);
        jpCrearProducto.add(jtfUnidadMedida);
        jpCrearProducto.add(jcbUnidadMedida);
        jpCrearProducto.add(jlLaboratorio);
        jpCrearProducto.add(jtfLaboratorio);
        jpCrearProducto.add(jbSusActiva);
        jpCrearProducto.add(jbCrear);
        jpCrearProducto.add(jbLimpiar);
        
        setSize(640, 290);
        setResizable(false);
        setTitle("Salutem");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
}
