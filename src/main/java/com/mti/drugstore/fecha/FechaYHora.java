/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.fecha;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rascencio
 */
public class FechaYHora 
{
    private Calendar calendario;
    private Date HoraActual;
    private Date fechaActual;
    private DateFormat formatter;
	
    public String getHoraActual()
    {
	String horaCompleta;
	String hora;
	String min;
	String seg;
	String ampm;
	
	calendario = Calendar.getInstance();
	HoraActual = calendario.getTime();
	
	calendario.setTime(HoraActual);
	ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
		
	if(ampm.equals("PM"))
	{
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
	}
	else
	{
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
	}
		
	min = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
	seg = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
			
	return horaCompleta = hora+":"+min+":"+seg+" "+ampm;
    }
	
    public String getFechaActual()
    {
	String strFechaActual=null;
	
	calendario = Calendar.getInstance();
	fechaActual = calendario.getTime();
	formatter = DateFormat.getDateInstance();
	
	return strFechaActual = formatter.format(fechaActual);
    }    
}
