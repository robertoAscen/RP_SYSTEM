/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.modelo;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author rascencio
 */
public interface CRUD 
{
    public String insertInTable(String uno);
    
    public String insertInTable(String uno, String dos);
    
    public String insertInTable(String uno, String dos, String tres);
    
    public String insertInTable(String uno, String dos, String tres, String cuatro);  
    
    //public String insertInTable(String uno, String dos, String tres, String cuatro, String cinco);  
    
    public String insertInTable(String uno, String dos, String tres, String cuatro, String cinco, String seis, int siete);  
    
    public String insertInTable(String uno, String dos, String tres, String cuatro, String cinco, String seis, String siete, String ocho, String nueve);
    
    public ArrayList listOfTalbe();
    
    public int deleteInTable(String uno);
    
    public int editInTable(String uno);
    
    public int editInTable(String uno, String dos);
    
    public int editInTable(String uno, String dos, String tres);
    
    public int editInTable(String uno, String dos, String tres, String cuatro);
    
    public String findInTablee(String uno);
    
    public ArrayList findInTable(String uno);
    
    public DefaultComboBoxModel findInTable();    
    
}
