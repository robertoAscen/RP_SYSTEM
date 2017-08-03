/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.vista;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rascencio
 */
public class ViewCreateProduct extends JFrame
{
    /*private JMenuBar jMenuBar;
    private JMenu jmAdd;
    private JMenu jmHelp;
    public JMenuItem jmiNewProduct;
    public JMenuItem jmiBack;
    public JMenuItem jmiAbout;*/
    
    private JToolBar jtoolBar;
    public JButton jbNew;
    public JButton jbGuardar;    
    public JButton jbFinish;
    
    private JPanel jpCrearProducto;
    private TitledBorder ttbCrearProducto;
    private JLabel jlCodBarraMedicamento;
    private JLabel jlNomMedicamento;
    private JLabel jlLaboratorio;
    private JLabel jlCantNeta;
    private JLabel jlCantMed;
    public JTextField jtfCantMed;
    
    public JTextField jtfCodBarraMedicamento;
    public JTextField jtfNomMedicamento;
    public JTextField jtfLaboratorio;
    public JTextField jtfCantidad;
    public JComboBox<String> jcbPresentacion;
    public JButton jbAgregarPresentacion;
    public JButton jbAgregarImagen;
    public JComboBox<String> jcbUnidadMedida;
    private DefaultComboBoxModel<String> dcbmUnidadMedida;
    private String[] strUnidadMedida = {"","mcg","mg","g","ui","ml","pz"};
    
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
    
    private static String pathForImage = "/home/rascencio/Desktop/WORK/SW-PROJECTS/drugStoreSystem/src/main/resources/img/";
    
    public ViewCreateProduct()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        setLayout(null);
        
        /*jMenuBar = new JMenuBar();
        jmAdd = new JMenu();
        jmHelp = new JMenu();
        jmiNewProduct = new JMenuItem();
        jmiBack = new JMenuItem();
        jmiAbout = new JMenuItem();*/
        
        jtoolBar = new JToolBar();
        jbNew = new JButton();
        jbGuardar = new JButton();
        jbFinish = new JButton();
        
        jpCrearProducto = new JPanel();
        ttbCrearProducto = new TitledBorder("Crear Producto");
        jlCodBarraMedicamento = new JLabel();       
        jlNomMedicamento = new JLabel();
        jlLaboratorio = new JLabel();
        jlCantNeta = new JLabel();
        jlCantMed = new JLabel();
        
        jtfCantMed = new JTextField();
        jtfCodBarraMedicamento = new JTextField();
        jtfNomMedicamento = new JTextField();
        jtfLaboratorio = new JTextField();
        jtfCantidad = new JTextField();
        jcbPresentacion = new JComboBox<String>();
        jbAgregarPresentacion = new JButton();
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
        
        //jMenuBar.setBounds(0, 0, 640, 20);       
        
        /*jmAdd.setText("Productos");
        jmHelp.setText("Ayuda");
        jmiNewProduct.setText("Nuevo Producto");
        jmiNewProduct.setToolTipText("Crear nuevo producto");
        jmiNewProduct.setEnabled(false);
        jmiBack.setText("Menú Principal");
        jmiBack.setToolTipText("Regresar a menú principal");
        jmiAbout.setText("Acerca de");  
        jmiAbout.setToolTipText("Información del software");*/
        
        jbNew.setIcon(new ImageIcon(pathForImage+"iconsMin/addProduct.png"));
        jbNew.setEnabled(false);
        //jbNew.setToolTipText("Guardar");
        
        jbGuardar.setIcon(new ImageIcon(pathForImage+"iconsMin/save.png"));
        //jbGuardar.setToolTipText("Guardar");
        
        jbFinish.setText("Terminar");
        //jbFinish.setIcon(new ImageIcon(pathForImage+"iconsMin/save.png"));
        //jbGuardar.setToolTipText("Guardar");
        
        jtoolBar.setBounds(0, 20, 630, 30);
        jtoolBar.add(jbNew);
        jtoolBar.add(jbGuardar);
        jtoolBar.add(jbFinish);
        
        
        jpCrearProducto.setLayout(null);
        jpCrearProducto.setBorder(ttbCrearProducto);
        jpCrearProducto.setBounds(10, 60, 610, 480);      
        
        jpImagen.setLayout(null);
        jpImagen.setBorder(ttbImagen);
        jpImagen.setBounds(10, 140, 590, 330);
        
        jlImagen.setText("Agrega imagen");
        jlImagen.setBounds(100, 10, 460, 280);
        
        jlRutaImagen.setText("Ruta imagen");
        jlRutaImagen.setBounds(10, 300, 400, 20);
        
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
        
        jlCantNeta.setText("Cant. Neta");
        jlCantNeta.setBounds(290, 70, 130, 25);        
        jtfCantidad.setBounds(370, 70, 50, 25);
        jtfCantidad.setToolTipText("Ingresa de cantidad neta de producto que contiene el empaque");
        
        jcbPresentacion.setBounds(430, 70, 130, 25);
        jcbPresentacion.setToolTipText("Elige una opción");   
        
        jbAgregarPresentacion.setText("...");
        jbAgregarPresentacion.setToolTipText("Presiona para agregar otra presentación");
        jbAgregarPresentacion.setBounds(570, 70, 30, 25);
        
        jlCantMed.setText("Cant. Med.");
        jlCantMed.setBounds(10, 110, 130, 25);
        jtfCantMed.setBounds(140, 110, 50, 25);   
        
        jcbUnidadMedida.setModel(dcbmUnidadMedida);
        jcbUnidadMedida.setBounds(200, 110, 70, 25);
        jcbUnidadMedida.setToolTipText("Elige una opción");
        
        jbAgregarImagen.setText("Agregar imagen");
        jbAgregarImagen.setBounds(350, 110, 250, 25);
        
        jpFormula.setLayout(null);
        jpFormula.setBorder(ttbFormula);
        jpFormula.setBounds(10, 550, 610, 110);
        
        jlSusActFormula.setText("Sustancia Activa");
        jlSusActFormula.setBounds(10, 30, 130, 25);
        jcbSusActDB.setBounds(140, 30, 130, 25);
        jcbSusActDB.setToolTipText("Elige una sustancia activa de la lista");
        jcbSusActDB.setEnabled(false);
        
        jbAgregarSusAct.setText("...");
        jbAgregarSusAct.setBounds(290, 30, 50, 25);
        jbAgregarSusAct.setToolTipText("Presiona para agregar sustancia activa a la base de datos");
        jbAgregarSusAct.setEnabled(false);
        
        jlCantSusAct.setText("Cant Sust Act");
        jlCantSusAct.setBounds(360, 30, 130, 25);
        jtfCantSusAct.setBounds(470, 30, 60, 25);
        jtfCantSusAct.setToolTipText("Ingresa la cantidad de sustancia activa en este medicamento");
        jtfCantSusAct.setEnabled(false);
        
        jcbUmSusAct.setModel(dcbmUmSusAct);
        jcbUmSusAct.setBounds(540, 30, 60, 25);
        jcbUmSusAct.setToolTipText("Elige una unidad de medida de la sustancia activa");
        jcbUmSusAct.setEnabled(false);
        
        jbAgregarFormula.setText("Add Formula");
        jbAgregarFormula.setBounds(470, 70, 130, 25);
        jbAgregarFormula.setToolTipText("Presionar para agregar formula a este medicamento");
        jbAgregarFormula.setEnabled(false);
        
        /*add(jMenuBar);
        jMenuBar.add(jmAdd);
        jMenuBar.add(jmHelp);
        jmAdd.add(jmiNewProduct);
        jmAdd.add(jmiBack);
        jmHelp.add(jmiAbout);*/
        add(jtoolBar);
        add(jpCrearProducto);
        jpCrearProducto.add(jlCodBarraMedicamento);
        jpCrearProducto.add(jtfCodBarraMedicamento);
        jpCrearProducto.add(jlNomMedicamento);
        jpCrearProducto.add(jtfNomMedicamento);        
        jpCrearProducto.add(jlCantNeta);
        jpCrearProducto.add(jtfCantidad);
        jpCrearProducto.add(jcbUnidadMedida);
        jpCrearProducto.add(jlLaboratorio);
        jpCrearProducto.add(jtfLaboratorio);
        jpCrearProducto.add(jlCantMed);
        jpCrearProducto.add(jtfCantMed);
        jpCrearProducto.add(jcbPresentacion);
        jpCrearProducto.add(jbAgregarPresentacion);
        jpCrearProducto.add(jbAgregarImagen);
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
        
        setTitle("Agregar Productos");        
        setSize(630, 700);
        setResizable(false);
        setLocationRelativeTo(null);        
    }    
}
