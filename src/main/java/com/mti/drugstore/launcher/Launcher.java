/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.launcher;

import com.mti.drugstore.controlador.ControCrear;
import com.mti.drugstore.controlador.ControMain;
import com.mti.drugstore.modelo.MedicamentoDAO;
import com.mti.drugstore.vista.JFrameMain;
import com.mti.drugstore.vista.ViewCreate;

/**
 *
 * @author rascencio
 */
public class Launcher 
{
    
    public static void main(String[] args)
    {
        JFrameMain frameMain = new JFrameMain();
        ControMain controMain = new ControMain(frameMain);        
        frameMain.setVisible(true);
    }    
}
