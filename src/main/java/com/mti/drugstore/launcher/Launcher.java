/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.launcher;

import com.mti.drugstore.controlador.principal.CtrlMenuPrincipal;
import com.mti.drugstore.vista.principal.VistaMenuPrincipal;



/**
 *
 * @author rascencio
 */
public class Launcher 
{
    
    public static void main(String[] args)
    {
        VistaMenuPrincipal menuPrincipal = new VistaMenuPrincipal();
        CtrlMenuPrincipal controMainMenu = new CtrlMenuPrincipal(menuPrincipal);
        
        menuPrincipal.setVisible(true);
    }    
}
