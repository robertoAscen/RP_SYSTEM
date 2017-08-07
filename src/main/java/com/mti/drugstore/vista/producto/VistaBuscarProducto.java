/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.vista.producto;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rascencio
 */
public class VistaBuscarProducto extends JFrame
{    
    private Border lowerBorder;
    private TitledBorder titleTableObj;
	
    private JPanel jpIzq;//Panel Izquierdo    
    public JButton jb_1;
    public JButton jb_2;
    public JButton jb_3;    
    public JButton jb_4; 
    private JLabel jlImageObj;
    
    private JPanel jpUp;//Panel arriba    
    private JLabel jlFindObj;
    public JTextField jtfFindObj;
    
    private JPanel jpTableObj;
    private DefaultTableModel tableModel;
    public JTable jTable;
    private JScrollPane jScrollPane;
    
    private String pathImageIcons = "src/main/resources/img/icons/";
    private String pathImageIconsMin = "src/main/resources/img/iconsMin/";
    private String pathImageSalutem = "src/main/resources/img/imageSalutem/";
    
    public VistaBuscarProducto()
    {
        getVentana();
    }
        
    public void getVentana()
    {
        setLayout(null);
        
        lowerBorder = BorderFactory.createLoweredBevelBorder();
        
        jpIzq = new JPanel();
        jpIzq.setLayout(null);
        jpIzq.setBorder(lowerBorder);
        jpIzq.setBounds(10, 10, 215, 550);
        add(jpIzq);
        
        jb_1 = new JButton();
        jb_1.setText("Nuevo");
        jb_1.setIcon(new ImageIcon(pathImageIcons+"nuevoProducto.png"));
        jb_1.setBounds(20, 20, 175, 55);
        jpIzq.add(jb_1);
        
        jb_2 = new JButton();
        jb_2.setText("Listar");
        jb_2.setIcon(new ImageIcon(pathImageIcons+"listar.png"));
        jb_2.setBounds(20, 105, 175, 55);
        jpIzq.add(jb_2);
        
        jb_3 = new JButton();
        jb_3.setText("Ver");
        jb_3.setIcon(new ImageIcon(pathImageIcons+"ver.png"));
        jb_3.setBounds(20, 190, 175, 55);
        jb_3.setEnabled(false);
        jpIzq.add(jb_3);
        
        jb_4 = new JButton();
        jb_4.setText("Eliminar");
        jb_4.setIcon(new ImageIcon(pathImageIcons+"trash.png"));
        jb_4.setBounds(20, 280, 175, 55);
        jb_4.setEnabled(false);
        jpIzq.add(jb_4);
        
        jlImageObj = new JLabel();
        jlImageObj.setText("Imagen Obj");
        jlImageObj.setIcon(new ImageIcon(pathImageIcons+"product128x128.png"));
        jlImageObj.setBounds(40, 400, 130, 130);
        jpIzq.add(jlImageObj);
        
        jpUp = new JPanel();
        jpUp.setLayout(null);
        jpUp.setBorder(lowerBorder);
        jpUp.setBounds(235, 10, 850, 60);
        add(jpUp);
        
        jlFindObj = new JLabel();
        jlFindObj.setText("BUSCAR PRODUCTO");
        jlFindObj.setBounds(10, 10, 150, 15);
        jpUp.add(jlFindObj);      
        
        jtfFindObj = new JTextField();
        jtfFindObj.setBounds(10, 30, 830, 25);
        jpUp.add(jtfFindObj);
        
        titleTableObj = new TitledBorder("Productos");
        jpTableObj = new JPanel();
        jpTableObj.setLayout(null);
        jpTableObj.setBorder(titleTableObj);
        jpTableObj.setBounds(235, 80, 850, 480);
        add(jpTableObj);
        
        tableModel = new DefaultTableModel(
        new Object [][] 
        {
            {null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null}
        },
        new String []
        {
            "CÓDIGO BARRAS", "NOMBRE", "FABRICANTE", "PRESENTACIÓN"
        })
        {
            boolean[] canEdit = new boolean [] 
            {
                false, false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        };
        
        jTable = new JTable();
        jTable.setModel(tableModel);
        jTable.setEnabled(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jTable);
        if(jTable.getColumnModel().getColumnCount()>0)
        {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
        }           
        
        jScrollPane.setBounds(10, 20, 830, 450);
        jpTableObj.add(jScrollPane);    
        
        setTitle("Productos");        
        setSize(1100, 600);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
