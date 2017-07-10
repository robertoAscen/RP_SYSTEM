/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.launcher;

import com.mti.drugstore.controlador.ControlatorMedCreate;
import com.mti.drugstore.modelo.MedicamentoDAO;
import com.mti.drugstore.vista.ViewCreate;

/**
 *
 * @author rascencio
 */
public class Launcher 
{
    
    public static void main(String[] args)
    {
        ViewCreate vistaCrear = new ViewCreate();
        MedicamentoDAO medDAO = new MedicamentoDAO();
        ControlatorMedCreate cmc = new ControlatorMedCreate(vistaCrear, medDAO);
        
        vistaCrear.setVisible(true);
        vistaCrear.setTitle("Salutem");
        vistaCrear.setLocationRelativeTo(null);
    }
    
}
