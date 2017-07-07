/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.modelo;

import java.util.ArrayList;

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
    
    public ArrayList listOfTalbe();
    
    public int deleteInTable(String uno);
    
    public int editInTable(String uno);
    
    public int editInTable(String uno, String dos);
    
    public int editInTable(String uno, String dos, String tres);
    
    public int editInTable(String uno, String dos, String tres, String cuatro);
    
    public ArrayList findInTable(String uno);
}
