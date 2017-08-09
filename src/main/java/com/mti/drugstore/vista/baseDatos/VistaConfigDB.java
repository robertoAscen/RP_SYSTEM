/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.vista.baseDatos;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author RAscencio
 */
public class VistaConfigDB extends JFrame
{
    private JPanel jpDatos;
    private TitledBorder ttbDatos;
    
    private JLabel jlHost;
    private JLabel jlPuerto;
    private JLabel jlUsuario;
    private JLabel jlNombreDB;
    private JLabel jlPassDB;
    
    private JLabel jlImgDB;
    
    public JTextField jtfHost;
    public JTextField jtfPuerto;
    public JTextField jtfUsuario;
    public JTextField jtfNombreDB;
    public JPasswordField jtfPassDB;
    
    public JButton jbGuardar;
    public JButton jbCrearDB;
    
    private String pathImageIcons = "src/main/resources/img/icons/";

    public VistaConfigDB()
    {
        initComponents();
    }

    public void initComponents()
    {
        setLayout(null);
        
        ttbDatos = new TitledBorder("Configuración DB");
        jpDatos = new JPanel();
        jpDatos.setLayout(null);
        jpDatos.setBorder(ttbDatos);
        //jpDatos.setBounds(10, 10, 720, 405);
        jpDatos.setBounds(10, 10, 720, 330);
        add(jpDatos);
        
        jlHost = new JLabel();
        jlHost.setText("Host");
        jlHost.setBounds(10, 20, 100, 25);
        jpDatos.add(jlHost);
        
        jtfHost = new JTextField();
        jtfHost.setBounds(120, 20, 150, 25);
        jpDatos.add(jtfHost);
        
        jlPuerto = new JLabel();
        jlPuerto.setText("Puerto");
        jlPuerto.setBounds(10, 65, 100, 25);
        jpDatos.add(jlPuerto);
        
        jtfPuerto = new JTextField();
        jtfPuerto.setBounds(120, 65, 150, 25);
        jpDatos.add(jtfPuerto);
        
        jlUsuario = new JLabel();
        jlUsuario.setText("Usuario");
        jlUsuario.setBounds(10, 110, 100, 25);
        jpDatos.add(jlUsuario);
        
        jtfUsuario = new JTextField();
        jtfUsuario.setBounds(120, 110, 150, 25);
        jpDatos.add(jtfUsuario);
        
        jlNombreDB = new JLabel();
        jlNombreDB.setText("Nombre DB");
        jlNombreDB.setBounds(10, 155, 100, 25);
        jpDatos.add(jlNombreDB);
        
        jtfNombreDB = new JTextField();
        jtfNombreDB.setBounds(120, 155, 150, 25);
        jpDatos.add(jtfNombreDB);        
        
        jlPassDB = new JLabel();
        jlPassDB.setText("Password");
        jlPassDB.setBounds(10, 200, 100, 25);
        jpDatos.add(jlPassDB);
        
        jtfPassDB = new JPasswordField();
        jtfPassDB.setBounds(120, 200, 150, 25);
        jpDatos.add(jtfPassDB);  

        jlImgDB = new JLabel();
        jlImgDB.setIcon(new ImageIcon(pathImageIcons+"mysqlB.png"));
        //jlImgDB.setBounds(260, 80, 400, 320);
        jlImgDB.setBounds(255, 10, 400, 320);
        jpDatos.add(jlImgDB);

        jbGuardar = new JButton();
        jbGuardar.setText("Guardar");
        jbGuardar.setIcon(new ImageIcon(pathImageIcons+"Guardar.png"));
	jbGuardar.setBounds(530, 20, 175, 55);
        jpDatos.add(jbGuardar);
        
        jbCrearDB = new JButton();
        jbCrearDB.setText("Crear DB");
        jbCrearDB.setIcon(new ImageIcon(pathImageIcons+"databaseC.png"));
	jbCrearDB.setBounds(530, 90, 175, 55);
        jpDatos.add(jbCrearDB);
        
        setTitle("Configuración DB");        
        //setSize(745, 450);
        setSize(745, 380);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
