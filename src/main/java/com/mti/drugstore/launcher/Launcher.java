/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.launcher;

import com.mti.drugstore.controlador.ControMainMenu;
import com.mti.drugstore.vista.ViewMainMenu;

/**
 *
 * @author rascencio
 */
public class Launcher 
{
    
    public static void main(String[] args)
    {
        ViewMainMenu menuPrincipal = new ViewMainMenu();
        ControMainMenu controMainMenu = new ControMainMenu(menuPrincipal);
        
        menuPrincipal.setVisible(true);
    }    
}
