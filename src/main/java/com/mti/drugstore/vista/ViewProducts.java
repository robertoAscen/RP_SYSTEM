/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
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
public class ViewProducts extends JFrame
{
    public ViewProducts()
    {
        initComponents();
    }
        
    public void initComponents()
    {
        setLayout(null);
        
        setSize(900, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
}
