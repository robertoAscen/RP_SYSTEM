/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rascencio
 */
public class JFrameMain extends JFrame
{
    
    private JPanel jpContenedor;
    private TitledBorder ttbContenedor;
    public JButton jbCrearNP;
    public JButton jbViewProduct;
    private ImageIcon imageIconAdd;
    private ImageIcon imageIconView;
    private ImageIcon imageIconEneri;
    private JLabel jlImagenEneri;
            
    public JFrameMain()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        setLayout(null);
        
        jpContenedor = new JPanel();
        ttbContenedor = new TitledBorder("Menú Principal");
        jbCrearNP = new JButton();
        jbViewProduct = new JButton();
        
        imageIconAdd = new ImageIcon("/home/rascencio/Desktop/WORK/SW-PROJECTS/drugStoreSystem/src/main/resources/img/Add 32X32.png");
        imageIconView = new ImageIcon("/home/rascencio/Desktop/WORK/SW-PROJECTS/drugStoreSystem/src/main/resources/img/refresh 32X32.png");
        imageIconEneri = new ImageIcon("/home/rascencio/Desktop/WORK/SW-PROJECTS/drugStoreSystem/src/main/resources/img/salutem.png");
        
        jlImagenEneri = new JLabel();
        
        jpContenedor.setLayout(null);
        jpContenedor.setBorder(ttbContenedor);
        jpContenedor.setBounds(10, 10, 420, 370);
        
        jbCrearNP.setText("Crear Producto");
        jbCrearNP.setToolTipText("Agregar un producto");
        jbCrearNP.setIcon(imageIconAdd);
        jbCrearNP.setBounds(20, 300, 180, 50);
        
        jbViewProduct.setText("Ver Productos");
        jbViewProduct.setToolTipText("Ver los productos de la base de datos");
        jbViewProduct.setIcon(imageIconView);
        jbViewProduct.setBounds(220, 300, 180, 50);
        
        jlImagenEneri.setIcon(imageIconEneri);
        jlImagenEneri.setBounds(90, 30, 250, 250);
        
        add(jpContenedor);
        jpContenedor.add(jbCrearNP);
        jpContenedor.add(jbViewProduct);
        jpContenedor.add(jlImagenEneri);
        
        setSize(445, 420);
        setResizable(false);        
        setTitle("Salutem");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
}
