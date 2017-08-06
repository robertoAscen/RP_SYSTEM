/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.vista.producto;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rascencio
 */
public class VistaEditarProducto extends JFrame
{
    private JPanel jpDetalleProducto;
    private JPanel jpImagenProducto;
    private JPanel jpFormula;
    private TitledBorder ttbDetalleProducto;
    private TitledBorder ttbImagenProducto;
    private TitledBorder ttbFormula;

    private JLabel jlCodigoBarrasProducto;
    private JLabel jlNombreProducto;
    private JLabel jlFabricanteProducto;
    private JLabel jlCantNeta;
    private JLabel jlPresentacion;
    private JLabel jlCantMed;
    private JLabel jlUmMed;   

    private JTextField jtfCodigoBarrasProducto;
    private JTextField jtfNombreProducto;
    private JTextField jtfFabricanteProducto;
    private JTextField jtfCantNeta;
    private JTextField jtfPresentacion;
    private JTextField jtfCantMed;
    private JTextField jtfUmMed;

    private JLabel jlImagen;

    private JTable jtFormula;
    private JScrollPane jScrollPane;

    private JButton jbGuardar;
    private JButton jbEditar;
    
    private String pathIcons = "/home/rascencio/Desktop/WORK/SW-PROJECTS/drugStoreSystem/src/main/resources/img/";
    
    public VistaEditarProducto()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        setLayout(null);
        
        ttbDetalleProducto = new TitledBorder("Detalle Producto");
        
        jpDetalleProducto = new JPanel();
        jpDetalleProducto.setLayout(null);
        jpDetalleProducto.setBorder(ttbDetalleProducto);
        jpDetalleProducto.setBounds(10, 10, 780, 150);
        add(jpDetalleProducto);               
        
        jlCodigoBarrasProducto = new JLabel();
        jlCodigoBarrasProducto.setText("Código Barras");
        jlCodigoBarrasProducto.setBounds(10, 20, 100, 25);
        jpDetalleProducto.add(jlCodigoBarrasProducto);
        
        jtfCodigoBarrasProducto = new JTextField();
        jtfCodigoBarrasProducto.setBounds(120, 20, 130, 25);
        jpDetalleProducto.add(jtfCodigoBarrasProducto);
        
        jlNombreProducto = new JLabel();
        jlNombreProducto.setText("Nombre Med");
        jlNombreProducto.setBounds(270, 20, 100, 25);
        jpDetalleProducto.add(jlNombreProducto);
        
        jtfNombreProducto = new JTextField();
        jtfNombreProducto.setBounds(380, 20, 130, 25);
        jpDetalleProducto.add(jtfNombreProducto);
        
        jlFabricanteProducto = new JLabel();
        jlFabricanteProducto.setText("Nombre Lab");
        jlFabricanteProducto.setBounds(530, 20, 100, 25);
        jpDetalleProducto.add(jlFabricanteProducto);
        
        jtfFabricanteProducto = new JTextField();
        jtfFabricanteProducto.setBounds(640, 20, 130, 25);
        jpDetalleProducto.add(jtfFabricanteProducto);
        
        jlCantNeta = new JLabel();
        jlCantNeta.setText("Cantidad N");
        jlCantNeta.setBounds(10, 60, 100, 25);
        jpDetalleProducto.add(jlCantNeta);
        
        jtfCantNeta = new JTextField();
        jtfCantNeta.setBounds(120, 60, 130, 25);
        jpDetalleProducto.add(jtfCantNeta);
        
        jlPresentacion = new JLabel();
        jlPresentacion.setText("Presentación");
        jlPresentacion.setBounds(270, 60, 100, 25);
        jpDetalleProducto.add(jlPresentacion);
        
        jtfPresentacion = new JTextField();
        jtfPresentacion.setBounds(380, 60, 130, 25);
        jpDetalleProducto.add(jtfPresentacion);
        
        jlCantMed = new JLabel();
        jlCantMed.setText("Cantidad Med");
        jlCantMed.setBounds(530, 60, 100, 25);
        jpDetalleProducto.add(jlCantMed);
        
        jtfCantMed = new JTextField();
        jtfCantMed.setBounds(640, 60, 130, 25);
        jpDetalleProducto.add(jtfCantMed);
        
        jlUmMed = new JLabel();     
        jlUmMed.setText("Cantidad N");
        jlUmMed.setBounds(10, 100, 100, 25);
        jpDetalleProducto.add(jlUmMed);
        
        jtfUmMed = new JTextField();
        jtfUmMed.setBounds(120, 100, 130, 25);
        jpDetalleProducto.add(jtfUmMed);
        
        ttbFormula = new TitledBorder("Formula");
        jpFormula = new JPanel();
        jpFormula.setLayout(null);
        jpFormula.setBorder(ttbFormula);
        jpFormula.setBounds(10, 170, 780, 250);
        add(jpFormula);
        
        jtFormula = new JTable();
        jtFormula.setModel(new DefaultTableModel(
        new Object[] []
        {
        	{null, null, null, null},
        	{null, null, null, null},
        	{null, null, null, null},
        	{null, null, null, null},
        	{null, null, null, null}
        },
        new String []
        {
        	"MEDICAMENTO", "SUSTANCIA ACTIVA", "CONTENIDO", "UNIDAD MEDIDA"
        })
        {
        	boolean[] cantEdit = new boolean[]
        	{
        		false, false, false, false
        	};
        
        	public boolean isCellEditable(int rowIndex, int columnIndex)
        	{
        		return cantEdit[columnIndex];
        	}
        });
        
        jtFormula.getTableHeader().setReorderingAllowed(false);
        jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jtFormula);
        if(jtFormula.getColumnModel().getColumnCount()>0)
        {
        	jtFormula.getColumnModel().getColumn(0).setResizable(false);
        	jtFormula.getColumnModel().getColumn(1).setResizable(false);
        	jtFormula.getColumnModel().getColumn(2).setResizable(false);
        	jtFormula.getColumnModel().getColumn(3).setResizable(false);
        }
        jScrollPane.setBounds(10, 20, 760, 220);
        jpFormula.add(jScrollPane);
        

        ttbImagenProducto = new TitledBorder("Imagen Producto");
        jpImagenProducto = new JPanel();
        jpImagenProducto.setLayout(null);
        jpImagenProducto.setBorder(ttbImagenProducto);
        jpImagenProducto.setBounds(10, 430, 400, 280);
        add(jpImagenProducto); 
        
        jlImagen = new JLabel();
        jlImagen.setText("Aquí va la imagen de producto");
        //jlImagen.setIcon(new ImageIcon());
        jlImagen.setBounds(10, 10, 380, 270);
        jpImagenProducto.add(jlImagen);
        
        jbEditar = new JButton();
        jbEditar.setText("EDITAR");
        jbEditar.setIcon(new ImageIcon(pathIcons+"icons/edit128x128.png"));
        jbEditar.setBounds(420, 437, 370, 130);
        add(jbEditar);
        
        jbGuardar = new JButton();
        jbGuardar.setText("GUARDAR");
        jbGuardar.setIcon(new ImageIcon(pathIcons+"icons/save128x128.png"));
        jbGuardar.setBounds(420, 577, 370, 130);
        add(jbGuardar);
        
        setTitle("Editar Producto");        
        setSize(800, 745);
        setResizable(false);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
