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
    
    public JTextField jtfCodBarraMedicamento;
    public JTextField jtfNomMedicamento;
    public JTextField jtfLaboratorio;
    public JTextField jtfCantidad;
    public JComboBox<String> jcbPresentacion;
    public JButton jbAgregarImagen;
    public JComboBox<String> jcbUnidadMedida;
    private DefaultComboBoxModel<String> dcbmUnidadMedida;
    private String[] strUnidadMedida = {"","mcg","mg","g","ui","ml","pz"};
    
    public JButton jbCrear;
    public JButton jbLimpiar;
    
    private JPanel jpFormula;
    private TitledBorder ttbFormula;
    private JLabel jlSusActFormula;
    public JComboBox<String> jcbSusActDB;
    public JButton jbAgregarSusAct;
    private JLabel jlCantSusAct;
    public JTextField jtfCantSusAct;
    public JComboBox<String> jcbUmSusAct;
    private DefaultComboBoxModel<String> dcbmUmSusAct;
    public JButton jbAgregarFormula;
    
    private JPanel jpImagen;
    private TitledBorder ttbImagen;
    public JLabel jlImagen;
    public JLabel jlRutaImagen;
    
    
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

        jtfCodBarraMedicamento = new JTextField();
        jtfNomMedicamento = new JTextField();
        jtfLaboratorio = new JTextField();
        jtfCantidad = new JTextField();
        jcbPresentacion = new JComboBox<String>();
        jbAgregarImagen = new JButton();
        jcbUnidadMedida = new JComboBox<String>();
        dcbmUnidadMedida = new DefaultComboBoxModel<String>(strUnidadMedida);
        
        jpImagen = new JPanel();
        ttbImagen = new TitledBorder("Imagen");
        jlImagen = new JLabel();   
        jlRutaImagen = new JLabel();
        
        jpFormula = new JPanel();
        ttbFormula = new TitledBorder("Formula Medicamento");
        jlSusActFormula = new JLabel();
        jcbSusActDB = new JComboBox<String>();
        jbAgregarSusAct = new JButton();
        jlCantSusAct = new JLabel();
        jtfCantSusAct = new JTextField();
        jcbUmSusAct = new JComboBox<String>();
        dcbmUmSusAct = new DefaultComboBoxModel<String>(strUnidadMedida);
        jbAgregarFormula = new JButton();

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
        jpCrearProducto.setBounds(10, 30, 610, 500);      
        
        jpImagen.setLayout(null);
        jpImagen.setBorder(ttbImagen);
        jpImagen.setBounds(10, 150, 590, 280);
        
        jlImagen.setText("Agrega imagen");
        jlImagen.setBounds(10, 10, 570, 220);
        
        jlRutaImagen.setText("Ruta imagen");
        jlRutaImagen.setBounds(10, 240, 400, 20);
        
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
        
        jlCantidad.setText("Cantidad");
        jlCantidad.setBounds(290, 70, 130, 25);        
        jtfCantidad.setBounds(370, 70, 85, 25);
        jtfCantidad.setToolTipText("Ingresa de cantidad neta de producto que contiene el empaque");
        
        jcbUnidadMedida.setModel(dcbmUnidadMedida);
        jcbUnidadMedida.setBounds(475, 70, 125, 25);
        jcbUnidadMedida.setToolTipText("Elige una opción");
        
        jlPresentacion.setText("Presentación");
        jlPresentacion.setBounds(10, 110, 130, 25);
        
        jcbPresentacion.setBounds(140, 110, 130, 25);
        jcbPresentacion.setToolTipText("Elige una opción");   
        
        jbAgregarImagen.setText("Agregar imagen");
        jbAgregarImagen.setBounds(350, 110, 250, 25);
        
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setToolTipText("Limpia todos los campos");
        jbLimpiar.setBounds(10, 450, 250, 40);
        
        jbCrear.setText("Crear Producto");
        jbCrear.setToolTipText("Guarda todos los datos en la base de datos del medicamento");
        jbCrear.setBounds(350, 450, 250, 40);
        
        jpFormula.setLayout(null);
        jpFormula.setBorder(ttbFormula);
        jpFormula.setBounds(10, 540, 610, 130);
        
        jlSusActFormula.setText("Sustancia Activa");
        jlSusActFormula.setBounds(10, 30, 130, 25);
        jcbSusActDB.setBounds(140, 30, 130, 25);
        jcbSusActDB.setToolTipText("Elige una sustancia activa de la lista");
        
        jbAgregarSusAct.setText("...");
        jbAgregarSusAct.setBounds(290, 30, 50, 25);
        jbAgregarSusAct.setToolTipText("Presiona para agregar sustancia activa a la base de datos");
        
        jlCantSusAct.setText("Cant Sust Act");
        jlCantSusAct.setBounds(360, 30, 130, 25);
        jtfCantSusAct.setBounds(470, 30, 60, 25);
        jtfCantSusAct.setToolTipText("Ingresa la cantidad de sustancia activa en este medicamento");
                
        jcbUmSusAct.setModel(dcbmUmSusAct);
        jcbUmSusAct.setBounds(540, 30, 60, 25);
        jcbUmSusAct.setToolTipText("Elige una unidad de medida de la sustancia activa");
        
        jbAgregarFormula.setText("Add Formula");
        jbAgregarFormula.setBounds(350, 80, 250, 40);
        jbAgregarFormula.setToolTipText("Presionar para agregar formula a este medicamento");
        
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
        jpCrearProducto.add(jcbUnidadMedida);
        jpCrearProducto.add(jlLaboratorio);
        jpCrearProducto.add(jtfLaboratorio);
        jpCrearProducto.add(jlPresentacion);
        jpCrearProducto.add(jcbPresentacion);
        jpCrearProducto.add(jbAgregarImagen);
        jpCrearProducto.add(jbCrear);
        jpCrearProducto.add(jbLimpiar);
        jpCrearProducto.add(jpImagen);
        jpImagen.add(jlImagen);
        jpImagen.add(jlRutaImagen);
        add(jpFormula);
        jpFormula.add(jlSusActFormula);
        jpFormula.add(jcbSusActDB);
        jpFormula.add(jbAgregarSusAct);
        jpFormula.add(jlCantSusAct);
        jpFormula.add(jtfCantSusAct);
        jpFormula.add(jcbUmSusAct);
        jpFormula.add(jbAgregarFormula);
        
        setSize(630, 700);
        setResizable(false);
        setTitle("Salutem");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
}
